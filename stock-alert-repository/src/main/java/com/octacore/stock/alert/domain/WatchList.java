package com.octacore.stock.alert.domain;

import java.io.Serializable;
import java.util.List;

public class WatchList implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private User user;
	private List<Stock> stocks;
	private Alert alert;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Alert getAlert() {
		return alert;
	}

	public void setAlert(Alert alert) {
		this.alert = alert;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
