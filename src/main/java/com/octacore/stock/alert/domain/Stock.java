package com.octacore.stock.alert.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String code;
	private BigDecimal marketValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

}
