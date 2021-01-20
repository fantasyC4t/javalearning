/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import java.io.IOException;

/**
 *
 * @author th1s
 * @version : ByteToLong.java, v 0.1 2020年11月16日 7:30 下午 th1s Exp $
 */
public class ByteToLong {
    public static void main(String[] args) {
        //short b = 0b100000000000000;
        System.out.println((0xFF & 0xFF) << 24);
    }

    public static int byteArrayToInt(byte[] b) {
        return   b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

    public static byte[] intToByteArray(int a) {
        return new byte[] {
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a & 0xFF)
        };
    }

    protected static long byteArrayToLong(byte[] b, int start, int len) throws IOException {
        if (len > 8) {
            throw new IOException();
        }
        int shift = 0;
        long result = 0;
        for (int i = start + len - 1; i >= start; i--) {
            result = result + ((b[i] & 0xFFL) << shift);
            shift += 8;
        }
        return result;
    }
}