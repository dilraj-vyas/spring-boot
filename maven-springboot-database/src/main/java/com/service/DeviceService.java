package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.repository.RepositoryService;
import com.to.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

	@Autowired
	private RepositoryService repoService;

	// private List<Device> devices = new ArrayList<Device>(Arrays.asList(
	// new Device("sx-12345", "SX-10", "audio video phone ",
	// "10.104.233.170"), new Device("sx-123456", "EX-90",
	// "audio video phone ", "10.104.233.173")));

	public void addDevice(Device device) {
		repoService.save(device);
	}

	public void deleteDevice(String id) {
		repoService.delete(id);
	}

	public List<Device> getAllDevices() {
		List<Device> devices = new ArrayList<Device>();
		Iterable<Device> itr = repoService.findAll();
		for (Device device : itr) {
			devices.add(device);
		}
		return devices;
	}

	public Device getDevice(String id) {
		return repoService.findOne(id);
	}

	public void updateDevice(Device device) {
		repoService.save(device);
	}
}
