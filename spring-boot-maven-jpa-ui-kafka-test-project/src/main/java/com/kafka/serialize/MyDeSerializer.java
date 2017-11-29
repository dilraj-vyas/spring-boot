package com.kafka.serialize;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

public class MyDeSerializer implements Deserializer<Supplier> {
	private String encoding = "UTF8";

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public Supplier deserialize(String topic, byte[] data) {
		int sizeOfName;
		int sizeOfDate;
		if (data != null) {
			try {
				ByteBuffer buf = ByteBuffer.wrap(data);
				int id = buf.getInt();
				sizeOfName = buf.getInt();
				byte[] namebytes = new byte[sizeOfName];
				buf.get(namebytes);
				String deserializedName = new String(namebytes, encoding);
				sizeOfDate = buf.getInt();
				byte[] dateBytes = new byte[sizeOfDate];
				buf.get(dateBytes);
				String dateString = new String(dateBytes, encoding);
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				return new Supplier(id, deserializedName, dateString);

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
