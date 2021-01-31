package org.example.models.participacao;

import java.util.Date;

public class Participacao {
	
	private Short codigo;
	private Long cpf_funcionario;
	private Date dataEntrada;
	private Date dataSaida;
	private String title;

	public Participacao() {
		super();
	}

	public Participacao(Short codigo, Long cpf_funcionario, Date dataEntrada, Date dataSaida, String title) {
		super();
		this.codigo = codigo;
		this.cpf_funcionario = cpf_funcionario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.title = title;
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}

	public Long getCpf_funcionario() {
		return cpf_funcionario;
	}

	public void setCpf_funcionario(Long cpf_funcionario) {
		this.cpf_funcionario = cpf_funcionario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
