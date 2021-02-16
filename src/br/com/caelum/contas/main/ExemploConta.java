package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class ExemploConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();

		c1.setTitular("Lucas");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(100);
		c1.calculaRendimento();
		c1.deposita(0);

		Data data = new Data();
		c1.setDataDeAbertura(data);

		System.out.println(c1.recuperaDadosParaImpressao());

	}
}
