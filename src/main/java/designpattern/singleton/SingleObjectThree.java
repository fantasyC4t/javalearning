package designpattern.singleton;

/**
 * @author huanmao.sjc
 * @version $Id: SingleObjectThree, v 0.1 2019-07-25 10:42 AM th1s Exp $
 */
public class SingleObjectThree {

    private static SingleObjectThree singleObjectThree = new SingleObjectThree();

    public SingleObjectThree() {}

    public static SingleObjectThree getSingleObjectThree() {
        return singleObjectThree;
    }
}
