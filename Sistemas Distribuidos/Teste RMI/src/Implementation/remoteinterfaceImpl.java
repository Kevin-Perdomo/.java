import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class remoteinterfaceImpl extends  UnicastRemoteObject implements remoteinterface{

    protected remoteinterfaceImpl() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;

    @Override
    public String digaOla() throws RemoteException {

        return "\n\nOla, que mundo ?\n\n";
    }
    
}
