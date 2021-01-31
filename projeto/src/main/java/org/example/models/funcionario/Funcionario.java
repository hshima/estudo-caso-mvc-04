package org.example.models.funcionario;

import org.example.models.departamento.Departamento;

public class Funcionario {
	Long cpf;
	String nome;
	String email;
	Departamento departamento;

	public Funcionario() {}
	
	public Funcionario(Long cpf, String nome, String email, Departamento departamento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.departamento = departamento;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamentos(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionarios [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", departamentos=" + departamento
				+ "]";
	}
	
	
}