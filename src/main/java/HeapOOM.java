import java.util.ArrayList;
import java.util.List;

/**
 * @author huanmao.sjc
 * @version $Id: HeapOOM, v 0.1 2019-07-24 9:03 PM th1s Exp $
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }

}
