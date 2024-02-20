import java.rmi.Remote;
import java.rmi.RemoteException;

public interface remoteinterface  extends Remote{

    String digaOla() throws RemoteException;
}