package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.model.Device;
import com.repository.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;

	public void addDevice(Device device) {
		deviceRepository.save(device);
	}

	public void deleteDevice(int id) {
		deviceRepository.delete(id);
	}

	public List<Device> getAllDevices() {
		
		List<Device> devices = new ArrayList<Device>();
		Iterable<Device> itr = deviceRepository.findAll();
		for (Device device : itr) {
			devices.add(device);
		}
		return devices;
	}

	public Device getDevice(int id) {
		 return deviceRepository.findOne(id);
	}

	public void updateDevice(Device device) {
		 deviceRepository.save(device);
	}
}
