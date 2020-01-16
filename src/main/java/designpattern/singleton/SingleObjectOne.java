package designpattern.singleton;

/**
 * @author huanmao.sjc
 * @version $Id: SingleObjectOne, v 0.1 2019-07-25 10:38 AM th1s Exp $
 */
public class SingleObjectOne {

    private static SingleObjectOne singleObjectOne;

    public SingleObjectOne() {}

    public static SingleObjectOne getSingleObjectOne() {
        if (singleObjectOne == null) {
            singleObjectOne = new SingleObjectOne();
        }

        return singleObjectOne;
    }
}
