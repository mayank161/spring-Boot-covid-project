package com.project.dto;

import java.time.ZonedDateTime;

public class CovidApi {

	private boolean success;
	
	private CovidData data;
	
	private ZonedDateTime lastRefreshed;
	
	private ZonedDateTime lastOriginUpdate;
	

	public CovidApi(boolean success, CovidData data, ZonedDateTime lastRefreshed, ZonedDateTime lastOriginUpdate) {
		super();
		this.success = success;
		this.data = data;
		this.lastRefreshed = lastRefreshed;
		this.lastOriginUpdate = lastOriginUpdate;
	}

	public CovidApi() {

	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public CovidData getData() {
		return data;
	}

	public void setData(CovidData data) {
		this.data = data;
	}

	public ZonedDateTime getLastRefreshed() {
		return lastRefreshed;
	}

	public void setLastRefreshed(ZonedDateTime lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}

	public ZonedDateTime getLastOriginUpdate() {
		return lastOriginUpdate;
	}

	public void setLastOriginUpdate(ZonedDateTime lastOriginUpdate) {
		this.lastOriginUpdate = lastOriginUpdate;
	}
	
}
