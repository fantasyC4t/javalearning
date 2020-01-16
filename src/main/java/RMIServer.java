import java.rmi.Naming;

/**
 * @author huanmao.sjc
 * @version $Id: RMIServer, v 0.1 2019-11-05 11:22 PM th1s Exp $
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.codebase", "http://localhost/");
            RMIRemoteService rmiRemoteService = new RMIRemoteServiceImpl();
            Naming.bind("rmi://localhost:5000/huanmao", rmiRemoteService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
