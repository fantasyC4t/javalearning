import javax.crypto.Cipher;

/**
 * @author huanmao.sjc
 * @version $Id: CipherTest, v 0.1 2020-07-03 5:24 PM th1s Exp $
 */
public class CipherTest {

    public static void main(String[] args) throws Exception {
        System.out.println(Cipher.getInstance("AES"));
    }
}
