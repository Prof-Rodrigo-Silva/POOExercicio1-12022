package classeexecutavel;

import model.Conta;
import model.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "João";
		p1.idade = 32;
		p1.cel = 111111111;
		p1.nomeMae = "Joana";
		Pessoa p2 = new Pessoa();
		p2.nome = "Paulo";
		p2.idade = 19;
		p2.cel = 222222222;
		p2.nomeMae = "Paula";
		Pessoa p3 = new Pessoa();
		p3.nome = "Maria";
		p3.idade = 42;
		p3.cel = 333333333;
		p3.nomeMae = "Mariana";
		Conta c1 = new Conta();
		c1.codigo = 123;
		c1.correntista = "João";
		c1.saldo = 2500.00f;
		Conta c2 = new Conta();
		c2.codigo = 456;
		c2.correntista = "Paulo";
		c2.saldo = 3500.00f;
		Conta c3 = new Conta();
		c3.codigo = 789;
		c3.correntista = "Maria";
		c3.saldo = 3550.00f;
		
		System.out.println("----PESSOA 1----");
		System.out.println("Nome: "+p1.nome);
		System.out.println("Idade: "+p1.idade);
		System.out.println("Celular: "+p1.cel);
		System.out.println("Nome Mãe: "+p1.nomeMae);
		System.out.println("--------------------------------------");
		System.out.println("----PESSOA 2----");
		System.out.println("Nome: "+p2.nome);
		System.out.println("Idade: "+p2.idade);
		System.out.println("Celular: "+p2.cel);
		System.out.println("Nome Mãe: "+p2.nomeMae);
		System.out.println("--------------------------------------");
		System.out.println("----PESSOA 3----");
		System.out.println("Nome: "+p3.nome);
		System.out.println("Idade: "+p3.idade);
		System.out.println("Celular: "+p3.cel);
		System.out.println("Nome Mãe: "+p3.nomeMae);
		System.out.println("--------------------------------------");
		System.out.println("----CONTA 1----");
		System.out.println("Código: "+c1.codigo);
		System.out.println("Correntista: "+c1.correntista);
		System.out.println("Saldo: "+c1.saldo);
		System.out.println("--------------------------------------");
		System.out.println("----CONTA 2----");
		System.out.println("Código: "+c2.codigo);
		System.out.println("Correntista: "+c2.correntista);
		System.out.println("Saldo: "+c2.saldo);
		System.out.println("--------------------------------------");
		System.out.println("----CONTA 3----");
		System.out.println("Código: "+c3.codigo);
		System.out.println("Correntista: "+c3.correntista);
		System.out.println("Saldo: "+c3.saldo);
	}

}
