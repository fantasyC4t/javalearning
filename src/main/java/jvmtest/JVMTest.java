/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package jvmtest;

import java.util.Scanner;

/**
 *
 * @author th1s
 * @version : JVMTest.java, v 0.1 2020年09月24日 7:08 下午 th1s Exp $
 */
public class JVMTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        while(true) {
            System.out.print( "Please enter a string : " );
            if (sc.next().equals("true")) {
                new JVMTest().test();
            }
            //System.out.print( "Your input is :" + sc.next( ) + "\n");
        }
    }

    public void test() {
        new Test();
    }
}