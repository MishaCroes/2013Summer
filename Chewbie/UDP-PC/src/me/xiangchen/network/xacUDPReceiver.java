package me.xiangchen.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class xacUDPReceiver implements Runnable {
	final String ipToSend = "10.142.224.73";
	String strBuffer = "";

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			DatagramSocket serverSocket = new DatagramSocket(1027);
			byte[] receiveData = new byte[1024];
			byte[] sendData = new byte[1024];
			System.out.println("Server started");

			while (true) {
				DatagramPacket receivePacket = new DatagramPacket(receiveData,
						receiveData.length);
				serverSocket.receive(receivePacket);
				byte[] data = receivePacket.getData();
				String sentence = "";// new String(data, "UTF-8");
				
				int i = 0;
				do {
					if(i > data.length) break;
					sentence += (char)data[i];
				} while(data[++i] != 0);

				System.out.println("RECEIVED: " + sentence);
				strBuffer += (sentence + "\n");

				InetAddress IPAddress = receivePacket.getAddress();
				int port = receivePacket.getPort();
				String capitalizedSentence = sentence.toUpperCase();
				sendData = capitalizedSentence.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData,
						sendData.length, IPAddress, port);
				serverSocket.send(sendPacket);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getStrBuffer() {
		return strBuffer;
	}

}