package com.project2.microservices.currencycalculationservice.rescorceDAO;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project2.microservices.currencycalculationservice.beans.CalculatingBean;

//@FeignClient(name="current-convertionrate-service",url="http://localhost:8000")
@FeignClient(name="current-convertionrate-service")
@RibbonClient(name="current-convertionrate-service")
public interface feignProxyInterface {
	@GetMapping("exchangeValue/{exFrom}/to/{exTo}")
	public CalculatingBean ExchangeValue(@PathVariable String exFrom,@PathVariable String exTo);
}
