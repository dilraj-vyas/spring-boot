package com.device.serialize;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.model.Device;

public class MyDeviceSerializer implements Serializer<Device> {
	private String encoding = "UTF8";

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public byte[] serialize(String topic, Device data) {

		int sizeOfdeviceName;
		int sizeOfDeviceDescription;
		int sizeOfDeviceIp;
		int sizeOfDeviceNodeName;
		int sizeOfTerminalIpAddres;

		byte[] serializedDeviceName;
		byte[] serializedDeviceDescription;
		byte[] serializedDeviceIp;
		byte[] serializedDeviceNodeName;
		byte[] serializedTerminalIpAddres;

		if (data != null) {
			try {
				int deviceId = data.getDeviceId();

				serializedDeviceName = data.getDeviceName().getBytes(encoding);
				sizeOfdeviceName = serializedDeviceName.length;

				serializedDeviceDescription = data.getDeviceDescription()
						.toString().getBytes(encoding);
				sizeOfDeviceDescription = serializedDeviceDescription.length;

				serializedDeviceIp = data.getDeviceIp().toString()
						.getBytes(encoding);
				sizeOfDeviceIp = serializedDeviceIp.length;

				serializedDeviceNodeName = data.getNodeName()
						.getBytes(encoding);
				sizeOfDeviceNodeName = serializedDeviceNodeName.length;

				serializedTerminalIpAddres = data.getTerminalIpAddres()
						.getBytes(encoding);
				sizeOfTerminalIpAddres = serializedTerminalIpAddres.length;

				ByteBuffer buf = ByteBuffer.allocate(sizeOfdeviceName + 4
						+ sizeOfDeviceDescription + sizeOfDeviceIp +4+sizeOfDeviceNodeName+sizeOfTerminalIpAddres+100);

				buf.putInt(deviceId);
				buf.putInt(sizeOfdeviceName);
				buf.put(serializedDeviceName);

				buf.putInt(sizeOfDeviceDescription);
				buf.put(serializedDeviceDescription);

				buf.putInt(sizeOfDeviceIp);
				buf.put(serializedDeviceIp);

				buf.putInt(sizeOfDeviceNodeName);
				buf.put(serializedDeviceNodeName);

				buf.putInt(sizeOfTerminalIpAddres);
				buf.put(serializedTerminalIpAddres);

				buf.putInt(data.getPort());

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
