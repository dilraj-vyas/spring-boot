package com.consumer;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SimpleProducer {

	public SimpleProducer() {

	}

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		Producer<String, String> producer  = new KafkaProducer<String, String>(properties);
		String topic = "test";
		String key = "key1";
		String msg = "hhhhhhhhhhhhhgggggggggggggggggghhhhhhhhhhhh";
		
		for (int i = 0; i < 10; i++) {
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(
				topic,key, msg);
		producer.send(record);
		}
		producer.close();
	}
}
