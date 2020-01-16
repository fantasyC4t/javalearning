/**
 * @author huanmao.sjc
 * @version $Id: classloaderTest, v 0.1 2019-08-03 9:30 PM th1s Exp $
 */
public class classloaderTest {

    public static void main(String[] args) {

        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        System.out.println("test");


        ClassLoader cl1 = cl.getClass().getClassLoader();

        System.out.println("test2");
    }

}
