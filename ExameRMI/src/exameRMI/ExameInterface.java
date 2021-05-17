package exameRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ExameInterface extends Remote {
	public RequisicaoExame obterExames(String cpfPaciente, Long numberProntuario)
			throws RemoteException;
}
