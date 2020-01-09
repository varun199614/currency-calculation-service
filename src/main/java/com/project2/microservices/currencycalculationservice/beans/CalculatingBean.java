package com.project2.microservices.currencycalculationservice.beans;

public class CalculatingBean {
	private int id;
	private String fromCountry;
	private String toCountry;
	private double exchangeRate;
	private String portNo;
	private double currency;
	private double currencyTotal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromCountry() {
		return fromCountry;
	}
	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}
	public String getToCountry() {
		return toCountry;
	}
	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getPortNo() {
		return portNo;
	}
	public void setPortNo(String portNo) {
		this.portNo = portNo;
	}
	public double getCurrency() {
		return currency;
	}
	public void setCurrency(double currency) {
		this.currency = currency;
	}
	public CalculatingBean(int id, String fromCountry, String toCountry, double exchangeRate, String portNo) {
		super();
		this.id = id;
		this.fromCountry = fromCountry;
		this.toCountry = toCountry;
		this.exchangeRate = exchangeRate;
		this.portNo = portNo;
	}
	public CalculatingBean() {
		super();
	}
	public double getCurrencyTotal() {
		return currencyTotal;
	}
	public void setCurrencyTotal(double currencyTotal) {
		this.currencyTotal = currencyTotal;
	}
	public void AmountCalculater() {
		currencyTotal=currency*exchangeRate;
	}
}
