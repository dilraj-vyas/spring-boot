package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceController {

	@GetMapping("/add")
	public String addDevice() {
		return "index";
	}

}
