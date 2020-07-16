import java.net.URL;

/**
 * @author huanmao.sjc
 * @version $Id: URLTest, v 0.1 2020-06-03 5:14 PM th1s Exp $
 */
public class URLTest {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com/xflush@");
        String path = url.getPath();
        path = path.substring(7);
        System.out.println(path);
    }
}
