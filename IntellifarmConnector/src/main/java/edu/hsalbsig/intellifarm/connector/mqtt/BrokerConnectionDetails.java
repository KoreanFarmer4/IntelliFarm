package edu.hsalbsig.intellifarm.connector.mqtt;

public class BrokerConnectionDetails {
	private String ip;
	private int port;
	
	public BrokerConnectionDetails(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public int getPort() {
		return port;
	}
}
