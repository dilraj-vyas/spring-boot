package com.device.serialize;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.kafka.common.serialization.Serializer;

import com.model.Device;

public class DeviceSerializer implements Serializer<Device> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public byte[] serialize(String topic, Device data) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(out, null);
		DatumWriter<Device> writer = new SpecificDatumWriter<Device>(
				Device.class);

		try {
			writer.write(data, encoder);
			encoder.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		byte[] serializedBytes = out.toByteArray();
		return serializedBytes;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
