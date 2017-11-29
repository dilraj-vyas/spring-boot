package com.partitioner;

import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.PartitionInfo;

public class CustomPartition implements Partitioner {
	private String sensorNamme;

	@Override
	public void configure(Map<String, ?> configs) {
		sensorNamme = configs.get("sensor.name").toString();

	}

	@Override
	public int partition(String topic, Object key, byte[] keyBytes,
			Object value, byte[] valueBytes, Cluster cluster) {
		List<PartitionInfo> partitions=cluster.partitionsForTopic(topic);
		int numPatitions=partitions.size();
		
		return 0;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
