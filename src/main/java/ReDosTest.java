import java.util.regex.Pattern;

/**
 * @author huanmao.sjc
 * @version $Id: ReDosTest, v 0.1 2020-02-04 10:45 AM th1s Exp $
 */
public class ReDosTest {
    public static void main(String[] args) {
        Pattern xxepattern = Pattern.compile("(.|\\s)*a");

        String input = "                                            b";

        if(xxepattern.matcher(input).find()){
            System.out.println("xxe");
        }
    }
}
