import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ʹ��URL����ȡ��ҳ�е�����
 * Created by Administrator on 2017/7/25.
 */
public class Test03 {
    public static void main(String[] args) {
        //����һ��URLʵ��
        try {
            URL url=new URL("file:///C:/Users/goushikun/Desktop/%E6%B5%8B%E8%AF%95.html");
            //ͨ��url��openstream��������ȡurl��������ʾ��Դ���ֽ�������
            InputStream is=url.openStream();
            //֮�����ת�����ַ�������
            InputStreamReader isr=new InputStreamReader(is);
            //Ϊ�ַ���������ӻ���
            BufferedReader br=new BufferedReader(isr);
            String data=br.readLine();
            while(data!=null){
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
            isr.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}