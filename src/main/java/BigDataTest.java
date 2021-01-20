/**
 * Alipay.com Inc. Copyright (c) 2004-2021 All Rights Reserved.
 */

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.iwallet.biz.common.util.money.Money;

/**
 *
 * @author th1s
 * @version : BigDataTest.java, v 0.1 2021年01月08日 1:58 下午 th1s Exp $
 */
public class BigDataTest {
    @Test
    public void test() {
        //Money m = new Money("1e99999999");
        BigDecimal bigDecimal = new BigDecimal("10e9").setScale(0);
        //BigInteger.TEN.pow(99999999);
        System.out.println(bigDecimal);
        Integer.MAX_VALUE
    }
}