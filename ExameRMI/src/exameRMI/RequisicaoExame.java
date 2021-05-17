package exameRMI;

import java.io.Serializable;
import java.util.List;

public class RequisicaoExame implements Serializable{

	private static final long serialVersionUID = 7903462369978551232L;
	private Long numeroProntuario;
	private String cpfPaciente;
	private List<Exame> list_exames;
	
	public RequisicaoExame(String cpfPaciente, Long numeroProntuario, List<Exame> list_exames) {
		this.cpfPaciente = cpfPaciente;
		this.numeroProntuario = numeroProntuario;
		this.list_exames = list_exames;
	}

	public Long getNumberProntuario() {
		return numeroProntuario;
	}
	
	public void setNumberProntuario(Long numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	
	public String getCpfCliente() {
		return cpfPaciente;
	}
	
	public void setCpfCliente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	
	public List<Exame> getList_exames() {
		return list_exames;
	}
	
	public void setList_exames(List<Exame> list_exames) {
		this.list_exames = list_exames;
	}
}
