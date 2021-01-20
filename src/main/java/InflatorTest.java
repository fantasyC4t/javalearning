/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;


/**
 *
 * @author th1s
 * @version : InflatorTest.java, v 0.1 2020年12月07日 3:51 下午 th1s Exp $
 */
public class InflatorTest {
    public static void main(String[] args)
            throws DataFormatException, UnsupportedEncodingException {
        String message = "Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;"
                +"Welcome to Yiibai.com;";
        System.out.println("Original Message length : " + message.length());
        byte[] input = message.getBytes("UTF-8");

        // Compress the bytes
        byte[] output = new byte[1024];
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();
        int compressedDataLength = deflater.deflate(output);
        deflater.end();

        System.out.println("Compressed Message length : " + compressedDataLength);



        // Decompress the bytes
        Inflater inflater = new Inflater();


        inflater.setInput(output, 0, compressedDataLength);
        byte[] result = new byte[1024];
        int resultLength = inflater.inflate(result);
        inflater.end();

        // Decode the bytes into a String
        message = new String(result, 0, resultLength, "UTF-8");

        System.out.println("UnCompressed Message length : " + message.length());
    }

}