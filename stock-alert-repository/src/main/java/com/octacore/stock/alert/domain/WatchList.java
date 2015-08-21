package com.octacore.stock.alert.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WatchList implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private User user;
	private List<StockWatch> watchList;
	private Alert alert;
	private boolean notificationSent;

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

	public Alert getAlert() {
		return alert;
	}

	public void setAlert(Alert alert) {
		this.alert = alert;
	}

	public List<StockWatch> getWatchList() {
		if (watchList == null) {
			this.watchList = new ArrayList<StockWatch>();
		}
		return watchList;
	}

	public boolean isNotificationSent() {
		return notificationSent;
	}

}
