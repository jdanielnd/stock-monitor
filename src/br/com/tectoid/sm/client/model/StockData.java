package br.com.tectoid.sm.client.model;

public class StockData {
	
	private String symbol;
	private String date;
	private double price;
	private String change;
	private String changePercentage;
	private double close;
	private double open;
	private double volume;
	private double high;
	private double low;
	
	public String getSymbol() {
		return symbol;
	}
	public String getDate() {
		return date;
	}
	public double getPrice() {
		return price;
	}
	public String getChange() {
		return change;
	}
	public String getChangePercentage() {
		return changePercentage;
	}
	public double getClose() {
		return close;
	}
	public double getOpen() {
		return open;
	}
	public double getVolume() {
		return volume;
	}
	public double getHigh() {
		return high;
	}
	public double getLow() {
		return low;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public void setChangePercentage(String chagePercentage) {
		this.changePercentage = chagePercentage;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public void setLow(double low) {
		this.low = low;
	}
	
	
}
