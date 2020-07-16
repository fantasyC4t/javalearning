import java.io.File;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author huanmao.sjc
 * @version $Id: ReTest, v 0.1 2020-03-18 2:13 PM th1s Exp $
 */
public class ReTest {

    public static void main(String[] args) {
        System.out.println(ReTest.class.getResource("/./../"));
    }
}
