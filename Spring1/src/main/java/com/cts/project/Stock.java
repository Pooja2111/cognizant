package com.cts.project;

import java.io.Serializable;

public class Stock implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long stockId;
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	private String stockCode;
	private String stockName;

	//getter and setter methods.
}
