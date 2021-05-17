package br.edu.ifam.consultorio.model;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import exameRMI.Exame;
import exameRMI.ExameInterface;
import exameRMI.RequisicaoExame;

@Entity
public class Prontuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long numero;
	@Column
	String nomePaciente;
	@Column
	String cpfPaciente;
	@Column
	String nomeMedico;
	@Column
	String crmMedico;
	@Column
	String avaliacao;
	@Column
	String tratamento;
	@Transient
	List<Exame> exames = null;
	
	Prontuario(){}

	public Prontuario(Long numero, String nomepaciente, String cpfPaciente, String nomeMedico, String crmMedico,
			String avaliação, String tratamento) {
		super();
		this.numero = numero;
		this.nomePaciente = nomepaciente;
		this.cpfPaciente = cpfPaciente;
		this.nomeMedico = nomeMedico;
		this.crmMedico = crmMedico;
		this.avaliacao = avaliação;
		this.tratamento = tratamento;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNomepaciente() {
		return nomePaciente;
	}

	public void setNomepaciente(String nomepaciente) {
		this.nomePaciente = nomepaciente;
	}

	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(String crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public List<Exame> getExames() throws MalformedURLException, RemoteException, NotBoundException{
		ExameInterface exames = (ExameInterface) Naming.lookup("rmi://localhost:5099/exames");
		RequisicaoExame req = exames.obterExames(this.cpfPaciente, this.numero);
		return req.getList_exames();
	}
}
