package me.xiangchen.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import android.os.AsyncTask;
import android.util.Log;

public class xacUDPTask extends AsyncTask<String, Void, Void> {
	final static String ipToSend = "10.142.224.73";

	@Override
	protected Void doInBackground(String... arg0) {
		// TODO Auto-generated method stub
		DatagramSocket clientSocket;
		try {
			clientSocket = new DatagramSocket();
			InetAddress IPAddress = InetAddress.getByName(ipToSend);
			byte[] sendData = new byte[1024];
			
			String sentence = (String) arg0[0];
			sendData = sentence.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData,
					sendData.length, IPAddress, 1027);
			Log.d("UDPClient", sentence + ": " + sendData.length);
			clientSocket.send(sendPacket);
//			DatagramPacket receivePacket = new DatagramPacket(receiveData,
//					receiveData.length);
//			clientSocket.receive(receivePacket);
//			String modifiedSentence = new String(receivePacket.getData());
//			System.out.println("FROM SERVER:" + modifiedSentence);
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
