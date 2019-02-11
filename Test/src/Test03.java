import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 使用URL来读取网页中的内容
 * Created by Administrator on 2017/7/25.
 */
public class Test03 {
    public static void main(String[] args) {
        //创建一个URL实例
        try {
            URL url=new URL("file:///C:/Users/goushikun/Desktop/%E6%B5%8B%E8%AF%95.html");
            //通过url的openstream方法来获取url对象所表示资源的字节输入流
            InputStream is=url.openStream();
            //之后把它转化成字符输入流
            InputStreamReader isr=new InputStreamReader(is);
            //为字符输入流添加缓冲
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