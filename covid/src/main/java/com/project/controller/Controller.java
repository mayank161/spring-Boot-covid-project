package com.project.controller;

import com.project.dto.CountryData;
import com.project.dto.CovidApi;
import com.project.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.DataProvider;

@RestController
public class Controller {

	@Autowired
	DataProvider data;


	@GetMapping({"/completeData"})
	public CovidApi dataSource() {
		return data.source();
	}

	@GetMapping({"/india"})
	public CountryData totalIndianCases() {
		return data.india();
	}

	@GetMapping({"/state/{state}"})
	public StateData state(@PathVariable String state) {
		return data.state(state);
	}
}
