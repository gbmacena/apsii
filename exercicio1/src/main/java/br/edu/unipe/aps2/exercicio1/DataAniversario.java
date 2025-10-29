package br.edu.unipe.aps2.exercicio1;

import java.util.Objects;

public class DataAniversario {

	private int dia;
	private int mes;

	public DataAniversario(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public boolean equals(Object outraData) {
		if (this == outraData) return true;
		if (outraData == null || getClass() != outraData.getClass()) return false;
		DataAniversario that = (DataAniversario) outraData;
		return dia == that.dia && mes == that.mes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dia, mes);
	}

	@Override
	public String toString() {
		return dia + "/" + mes;
	}

}
