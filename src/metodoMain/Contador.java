package metodoMain;

import java.util.Scanner;

import classeException.ParametroInvalidoException;

public class Contador {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro numero!!");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Informe segundo numero!!");
		int segundoNumero = scanner.nextInt();

		try {

			contar(primeiroNumero, segundoNumero);

		} catch (ParametroInvalidoException e) {
			System.out.println("O segundo numero deve ser maior do que o primeiro numero!!");
		}

	}

	public static void contar(int primeiroNumero, int segundoNumero) throws ParametroInvalidoException {

		if (primeiroNumero > segundoNumero) {

			throw new ParametroInvalidoException();

		} else {

			int contagem = segundoNumero - primeiroNumero;
			
			System.out.println("Contagem do intervalo dos números fornecido pelo usuário");

			for (int i = 0; i < contagem; i++) {

				System.out.println("Contando... " + (i + 1));

			}

		}

	}

}
