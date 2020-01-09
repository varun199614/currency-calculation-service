package com.project2.microservices.currencycalculationservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project2.microservices.currencycalculationservice.beans.CalculatingBean;

	@RestController
	public class ExecutionController {
		@GetMapping("finalAmountValue/{fromCountry}/to/{toCountry}/value/{currency}")
		public CalculatingBean AmountValue(@PathVariable String fromCountry,@PathVariable String toCountry,@PathVariable double currency) {
			Map<String, String> uriVaribles=new HashMap<String, String>();
			uriVaribles.put("fromCountry",fromCountry );
			uriVaribles.put("toCountry",toCountry );
			ResponseEntity<CalculatingBean> responce=new RestTemplate().getForEntity("http://localhost:8000/exchangeValue/{fromCountry}/to/{toCountry}", CalculatingBean.class, uriVaribles);
			CalculatingBean endResult=responce.getBody();
			endResult.setCurrency(currency);
			endResult.AmountCalculater();
		
			return endResult;
		}
}
