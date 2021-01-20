/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import java.util.Map;
import java.util.Properties;

/**
 *
 * @author th1s
 * @version : TestSon.java, v 0.1 2020年09月16日 8:21 下午 th1s Exp $
 */
public class TestSon<T> {
    /**
     * Getter method for property <tt>test</tt>.
     *
     * @return property value of test
     */
    public Object getTest() {
        return null;
    }


    /**
     * Setter method for property <tt>test</tt>.
     *
     * @param test value to be assigned to property test
     */
    public void setTest(String a) {
        //this.test = test;
        System.out.println("123");
    }

    //transient String test;

    /**
     * Getter method for property <tt>props</tt>.
     *
     * @return property value of props
     */
    public Properties getProps() {
        return props;
    }

    /**
     * Setter method for property <tt>props</tt>.
     *
     * @param props value to be assigned to property props
     */
    public void setProps(Properties props) {
        this.props = props;
    }

    private Properties props;
}