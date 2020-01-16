import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author huanmao.sjc
 * @version $Id: RMIRemoteService, v 0.1 2019-11-05 11:08 PM th1s Exp $
 */
public interface RMIRemoteService extends Remote {

    public int add(int x, int y) throws RemoteException;
}
