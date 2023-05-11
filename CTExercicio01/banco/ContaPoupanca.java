package banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String nome_titular, double saldo) {
		super(numero, nome_titular, saldo);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			saldo -= valor;
			return true;
		} 
		return false;
	}
}
