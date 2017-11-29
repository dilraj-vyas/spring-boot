package com.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class SimpleProducerSyncronousSend {

	private static Producer<String, String> producer;

	public SimpleProducerSyncronousSend() {

	}

	public static void main(String[] args) {
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
					topic, key, msg);
			// asyncronous sender
			producer.send(record, new MyProducerCallback());
		}
		// producer.close();
	}
}

class MyProducerCallback implements Callback {

	@Override
	public void onCompletion(RecordMetadata metadata, Exception exception) {
		if (exception != null) {
			System.out.println("Asysncronous Producer failed with Exception");
		}

	}

}
