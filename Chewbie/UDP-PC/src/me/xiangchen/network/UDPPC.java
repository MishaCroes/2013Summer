package me.xiangchen.network;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Calendar;

public class UDPPC{

	static String strBuffer = "";
	static xacUDPReceiver udpReceiver;

	public static void main(String args[]) throws Exception {
		
//		DatagramSocket serverSocket = new DatagramSocket(1027);
//        byte[] receiveData = new byte[1024];
//        byte[] sendData = new byte[1024];
//        System.out.println("Server started");
//        while(true)
//           {
//              DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//              serverSocket.receive(receivePacket);
//              String sentence = new String( receivePacket.getData());
//              System.out.println("RECEIVED: " + sentence);
//              InetAddress IPAddress = receivePacket.getAddress();
//              int port = receivePacket.getPort();
//              String capitalizedSentence = sentence.toUpperCase();
//              sendData = capitalizedSentence.getBytes();
//              DatagramPacket sendPacket =
//              new DatagramPacket(sendData, sendData.length, IPAddress, port);
//              serverSocket.send(sendPacket);
//           }
        
//		DatagramSocket serverSocket = new DatagramSocket(1027);
//		byte[] receiveData = new byte[1024];
//		byte[] sendData = new byte[1024];
//		System.out.println("Server started");
//		// BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
//		// System.in));
//		while (true) {
//			// try {
//			// String s = bufferRead.readLine();
//			// handleKeyInput(s);
//			// } catch (IOException e) {
//			// e.printStackTrace();
//			// }
//			DatagramPacket receivePacket = new DatagramPacket(receiveData,
//					receiveData.length);
//			serverSocket.receive(receivePacket);
//			String sentence = new String(receivePacket.getData());
//
//			System.out.println("RECEIVED: " + sentence);
//			strBuffer += (sentence + "\n");
//
//			InetAddress IPAddress = receivePacket.getAddress();
//			int port = receivePacket.getPort();
//			String capitalizedSentence = sentence.toUpperCase();
//			sendData = capitalizedSentence.getBytes();
//			DatagramPacket sendPacket = new DatagramPacket(sendData,
//					sendData.length, IPAddress, port);
//			serverSocket.send(sendPacket);
//		}

		
		udpReceiver = new xacUDPReceiver();
		Thread t = new Thread(udpReceiver);
		t.start();
		
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			try {
				String s = bufferRead.readLine();
				handleKeyInput(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void handleKeyInput(String str) {

		if (str.equals("s")) {
			saveToCSV(udpReceiver.getStrBuffer());
			System.out.println("data saved...");
		}
	}

	static void saveToCSV(String strBuf) {
		Calendar cal = Calendar.getInstance();
		String strTime = cal.getTime().toString();
		strTime = strTime.replace(':', '-');
		strTime = strTime.replace(' ', '_');
		String fileName = "C:/data/duetToucSense" + strTime + ".csv";
		try {
			FileWriter fstream = new FileWriter(fileName);
			BufferedWriter out = new BufferedWriter(fstream);

			out.write(strBuf);
			out.close();
			System.out.println(fileName + " created.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
//
//	public class KeyCommander extends KeyAdapter{
//        public void keyPressed(KeyEvent ke){
//            char keyChar = ke.getKeyChar();
//            switch(keyChar)
//            {
//                case 's':
//                	saveToCSV(udpReceiver.getStrBuffer());
//        			System.out.println("data saved...");
//                    break;
//                
//                default:
//                    break;
//            }    
//        }
//  } 

}
