package designpattern.singleton;

/**
 * @author huanmao.sjc
 * @version $Id: SingleObjectTwo, v 0.1 2019-07-25 10:40 AM th1s Exp $
 */
public class SingleObjectTwo {

    private static SingleObjectTwo singleObjectTwo;

    public SingleObjectTwo() {

    }

    public static synchronized SingleObjectTwo getSingleObjectTwo() {
        if (singleObjectTwo == null) {
            singleObjectTwo = new SingleObjectTwo();
        }

        return singleObjectTwo;
    }
}
