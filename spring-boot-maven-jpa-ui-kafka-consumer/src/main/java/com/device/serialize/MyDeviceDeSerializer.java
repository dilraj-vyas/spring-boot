package com.device.serialize;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.model.Device;

public class MyDeviceDeSerializer implements Deserializer<Device> {
	private String encoding = "UTF8";

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {

	}

	@Override
	public Device deserialize(String topic, byte[] data) {
		
		int deviceId;
		int sizeOfDeviceName;
		int sizeOfDeviceDescription;
		int sizeOfDeviceIp;
		int sizeOfdeviceNodeName;
		int sizeOfTerminalipAddress;
		int port;
		
		if (data != null) {
			try {
				ByteBuffer buf = ByteBuffer.wrap(data);
				deviceId = buf.getInt();
				
				
				sizeOfDeviceName = buf.getInt();
				byte[] deviceNamebytes = new byte[sizeOfDeviceName];
				buf.get(deviceNamebytes);
				String deviceName = new String(deviceNamebytes, encoding);

				sizeOfDeviceDescription = buf.getInt();
				byte[] deviceDescriptionBytes = new byte[sizeOfDeviceDescription];
				buf.get(deviceDescriptionBytes);
				String deviceDescription = new String(deviceDescriptionBytes,
						encoding);
				
				sizeOfDeviceIp = buf.getInt();
				byte[] deviceIpBytes = new byte[sizeOfDeviceIp];
				buf.get(deviceIpBytes);
				String deviceIp = new String(deviceIpBytes, encoding);
				

				sizeOfdeviceNodeName= buf.getInt();
				byte[] deviceNodeNamebytes = new byte[sizeOfdeviceNodeName];
				buf.get(deviceNodeNamebytes);
				String nodeName = new String(deviceNodeNamebytes, encoding);
				
				sizeOfTerminalipAddress = buf.getInt();
				byte[] terminalipAddressbytes = new byte[sizeOfTerminalipAddress];
				buf.get(terminalipAddressbytes);
				String terminalIpAddres = new String(terminalipAddressbytes,
						encoding);

				port = buf.getInt();

				
				
				

				return new Device(deviceId, deviceName, deviceDescription,
						deviceIp, nodeName, terminalIpAddres, port);

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
