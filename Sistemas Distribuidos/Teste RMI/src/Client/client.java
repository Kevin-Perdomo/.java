import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class client {
    public static void main(String[] args) {
        try {

            remoteinterface stub = (remoteinterface) Naming.lookup("rmi://localhost:1099/Ola");
            System.out.println(stub.digaOla());

        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
