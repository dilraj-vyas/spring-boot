package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Device;
import com.producer.SimpleProducerFireAndForget;
import com.service.DeviceService;

@RestController
public class InventoryController {

	@Autowired(required = true)
	private DeviceService deviceService;


	/*
	 * @RequestMapping("/allDevice") public List<Device> getAllDevice() { return
	 * deviceService.getAllDevices(); }
	 * 
	 * @RequestMapping("/device/{id}") public Device getdeviceById(@PathVariable
	 * int id) { return deviceService.getDevice(id);
	 * 
	 * }
	 * 
	 * @RequestMapping("/deviceDetails") public Device getdevice() { return
	 * SimpleConsumer.consume(); // return deviceService.getDevice(id);
	 * 
	 * }
	 */

	@RequestMapping(method = RequestMethod.POST, value = "/devices")
	public void addDevice(@RequestBody Device device) {
		SimpleProducerFireAndForget producer=new SimpleProducerFireAndForget();
		producer.produce(device);
		// deviceService.addDevice(device);
	}
	/*
	 * @RequestMapping(value = "/add") public void addDevice() { Device
	 * device=new Device("SX-10", "audio Phone", "10.104.243.121");
	 * deviceService.addDevice(device); }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT, value = "/devices/{id}")
	 * public void updateDevice(@RequestBody Device device, @PathVariable String
	 * id) { deviceService.updateDevice(device); }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE, value = "/devices/{id}")
	 * public void deleteDevice(@PathVariable int id) {
	 * deviceService.deleteDevice(id); }
	 */
}
