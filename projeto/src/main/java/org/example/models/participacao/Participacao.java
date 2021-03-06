package org.example.models.participacao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class Participacao {
	
	private Short codigo;
	private Long cpf_funcionario;
	private Date dataEntrada;
	private Date dataSaida;
	private String title;

}
