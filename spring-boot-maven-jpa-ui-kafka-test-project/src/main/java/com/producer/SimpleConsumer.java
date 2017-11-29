package com.producer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.kafka.serialize.Supplier;

public class SimpleConsumer {

	public SimpleConsumer() {

	}

	public static void main(String[] args) throws Exception {
		String topicName = "test";
		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.deserializer",
				"org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("group.id", "supplierGroup");
		properties.put("value.deserializer",
				"com.kafka.serialize.MyDeSerializer");
		KafkaConsumer<String, Supplier> consumer = new KafkaConsumer<String, Supplier>(
				properties);
		consumer.subscribe(Arrays.asList(topicName));
		while (true) {
			ConsumerRecords<String, Supplier> records = consumer.poll(100);
			for (ConsumerRecord<String, Supplier> consumerRecord : records) {
				System.out
						.println("Supplier id :"
								+ String.valueOf(consumerRecord.value()
										.getSupplierId()) + " Name "
								+ consumerRecord.value().getSupplierName());
			}

		}
	}
}
