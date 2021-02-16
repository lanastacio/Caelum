package br.com.caelum.contas.main;

public class Data {

	int dia = 16;
	int mes = 02;
	int ano = 2021;

	public String formatada() {
		return (this.dia + "/" + this.mes + "/" + this.ano);
	}

}
