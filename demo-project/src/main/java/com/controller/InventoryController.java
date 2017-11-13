package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.DeviceService;
import com.to.Device;

@RestController
public class InventoryController {

	@Autowired
	private DeviceService deviceService;

	@RequestMapping("allDevice")	
	public List<Device> getAllDevice() {
		return deviceService.getAllDevices();
	}

}
