package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeviceController {

	@GetMapping("login")
	public String showLoginPage(ModelMap model) {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model,
			@RequestParam String nodeName, @RequestParam String ipAddress,
			@RequestParam String terminalIp, String port) {

		// // boolean isValidUser = service.validateUser(name, password);
		//
		// if (!isValidUser) {
		// model.put("errorMessage", "Invalid Credentials");
		// return "login";
		// }
		//
		model.put("nodeName", nodeName);
		model.put("ipAddress", ipAddress);
		model.put("terminalIp", terminalIp);
		model.put("port", port);

		return "welcome";
	}

}
