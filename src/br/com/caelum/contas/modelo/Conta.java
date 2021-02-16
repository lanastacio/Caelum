package br.com.caelum.contas.modelo;

import br.com.caelum.contas.main.Data;

public class Conta {

	public String titular;
	public int numero;
	public String agencia;
	public double saldo;
	public Data dataDeAbertura;
	public static int indentificador;
	
	public String getTipo() {
		return "Conta";
	}

	public Conta() {

	}

	public Conta(String titular) {

	}

	public Conta(int indentificador) {
		Conta.indentificador = Conta.indentificador + 1;
		Conta.indentificador = indentificador;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public void saca(double valor) {

		double novoSaldo = saldo - valor;
		saldo = novoSaldo;
	}

	public void deposita(double valor) {

		saldo = saldo + valor;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double calculaRendimento() {

		return saldo = saldo * 0.1;
	}

	public int getIndentificador() {
		return indentificador;
	}

	public void setIndentificador(int indentificador) {
		Conta.indentificador = indentificador;
	}

	public String recuperaDadosParaImpressao() {

		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		dados += "\n ID: " + Conta.indentificador;
		return dados;
	}

}
