package com.producer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SimpleProducerFireAndForget {

	private static Producer<String, String> producer;

	public SimpleProducerFireAndForget() {

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer",
				"org.apache.kafka.common.serialization.StringSerializer");
		
		producer = new KafkaProducer<String, String>(properties);
		String topic = "test";
		String key = "key1";
		String msg = "hhhhhhhhhhhsssssssssssssssshhggghhhhhhh";
		
		for (int i = 0; i < 10; i++) {
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(
				topic,key, msg);
		producer.send(record);
		}
//		producer.close();
	}
}
