package com.project.dto;

public class CovidData {

	private CountryData summary;
	
	private StateData[] regional;

	public CountryData getSummary() {
		return summary;
	}

	public void setSummary(CountryData summary) {
		this.summary = summary;
	}

	public StateData[] getRegional() {
		return regional;
	}

	public void setRegional(StateData[] regional) {
		this.regional = regional;
	}
}
