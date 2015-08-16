package com.octacore.stock.alert.domain;

import java.io.Serializable;

public class Alert implements Serializable {

	private static final long serialVersionUID = 1L;

	private AlertType type;
	private Integer frequencyPerDay;
	private AlertState state;

	public AlertType getType() {
		return type;
	}

	public void setType(AlertType type) {
		this.type = type;
	}

	public Integer getFrequencyPerDay() {
		return frequencyPerDay;
	}

	public void setFrequencyPerDay(Integer frequencyPerDay) {
		this.frequencyPerDay = frequencyPerDay;
	}

	public AlertState getState() {
		return state;
	}

	public void setState(AlertState state) {
		this.state = state;
	}

}
