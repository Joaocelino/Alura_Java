package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteArrayReferencia {

	public static void main(String[] args) throws SaldoInsuficienteException{
		Object[] referencia = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;

		ContaPoupanca cp1 = new ContaPoupanca();
		referencia[1] = cp1;

		Cliente cl1 = new Cliente();
		referencia[2] = cl1;


		Conta ref = (ContaCorrente) referencia[0];		
		System.out.println(cc1.getNumero());
		System.out.println(ref.getNumero());

		Conta ref = (ContaPoupanca) referencia[1];//type cast
		System.out.println(cp1.getNumero());
		System.out.println(ref.getNumero());

	}

}
