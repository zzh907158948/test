import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/**
 * Created by Administrator on 2017/7/25.
 * InetAddress类
 */
public class Test01 {
    public static void main(String[] args) {
        //获取本机的InetAddress类的实例
        try {
            InetAddress address=InetAddress.getLocalHost();
            System.out.println("计算机名："+address.getHostName());
            System.out.println("IP地址："+address.getHostAddress());
            byte[] bytes=address.getAddress();//获取IP地址的字节数组
            System.out.println("字节形式的数组IP："+ Arrays.toString(bytes));
            System.out.println(address);

            //根据主机名获取InetAddress实例
            InetAddress address2=InetAddress.getByName("MSI");
            System.out.println("计算机名："+address2.getHostName());
            System.out.println("IP地址："+address2.getHostAddress());
            //InetAddress address3=InetAddress.getByName("10.203.45.44");
            //System.out.println("计算机名："+address3.getHostName());
            //System.out.println("IP地址："+address3.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
