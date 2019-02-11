package net.test;

import java.io.*;
import java.net.*;


public class Server {
	public static void main(String[] args) { 
		 
		try {
			//����һ����������Socket����ServerSocket��ָ���󶨵Ķ˿ڣ��������˶˿�
			ServerSocket serverSocket = new ServerSocket(8000);
			 Socket socket = null;
			//��¼�ͻ��˵�����
			 int count = 0;
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			//ѭ�������ȴ��ͻ��˵�����
			while(true){
				//����accept()������ʼ�������ȴ��ͻ��˵�����
				 socket = serverSocket.accept();
				 //����һ���µ��߳�
				 ServerThread serverThread = new ServerThread(socket);
				 //�����̣߳�����start()�������߳�����Զ�����run()����
				 serverThread.start();
				 count++;
				 System.out.println("�ͻ��˵�������"+count);
				 InetAddress address = socket.getInetAddress();
				 System.out.println("��ǰ�ͻ��˵�IP:"+address);
			}
		  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
