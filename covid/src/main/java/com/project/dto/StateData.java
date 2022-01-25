package com.project.dto;

public class StateData {

	private String loc;
    private int confirmedCasesIndian;
    private int confirmedCasesForeign;
    private int discharged;
    private int deaths;
    private int totalConfirmed;
    
    
	public StateData(String loc, int confirmedCasesIndian, int confirmedCasesForeign, int discharged, int deaths,
			int totalConfirmed) {
		super();
		this.loc = loc;
		this.confirmedCasesIndian = confirmedCasesIndian;
		this.confirmedCasesForeign = confirmedCasesForeign;
		this.discharged = discharged;
		this.deaths = deaths;
		this.totalConfirmed = totalConfirmed;
	}

	public StateData() {

	}


	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getConfirmedCasesIndian() {
		return confirmedCasesIndian;
	}
	public void setConfirmedCasesIndian(int confirmedCasesIndian) {
		this.confirmedCasesIndian = confirmedCasesIndian;
	}
	public int getConfirmedCasesForeign() {
		return confirmedCasesForeign;
	}
	public void setConfirmedCasesForeign(int confirmedCasesForeign) {
		this.confirmedCasesForeign = confirmedCasesForeign;
	}
	public int getDischarged() {
		return discharged;
	}
	public void setDischarged(int discharged) {
		this.discharged = discharged;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getTotalConfirmed() {
		return totalConfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}
}
