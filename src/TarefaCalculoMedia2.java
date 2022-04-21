import java.util.Locale;
import java.util.Scanner;

/**
 * Cálculo da média do aluno e informe sobre a sua situação escolar.
 * 
 * @author wagne
 * @since 20/04/2022
 *
 */
public class TarefaCalculoMedia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, media;

		System.out.println("***************************************************");
		System.out.println("***  Cálculo da média e situação do aluno    ******");
		System.out.println("***************************************************\n");

		System.out.println("Digite a nota 1, com uma casa decimal :  ");
		nota1 = sc.nextDouble();

		System.out.printf("Digite a nota 2, com uma casa decimal :  ");
		nota2 = sc.nextDouble();

		System.out.printf("Digite a nota 3, com uma casa decimal :  ");
		nota3 = sc.nextDouble();

		System.out.printf("Digite a nota 4, com uma casa decimal :\n\n  ");
		nota4 = sc.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("***************************************************");
		System.out.println("*****          Situação final            **********");
		System.out.println("***************************************************\n");

		if (media >= 7) {

			System.out.printf("\nParabéns!!!!!!\nVocê está APROVADO. A sua média foi igual a: %.1f\n", media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("\nVoçê está de RECUPERAÇÃO, pois a sua média foi igual a: %.1f\n", media);
		} else {
			System.out.printf("\nInfelizmente voçê está REPROVADO, pois a sua média foi igual a: %.1f\n", media);
		}

	}

}
