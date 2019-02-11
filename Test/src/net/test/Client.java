package net.test;

import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) {
	
		try {
			//�����ͻ���Socket��ָ����������ַ�Ͷ˿�
			Socket socket = new Socket("y218d02092.iask.in",49321);//��Ϊ���������ͻ��˶���ͬһ̨��������localhost����ͬ�Ļ��÷�������ַ
			
			//��ȡ���������������˷�����Ϣ
			OutputStream os = socket.getOutputStream();//�ֽ������
			PrintWriter pw = new PrintWriter(os);//���������װΪ��ӡ��
			pw.write("HELLO world");
			pw.flush();
			//socket.shutdownOutput();//�ر������
			
			
			//��ȡ����������ȡ����������Ӧ��Ϣ
			InputStream is = socket.getInputStream();			
			//InputStreamReader isr = new InputStreamReader(is);			
			//BufferedReader br = new BufferedReader(isr);		
			//String info = null;
			//while((info = br.readLine())!=null){
				//System.out.println("���ǿͻ��ˣ�������˵��"+info);
			//}
			
			byte[] buf = new byte[1024];
	        int len = 0;
	        while ((len = is.read(buf)) != -1) {
	                System.out.println(new String(buf, 0, len));
	          }
	          
	     

			//�ر���Դ
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