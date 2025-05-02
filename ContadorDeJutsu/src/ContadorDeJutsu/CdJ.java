package ContadorDeJutsu;
import java.util.Scanner;
public class CdJ {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int escolha, contadordejutsu = 0;
			float seuchakra = 0;
			float totalchakra = 0;
			boolean continuar = true;
			while (continuar) {
				System.out.println("=== Calculadora de Jutsus ===");
				System.out.println("1 - Chidori");
				System.out.println("2 - Rasengan");
				System.out.println("3 - Amaterasu");
				System.out.println("4 - Hiraishin");
				System.out.print("Digite um numero: ");
				escolha = ler.nextInt();
				switch (escolha) {
				case 1:
					totalchakra = 30.5f;
					System.out.println("=== Você usou o Chidori ===");
					break;
				case 2:
					totalchakra = 25.0f;
					System.out.println("=== Você usou o Rasengan ===");
					break;
				case 3:
					totalchakra = 45.0f;
					System.out.println("=== Você usou o Amaterasu ===");
					break;
				case 4:
					totalchakra = 20.0f;
					System.out.println("=== Você usou o Hiraishin ===");
					break;
				default:
					totalchakra = 0;
					System.out.println("Jutsu invalido");
					break;
				}
				if (totalchakra > 0) {
					seuchakra += totalchakra;
					contadordejutsu++;
				}
				System.out.print("Deseja usar outro jutsu? (1 = sim, 2 = não): ");
				int resposta = ler.nextInt();
				if (resposta != 1) {
					continuar = false;
				}
			}
			System.out.println("Você fez " + contadordejutsu + " jutsus");
			System.out.println("Chakra total gasto: " + seuchakra);
		}
	}
}
