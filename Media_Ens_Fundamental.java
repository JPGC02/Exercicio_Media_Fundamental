//importar a classe scanner
import java.util.Scanner;

	public class Media_Ens_Fundamental {

		public static void main(String[] args) {
			// declarando scanner para entrada de dados
			Scanner notas = new Scanner(System.in);
			// inserindo  Variaveis e atribuindo os dados 
			int RA, n1 = 0, n2 = 0, n3 = 0;
			float media;
			// laço de repeticao
			do {
				// exibindo na tela o texto em parenteses
				System.out.println("Digite seu RA escolar:");
				// atribuindo um valor a variante 
				RA = notas.nextInt();
				// condicao de que se o RA for igual a 0 informar, RA invalido	
				if (RA == 0) {
					System.out.println("r.a invalido, por favor tente novamente");
					
				} else {
					System.out.println("Digite a nota da Primeira Prova:");
					n1 = notas.nextInt();
					System.out.println("\nDigite a nota da Segunda Prova:");
					n2 = notas.nextInt();
					System.out.println("\nDigite a nota da Terceira Prova:");
					n3 = notas.nextInt();
				}
				// Finaliza laço 
			} while (RA == 0);
			// calculo para a media
			 media = (n1 + n2 + n3) / 3;
			// condicao
			if (media >= 8) {
				System.out.println("Parabens,Voce foi Aprovado!\n sua media foi " +  media);
			} else if (media <= 8 && media >= 6) {
				System.out.println("Voce precisa fazer a Recuperacao!\n sua media foi " +  media);
			} else if (media < 6) {
				System.out.println("Voce foi Reprovado!\n sua media foi " + media);
			}

		}
	}