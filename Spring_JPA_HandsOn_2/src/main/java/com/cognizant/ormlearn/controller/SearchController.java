package com.cognizant.ormlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@Controller
public class SearchController {
	@Autowired
	CountryService countryService;

	@GetMapping("/")
	public String searchPage(ModelMap map) {
		List<Country> countries = countryService.getAllCountriesSorted();
		map.put("countryList", countries);
		return "search";
	}

}
