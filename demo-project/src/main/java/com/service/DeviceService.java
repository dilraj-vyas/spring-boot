package com.service;

import java.util.Arrays;
import java.util.List;

import com.to.*;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {

	private List<Device> devices = Arrays.asList(new Device("sx-12345",
			"SX-10", "audio video phone ", "10.104.233.170"), new Device(
			"sx-123456", "EX-90", "audio video phone ", "10.104.233.173"));

	public void addDevice() {

	}

	public void updateDevice() {

	}

	public void deleteDevice() {

	}

	public List<Device> getAllDevices() {

		return devices;
	}
}
