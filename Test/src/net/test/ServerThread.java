package net.test;

import java.io.*;
import java.net.*;

/*
 * ���������̴߳�����
 */
public class ServerThread extends Thread {
    //ÿ���ͻ����������Ժ󣬷������˶��ᴴ��һ��socket����֮����ͨ�ţ���������ÿ���̶߳���Ӧ��һ����
    //���߳���ص�socket
    Socket socket=null;
    //���췽����ʼ��
    public ServerThread(Socket socket){
        this.socket=socket;
    }
    //�߳�ִ�еĲ�������Ӧ�ͻ��˵�����
    public void run() {
        InputStream is = null;//�ֽ�������
        InputStreamReader isr=null;
        BufferedReader br=null;
        OutputStream os=null;
        PrintWriter pw=null;
        try {
            is = socket.getInputStream();
            //3.��ȡ��������ȡ�ͻ��˵���Ϣ
            //Ϊ������Ч�ʿ��԰�����װ��һ���ַ�������
            isr = new InputStreamReader(is);
            //���ǿ���Ϊ�ַ�����ӻ��壬�Ի���ķ�ʽȥ�������ݵĶ�ȡ
            br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("���Ƿ��������ͻ���˵" + info);
            }
            socket.shutdownInput();//�ر�������
            //4.��ȡ���������������������Ӧ�ͻ��˵���Ϣ
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("��ӭ����");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //5.�ر���ص���Դ,finally��һ���ᱻִ�е�
            try {
                if(pw!=null)
                    pw.close();
                if(os!=null)
                    os.close();
                if(br!=null)
                    br.close();
                if(isr!=null)
                    isr.close();
                if(is!=null)
                    is.close();
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
