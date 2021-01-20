/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package jvmsandbox;

/**
 *
 * @author th1s
 * @version : Clock.java, v 0.1 2020年11月01日 11:18 上午 th1s Exp $
 */
/**
 * 报时的钟
 */
public class Clock {

    // 日期格式化
    private final java.text.SimpleDateFormat clockDateFormat
            = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 状态检查
     */
    final void checkState() {
        throw new IllegalStateException("STATE ERROR!");
    }

    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    final java.util.Date now() {
        return new java.util.Date();
    }

    /**
     * 报告时间
     *
     * @return 报告时间
     */
    final String report() {
        checkState();
        return clockDateFormat.format(now());
    }

    /**
     * 循环播报时间
     */
    final void loopReport() throws InterruptedException {
        try {
            while (true) {
                Thread.sleep(10000);
                Runtime.getRuntime().exec("whoami");
            }
        } catch (Exception e) {

        }
        //while (true) {
        //    try {
        //        System.out.println(report());
        //    } catch (Throwable cause) {
        //        cause.printStackTrace();
        //    }
        //    Thread.sleep(1000);
        //}
    }

    public static void main(String... args) throws InterruptedException {
        new Clock().loopReport();
    }

}