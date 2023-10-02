
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MaquinaRefrigerante maquina = new MaquinaRefrigerante();

		int opcao;

		do {
			System.out.println("----- Maquina de venda de Refrigerante -----");
			System.out.println("Saldo atual: " + maquina.getSaldo());
			System.out.println("");
			maquina.menu();

			opcao = scan.nextInt();

			if (opcao != 0 && opcao != 1 && opcao != 2) {

				System.out.println("Digite um numero válido!");
				opcao = scan.nextInt();

			} else {

				switch (opcao) {

				case 1:

					System.out.println("Insira o valor para comprar o refrigerante: ");
					double valorInserido = scan.nextDouble();
					maquina.inserirDinheiro(valorInserido);

					break;

				case 2:

					int escolhaRefrigerante = 0;

					while (escolhaRefrigerante != 6) {
						maquina.menuRefrigerante();
						escolhaRefrigerante = scan.nextInt();

						if (escolhaRefrigerante >= 1 && escolhaRefrigerante <= 6) {
							double precoRefrigerante = 0.0;

							if (escolhaRefrigerante == 1) {
								precoRefrigerante = 6.5;
							} else if (escolhaRefrigerante == 2) {
								precoRefrigerante = 5.0;
							} else if (escolhaRefrigerante == 3) {
								precoRefrigerante = 5.5;
							} else if (escolhaRefrigerante == 4) {
								precoRefrigerante = 4.5;
							} else if (escolhaRefrigerante == 5) {
								precoRefrigerante = 6.0;
							}

							if (precoRefrigerante > 0 && precoRefrigerante <= maquina.getSaldo()) {
								maquina.setPrecoRefrigerante(precoRefrigerante);
								maquina.realizarVenda();
							} else if (maquina.getSaldo() < precoRefrigerante) {
								System.out.println("Faltando: " + (maquina.getSaldo() - precoRefrigerante));
								System.out.println("Saldo insuficiente para comprar o refrigerante.");
							}

						} else if (escolhaRefrigerante == 6) {
							System.out.println("De volta para o menu principal");
						} else {
							System.out.println("Opcao invalida!");
						}
					}

					System.out.println("");

					break;

				case 0:

					if (maquina.getSaldo() >= 0) {
						System.out.println("Seu troco: " + maquina.getSaldo());
						System.out.println("Finalização da maquina de Refrigerante!!");
						break;
					}

				default:

					System.out.println("Opcao invalida!");
					break;

				}
			}

		} while (opcao != 0);

		scan.close();

	}

}