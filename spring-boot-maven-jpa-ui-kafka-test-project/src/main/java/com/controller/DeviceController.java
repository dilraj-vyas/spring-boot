package com.controller;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Device;
import com.producer.SimpleProducerFireAndForget;
import com.service.DeviceService;

@Controller
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	@Autowired
	private KafkaTemplate<String, Device> kafkaTemplate;

	@GetMapping("deviceRegistration")
	public String showLoginPage(Model model) {
		model.addAttribute("deviceForm", new Device());
		return "deviceRegistration";
	}

	@RequestMapping(value = "/deviceRegistration", method = RequestMethod.POST)
	public String deviceRegistration(
			@ModelAttribute("deviceForm") Device deviceForm, Model model) {

		if (deviceForm != null) {
			String topic = "hello";
			kafkaTemplate.send(new ProducerRecord<String, Device>(topic,
					deviceForm));

			model.addAttribute("msg", "Device Added Successfully to kafka");
		} else
			model.addAttribute("msg", "There is a problem inserting device");
		return "home";
	}
//	https://www.codenotfound.com/spring-kafka-json-serializer-deserializer-example.html
}
