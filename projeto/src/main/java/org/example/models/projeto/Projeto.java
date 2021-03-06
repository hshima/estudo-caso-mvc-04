package org.example.models.projeto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class Projeto {

	private Short codigo;
	private String titulo;
	private Date dataInicio;
	private Date dataFim;
	private Short codigoDepartamento;

	@Override
	public String toString() {
		return "Projetos [codigo=" + codigo + ", titulo=" + titulo + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", codigoDepartamento=" + codigoDepartamento + "]";
	}
}
