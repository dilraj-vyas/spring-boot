package com.producer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.model.Device;

public class SimpleProducerFireAndForget {

	private static Producer<String, Device> producer;

	public SimpleProducerFireAndForget() {

	}

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
//		Properties properties = new Properties();
//		properties.put("bootstrap.servers", "localhost:9092");
//		properties.put("key.serializer",
//				"org.apache.kafka.common.serialization.StringSerializer");
//		properties.put("value.serializer", "com.kafka.serialize.MySerializer");
//		
//		producer = new KafkaProducer<String, Supplier>(properties);
//		String topic = "hello";
//
//		Supplier sp1 = null;
//		Supplier sp2 = null;
//		sp1 = new Supplier(101, "A2B Construction", "2016-04-01");
//		sp2 = new Supplier(102, "Birla Construction", "2016-05-05");
//
//		producer.send(new ProducerRecord<String, Supplier>(topic, sp1)).get();
//		producer.send(new ProducerRecord<String, Supplier>(topic, sp2)).get();
//
//		producer.close();
//		Device device1 = new Device();
//		device1.setDeviceName("SX-10");
//		device1.setDeviceIp("10.104.23.1");
//		produce(device1);
		
	}
public static void produce(Device device)
{
	

	Properties properties = new Properties();
	properties.put("bootstrap.servers", "localhost:9092");
	properties.put("key.serializer",
			"org.apache.kafka.common.serialization.StringSerializer");
	properties.put("value.serializer", "com.device.serialize.DeviceSerializer");
	
	producer = new KafkaProducer<String, Device>(properties);
	String topic = "hello";

	
//	sp1 = new Supplier(101, "A2B Construction", "2016-04-01");

	try {
		producer.send(new ProducerRecord<String, Device>(topic, device)).get();
	} catch (InterruptedException e) {
		e.printStackTrace();
	} catch (ExecutionException e) {
		e.printStackTrace();
	}

	producer.close();
}

}
