import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Anuncio> listaDeAnuncios = new ArrayList<>();
		
		Anuncio anuncio = new Anuncio();

		int op = 0;

		do {
			System.out.println("##ESCOLHA UMA OPÇÃO##\n");
			System.out.println("1 - Nome do Anuncio: ");
			System.out.println("2 - Nome do cliente: ");
			System.out.println("3 - Data de inicio: ");
			System.out.println("4 - Data término: ");
			System.out.println("5 - Investimento por dia: ");
			op = scan.nextInt();

			switch (op) {
			case 1:
				System.out.println("Bem vindo ao sistema de cadastro de anuncios\n");

				System.out.println("Nome: ");
				anuncio.setNome(scan.nextLine());

				System.out.println("Cliente: ");
				anuncio.setCliente(scan.nextLine()); 

				System.out.println("Data inicio:  ");
				//anuncio.setDataInicio(scan.next().charAt(0)); 
				scan.nextLine();

				System.out.println("Data término ");
				//anuncio.setDataTermino(scan.nextLine()); 
			case 2:
				System.out.println("Bem vindao ao sistema de cadastro de anuncios");

			case 3:
				break;

			default:
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (op != 5);
	}
}