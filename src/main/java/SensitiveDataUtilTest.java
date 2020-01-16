import com.alipay.service.security.utils.SensitiveDataUtil;

/**
 * @author huanmao.sjc
 * @version $Id: SensitiveDataUtilTest, v 0.1 2019-12-12 12:56 PM th1s Exp $
 */
public class SensitiveDataUtilTest {

    public static void main(String[] args) {
        String idCard = "429004199308041179123123123";
        String afterHideIdCard = SensitiveDataUtil.idCardNoHide(idCard);
        System.out.println(afterHideIdCard);
    }
}
