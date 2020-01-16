import java.rmi.Naming;

/**
 * @author huanmao.sjc
 * @version $Id: RMIClient, v 0.1 2019-11-05 11:07 PM th1s Exp $
 */
public class RMIClient {

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.useCodebaseOnly", "false");
            RMIRemoteService rmiRemoteService = (RMIRemoteService) Naming.lookup("rmi://localhost:5000/huanmao");
            System.out.println(rmiRemoteService.add(1, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
