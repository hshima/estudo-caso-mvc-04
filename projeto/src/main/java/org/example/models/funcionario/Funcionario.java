package org.example.models.funcionario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.models.departamento.Departamento;

@Data @NoArgsConstructor @AllArgsConstructor
public class Funcionario {
	Long cpf;
	String nome;
	String email;
	Departamento departamento;

	@Override
	public String toString() {
		return "Funcionarios [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", departamentos=" + departamento
				+ "]";
	}
	
	
}