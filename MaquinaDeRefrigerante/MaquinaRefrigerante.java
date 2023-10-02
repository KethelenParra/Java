public class MaquinaRefrigerante {

	private double saldo;
	private double precoRefrigerante;

	public MaquinaRefrigerante() {
		saldo = 0;
	}

	public void inserirDinheiro(double valor) {
		saldo += valor;
	}

	public void realizarVenda() {
		if (saldo >= precoRefrigerante) {
			saldo -= precoRefrigerante;
		} else {
			System.out.println("Saldo insuficiente para comprar o refrigerante.");
		}
	}

	public void menuRefrigerante() {

		System.out.println("---- Menu Refrigerante ----");
		System.out.println("1. Coca-Cola         - 6.5 ");
		System.out.println("2. Pepsi             - 5.0 ");
		System.out.println("3. Fanta Uva         - 5.5 ");
		System.out.println("4. Sprit             - 4.5 ");
		System.out.println("5. Guaraná Antártica - 6.0 ");
		System.out.println("6. Voltar menu principal");

	}

	public void menu() {

		System.out.println("----- Menu -----");
		System.out.println("1 - Inserir dinheiro");
		System.out.println("2 - Selecionar refrigerante");
		System.out.println("0 - Sair");
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getPrecoRefrigerante() {
		return precoRefrigerante;
	}

	public void setPrecoRefrigerante(double precoRefrigerante) {
		this.precoRefrigerante = precoRefrigerante;
	}

}
