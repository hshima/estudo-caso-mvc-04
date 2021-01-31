package org.example.models.projeto;

import java.util.Date;

public class Projeto {

	private Short codigo;
	private String titulo;
	private Date dataInicio;
	private Date dataFim;
	private Short codigoDepartamento;

	public Projeto(Short codigo, String titulo, Date dataInicio, Date dataFim, Short codigoDepartamento) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.codigoDepartamento = codigoDepartamento;
	}

	public Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Short getCodigo() {
		return codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Short getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(short codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	@Override
	public String toString() {
		return "Projetos [codigo=" + codigo + ", titulo=" + titulo + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", codigoDepartamento=" + codigoDepartamento + "]";
	}
}
