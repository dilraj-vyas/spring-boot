package com.kafka.serialize;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

public class MySerializer implements Serializer<Supplier> {
	private String encoding = "UTF8";

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public byte[] serialize(String topic, Supplier data) {
		int sizeOfName;
		int sizeOfDate;
		byte[] serializedName;
		byte[] serializedDate;
		if (data != null) {
			try {
				serializedName = data.getSupplierName().getBytes(encoding);
				sizeOfName = serializedName.length;
				serializedDate = data.getSupplierStartDate().toString()
						.getBytes(encoding);
				sizeOfDate = serializedDate.length;
				ByteBuffer buf = ByteBuffer.allocate(4 + 4 + sizeOfName + 4
						+ sizeOfDate);
				buf.putInt(data.getSupplierId());
				buf.putInt(sizeOfName);
				buf.put(serializedName);
				buf.putInt(sizeOfDate);
				buf.put(serializedDate);

				return buf.array();

			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
