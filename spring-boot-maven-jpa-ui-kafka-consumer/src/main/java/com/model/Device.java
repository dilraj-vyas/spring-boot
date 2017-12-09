package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "hello")
public class Device  implements Serializable {

	private static final long serialVersionUID = -254830618567945985L;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int deviceId;
	private String deviceName;
	private String deviceDescription;
	private String deviceIp;
	private String nodeName;
	private String terminalIpAddres;
	private int port;

	public Device() {
	}

	public Device(String deviceName, String deviceDescription, String deviceIp,
			String nodeName, String terminalIpAddres, int port) {
		super();
		this.deviceName = deviceName;
		this.deviceDescription = deviceDescription;
		this.deviceIp = deviceIp;
		this.nodeName = nodeName;
		this.terminalIpAddres = terminalIpAddres;
		this.port = port;
	}

	public Device(int id, String deviceName, String deviceDescription,
			String deviceIp, String nodeName, String terminalIpAddres, int port) {
		super();
		this.deviceId = id;
		this.deviceName = deviceName;
		this.deviceDescription = deviceDescription;
		this.deviceIp = deviceIp;
		this.terminalIpAddres = terminalIpAddres;
		this.nodeName = nodeName;
		this.port = port;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
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

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getTerminalIpAddres() {
		return terminalIpAddres;
	}

	public void setTerminalIpAddres(String terminalIpAddres) {
		this.terminalIpAddres = terminalIpAddres;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName
				+ ", deviceDescription=" + deviceDescription + ", deviceIp="
				+ deviceIp + ", nodeName=" + nodeName + ", terminalIpAddres="
				+ terminalIpAddres + ", port=" + port + "]";
	}

	
	
	
}
