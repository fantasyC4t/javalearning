import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author huanmao.sjc
 * @version $Id: PathTest, v 0.1 2020-07-05 8:40 PM th1s Exp $
 */
public class PathTest {

    public static String canonicalPath(String path) {
        List<String> r = new ArrayList(Arrays.asList(path.split("/+")));
        int i = 0;

        while(true) {
            while(i < r.size()) {
                if (((String)r.get(i)).length() != 0 && !((String)r.get(i)).equals(".")) {
                    if (((String)r.get(i)).equals("..")) {
                        r.remove(i);
                        if (i > 0) {
                            r.remove(i - 1);
                            --i;
                        }
                    } else {
                        ++i;
                    }
                } else {
                    r.remove(i);
                }
            }

            StringBuilder buf = new StringBuilder();
            if (path.startsWith("/")) {
                buf.append('/');
            }

            boolean first = true;

            String token;
            for(Iterator var4 = r.iterator(); var4.hasNext(); buf.append(token)) {
                token = (String)var4.next();
                if (!first) {
                    buf.append('/');
                } else {
                    first = false;
                }
            }

            if (path.endsWith("/") && (buf.length() == 0 || buf.charAt(buf.length() - 1) != '/')) {
                buf.append('/');
            }

            return buf.toString();
        }
    }

    public static void main(String[] args) {
        String path = "file:\\\\bbbbb\\sdaasd\\";
        String cleanPath = PathTest.canonicalPath(path);
        System.out.println(cleanPath);
    }
}
