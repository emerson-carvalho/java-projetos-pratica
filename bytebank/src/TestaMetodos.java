
public class TestaMetodos {
	
	public static void main(String[] args) {
		
	Conta contaDoEmerson = new Conta();
	contaDoEmerson.saldo = 100;
	System.out.println(contaDoEmerson.saldo);
	
	contaDoEmerson.deposita(100);
	System.out.println(contaDoEmerson.saldo);
	
	Conta contaDaPaloma = new Conta();
	contaDaPaloma.saldo = 1000;
	
	contaDaPaloma.transfere(500, contaDoEmerson);
	System.out.println("Saldo da conta da Paloma: " + contaDaPaloma.saldo);
	System.out.println("Saldo da conta do Emerson: " + contaDoEmerson.saldo);
	
	contaDoEmerson.saca(150);
	System.out.println(contaDoEmerson.saldo);
	
	}
}
