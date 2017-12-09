package com.service;

import org.springframework.kafka.annotation.KafkaListener;

import com.model.Device;

public class DeviceConsumer {
	@KafkaListener(topics = "${jsa.kafka.topic}")
	public void processMessage(Device device) {
		System.out.println("received content = " + device);
	}
}
