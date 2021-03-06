package org.example.models.departamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Departamento {
    public int codigo;
    public String nome;
    public String sigla;

    @Override
    public String toString() {
        return codigo + ", " + nome + ", " + sigla;
    }
}