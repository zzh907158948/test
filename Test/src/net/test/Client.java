package net.test;

import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) {
	
		try {
			//创建客户端Socket，指定服务器地址和端口
			Socket socket = new Socket("y218d02092.iask.in",49321);//因为服务器跟客户端都在同一台机所以用localhost，不同的话用服务器地址
			
			//获取输出流，向服务器端发送信息
			OutputStream os = socket.getOutputStream();//字节输出流
			PrintWriter pw = new PrintWriter(os);//将输出流包装为打印流
			pw.write("HELLO world");
			pw.flush();
			//socket.shutdownOutput();//关闭输出流
			
			
			//获取输入流并读取服务器的响应信息
			InputStream is = socket.getInputStream();			
			//InputStreamReader isr = new InputStreamReader(is);			
			//BufferedReader br = new BufferedReader(isr);		
			//String info = null;
			//while((info = br.readLine())!=null){
				//System.out.println("我是客户端，服务器说："+info);
			//}
			
			byte[] buf = new byte[1024];
	        int len = 0;
	        while ((len = is.read(buf)) != -1) {
	                System.out.println(new String(buf, 0, len));
	          }
	          
	     

			//关闭资源
			//br.close();
			//isr.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}