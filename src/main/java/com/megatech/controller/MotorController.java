package com.megatech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.megatech.model.MotorTimeData;
import com.megatech.service.MotorService;


@RestController
@RequestMapping(value = "/tags")
public class MotorController {

	@Autowired
	private MotorService motorService;

	public MotorController() {
		System.out.println("MotorController()");
	}

	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String index() {
		return "Welcome to MotorIOt Site, It's developed Using Spring Boot and Cassandra";
	}

	// ################ get Entire Tag ####################
	@RequestMapping(value = "/gettag", method = RequestMethod.GET)
	public Iterable<MotorTimeData> getTimeData() {
		System.out.println("Get Entire Tag");
		return motorService.getTimeData();
	}

	// ################ get Tag by Id ####################
	@RequestMapping(value = "/gettag/{tagId}", method = RequestMethod.GET)
	public Iterable<MotorTimeData> getTagsById(@PathVariable List<String> tagId) {
		System.out.println("Get Tag By Given ID");
		return motorService.getTag(tagId);
	}

	// ################ get Tag Value between Dates by tagId
	// ####################
	@RequestMapping(value = "/gettag/{tagid}/{startdate}/{enddate}", method = RequestMethod.GET)
	public Iterable<MotorTimeData> getTagByDate(@PathVariable List<String> tagid, @PathVariable Long startdate,
			@PathVariable Long enddate) {
		System.out.println("get Tag Value between Dates by tagid");
		return motorService.getTagByDate(tagid, startdate, enddate);
	}

}