import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author huanmao.sjc
 * @version $Id: RMIRemoteServiceImpl, v 0.1 2019-11-05 11:11 PM th1s Exp $
 */
public class RMIRemoteServiceImpl extends UnicastRemoteObject implements RMIRemoteService {

    RMIRemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }
}
