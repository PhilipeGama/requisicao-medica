package exameRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ExameServant extends UnicastRemoteObject
implements ExameInterface{

	public ExameServant() throws RemoteException {
		super();
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	public RequisicaoExame obterExames(String cpfPaciente, Long numeroProntuario) throws RemoteException {
		List<Exame> lista_exame = null;
		if(cpfPaciente.equals("883.599.070-05")) {
			lista_exame = new ArrayList<Exame>();
			lista_exame.add(new Exame("Anemia","negativo","negativo"));
			lista_exame.add(new Exame("Pressão arterial","14/9","18/12"));
		}else {
			lista_exame = new ArrayList<Exame>();
			lista_exame.add(new Exame("Exame 1", "Resultado X", "Valor esperado A"));
			lista_exame.add(new Exame("Exame 2", "Resultado Y", "Valor esperado B"));
			lista_exame.add(new Exame("Exame 3", "Resultado Z", "Valor esperado C"));
		}
		return new RequisicaoExame(cpfPaciente, numeroProntuario, lista_exame);
	}
}
