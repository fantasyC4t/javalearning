/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author th1s
 * @version $Id: ProcessBuilderTest.java, v 0.1 2020Äê07ÔÂ16ÈÕ 4:06 PM th1s Exp $
 */
public class ProcessBuilderTest {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("ls", "-al");
        Process process = pb.start();
        InputStream is = process.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}