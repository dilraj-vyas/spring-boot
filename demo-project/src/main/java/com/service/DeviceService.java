package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.to.*;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {

	private List<Device> devices = new ArrayList<Device>(Arrays.asList(
			new Device("sx-12345", "SX-10", "audio video phone ",
					"10.104.233.170"), new Device("sx-123456", "EX-90",
					"audio video phone ", "10.104.233.173")));

	public void addDevice(Device device) {
		devices.add(device);
	}

	public void deleteDevice(String id) {
		for (int i = 0; i < devices.size(); i++) {
			if (devices.get(i).getDeviceId().equals(id)) {
				devices.remove(i);
			}
		}
	}

	public List<Device> getAllDevices() {

		return devices;
	}

	public Device getDevice(String id) {
		for (Device device : devices) {
			if (device.getDeviceId().equals(id)) {
				return device;
			}
		}
		return null;
	}

	public void updateDevice(Device device, String id) {
		for (int i = 0; i < devices.size(); i++) {
			if (devices.get(i).getDeviceId().equals(id)) {
				devices.set(i, device);
			}
		}
	}
}
