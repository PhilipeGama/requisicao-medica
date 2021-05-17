package exameRMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ExameServer {
	public static void main(String[] args) throws RemoteException {
		Registry registryExame = LocateRegistry.createRegistry(5099);
		registryExame.rebind("exames", new ExameServant());
	}
}
