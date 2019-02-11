package net.test;

import java.io.*;
import java.net.*;


public class Server {
	public static void main(String[] args) { 
		 
		try {
			//创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
			ServerSocket serverSocket = new ServerSocket(8000);
			 Socket socket = null;
			//纪录客户端的数量
			 int count = 0;
			System.out.println("***服务器即将启动，等待客户端的连接***");
			//循环监听等待客户端的连接
			while(true){
				//调用accept()方法开始监听，等待客户端的连接
				 socket = serverSocket.accept();
				 //创建一个新的线程
				 ServerThread serverThread = new ServerThread(socket);
				 //启动线程，调用start()方法后，线程类会自动调用run()方法
				 serverThread.start();
				 count++;
				 System.out.println("客户端的数量："+count);
				 InetAddress address = socket.getInetAddress();
				 System.out.println("当前客户端的IP:"+address);
			}
		  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
