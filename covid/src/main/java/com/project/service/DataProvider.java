package com.project.service;

import com.project.dto.CountryData;
import com.project.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.dto.CovidApi;

import java.util.Arrays;

@Service
public class DataProvider {
    
	@Autowired
	RestTemplate restTemplate;
	
	final String url = "https://api.rootnet.in/covid19-in/stats/latest";

	public CovidApi source() {
		CovidApi covidapi = restTemplate.getForObject(url, CovidApi.class);
		return covidapi;
	}

	public CountryData india() {
		CovidApi covidapi = restTemplate.getForObject(url, CovidApi.class);
		return covidapi.getData().getSummary();
	}

	public StateData state(String state) {
		CovidApi covidapi = restTemplate.getForObject(url, CovidApi.class);

		return Arrays.stream(covidapi.getData().getRegional())
				.filter(e -> e.getLoc().equalsIgnoreCase(state))
				.findAny()
				.orElse(new StateData());
	}
}
