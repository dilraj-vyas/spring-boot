package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.DeviceService;
import com.to.Device;

@RestController
@ComponentScan(basePackages = { "com.service" })
public class InventoryController {

	@Autowired(required = true)
	private DeviceService deviceService;

	@RequestMapping("/allDevice")
	public List<Device> getAllDevice() {
		return deviceService.getAllDevices();
	}

	@RequestMapping("/device/{id}")
	public Device getdeviceById(@PathVariable String id) {
		return deviceService.getDevice(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/devices")
	public void addDevice(@RequestBody Device device) {
		deviceService.addDevice(device);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/devices/{id}")
	public void updateDevice(@RequestBody Device device, @PathVariable String id) {
		deviceService.updateDevice(device, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/devices/{id}")
	public void deleteDevice(@PathVariable String id) {
		deviceService.deleteDevice(id);
	}
}
