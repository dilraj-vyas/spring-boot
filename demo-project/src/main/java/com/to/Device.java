package com.to;

public class Device {

	private String deviceId;
	private String deviceName;
	private String deviceDescription;
	private String deviceIp;

	public Device() {
	}

	public Device(String deviceId, String deviceName, String deviceDescription,
			String deviceIp) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceDescription = deviceDescription;
		this.deviceIp = deviceIp;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceDescription() {
		return deviceDescription;
	}

	public void setDeviceDescription(String deviceDescription) {
		this.deviceDescription = deviceDescription;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

}
