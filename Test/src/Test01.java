import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/7/25.
 * InetAddress��
 */
public class Test01 {
    public static void main(String[] args) {
        //��ȡ������InetAddress���ʵ��
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println("���������"+address.getHostName());
            System.out.println("IP��ַ��"+address.getHostAddress());
            byte[] bytes=address.getAddress();//��ȡIP��ַ���ֽ�����
            System.out.println("�ֽ���ʽ������IP��"+ Arrays.toString(bytes));
            System.out.println(address);

            //������������ȡInetAddressʵ��
            InetAddress address2=InetAddress.getByName("MSI");
            System.out.println("���������"+address2.getHostName());
            System.out.println("IP��ַ��"+address2.getHostAddress());
            //InetAddress address3=InetAddress.getByName("10.203.45.44");
            //System.out.println("���������"+address3.getHostName());
            //System.out.println("IP��ַ��"+address3.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
