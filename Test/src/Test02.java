import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by Administrator on 2017/7/25.
 * URL���÷���
 */
public class Test02 {
    public static void main(String[] args) {
        //����һ��URL��ʵ��
        try {
            URL imooc=new URL("http://www.imooc.com");
            //�����Ѵ�����URL���������µ�URL
            URL url=new URL(imooc,"/index.html?username=tom#test");
            //?�����ʾ������#�����ʾê��
            System.out.println("Э�飺"+url.getProtocol());
            System.out.println("������"+url.getHost());
            //���δָ���˿ںţ�����Э�鲻ͬʹ��Ĭ�϶˿ںţ�����������HTTPʹ�õ���80
            //��ʱ��Ϊ��Ĭ�ϵĶ˿ںţ�����getPort����ֵ��-1
            System.out.println("�˿ںţ�"+url.getPort());
            System.out.println("�ļ�·����"+url.getPath());
            System.out.println("�ļ�����"+url.getFile());
            System.out.println("���·����"+url.getRef());
            System.out.println("��ѯ�ַ�����"+url.getQuery());//��ѯ�ַ����������ǵĲ���
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}