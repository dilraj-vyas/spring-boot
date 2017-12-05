package com.device.serialize;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Device;

public class DeviceDeSerializer implements Deserializer<Device> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public Device deserialize(String topic, byte[] data) {

//		ObjectMapper mapper = new ObjectMapper();
//		Device device = null;
//		try {
//			device = mapper.readValue(data, Device.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		return device;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
