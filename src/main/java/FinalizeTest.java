/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

/**
 *
 * @author th1s
 * @version : FinalizeTest.java, v 0.1 2020年10月20日 12:37 下午 th1s Exp $
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        c2 = c3 = null;
        System.gc(); //Invoke the Java garbage collector
    }
}

class Cake extends Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + "is created");
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("Cake Object " + id + "is disposed");
    }
}