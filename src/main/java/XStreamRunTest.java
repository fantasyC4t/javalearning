import com.thoughtworks.xstream.XStream;

import java.io.*;

/**
 * @author huanmao.sjc
 * @version $Id: XStreamRunTest, v 0.1 2020-03-22 11:31 PM th1s Exp $
 */
public class XStreamRunTest {

    public static void main(String[] args) {
        String xml = readFileByBytes("/Users/th1s/Desktop/evilxmlobject2.txt");
        new XStream().fromXML(xml);
    }

    public static String readFileByBytes(String fileName) {
        try {
            File file = new File(fileName);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(file));
            BufferedReader br = new BufferedReader(reader);
            String result = "";
            String line = "";
            while ((line = br.readLine()) != null) {
                result += line; // 一次读入一行数据
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
