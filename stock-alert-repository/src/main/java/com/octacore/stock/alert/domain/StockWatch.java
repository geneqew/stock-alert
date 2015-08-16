package com.octacore.stock.alert.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class StockWatch implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Stock stock;
	private BigDecimal belowTargetPrice;
	private BigDecimal aboveTargetPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public BigDecimal getBelowTargetPrice() {
		return belowTargetPrice;
	}

	public void setBelowTargetPrice(BigDecimal belowTargetPrice) {
		this.belowTargetPrice = belowTargetPrice;
	}

	public BigDecimal getAboveTargetPrice() {
		return aboveTargetPrice;
	}

	public void setAboveTargetPrice(BigDecimal aboveTargetPrice) {
		this.aboveTargetPrice = aboveTargetPrice;
	}

}
