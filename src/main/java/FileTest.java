/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 *
 * @author th1s
 * @version $Id: FileTest.java, v 0.1 2020Äê07ÔÂ16ÈÕ 4:26 PM th1s Exp $
 */
public class FileTest {
    public static void main(String[] args) throws Exception {
        File f = new File("/Users/th1s/", "/../../../../../../etc/passwd");
        if (f.canRead()) {
            byte[] byteResult = FileUtils.readFileToByteArray(f);
            String result = new String(byteResult);
            System.out.println(result);
        }
    }
}