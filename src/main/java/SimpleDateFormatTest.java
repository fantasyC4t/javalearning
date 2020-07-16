import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author huanmao.sjc
 * @version $Id: SimpleDateFormatTest, v 0.1 2020-03-03 10:39 AM th1s Exp $
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) {
        final DateFormat df = new SimpleDateFormat("yyyyMMdd,HHmmss");
        ExecutorService ts = Executors.newFixedThreadPool(100);
        for (;;) {
            ts.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //在多个线程中使用同一个SimpleDateFormat实例，导致线程安全问题。
                        Date date =  df.parse("20190101,000000");
                        System.out.println(date.getTime());
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                }
            });
        }
    }
}
