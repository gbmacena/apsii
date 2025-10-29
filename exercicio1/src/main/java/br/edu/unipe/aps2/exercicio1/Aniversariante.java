package br.edu.unipe.aps2.exercicio1;

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	

	

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Aniversariante outro = (Aniversariante) obj;

    return this.nome.equals(outro.nome) &&
           this.dataAniversario.equals(outro.dataAniversario);
}}
