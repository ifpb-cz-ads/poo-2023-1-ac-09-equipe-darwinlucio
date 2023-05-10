package banco;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Conta conta = null;
		Cliente cliente = new Cliente("Lúcio do Barro", "123.456.789-99");
		Scanner sc = new Scanner(System.in);
		System.out.println("Criar conta para José");
		System.out.println("Qual tipo de conta?");
		System.out.println("1 - Conta Especial");
		System.out.println("2 - Conta Poupança");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			conta = new ContaEspecial(1, cliente, 0, 1000);
			break;
		case 2: 
			conta = new ContaPoupanca(1, cliente, 0);
			break;
		}
		System.out.println("Nome Cliente: " + conta.getCliente().getNome());
		System.out.println("CPF Cliente: " + conta.getCliente().getCpf());
		sc.close();
	}
}