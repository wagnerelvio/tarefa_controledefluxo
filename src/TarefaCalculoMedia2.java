import java.util.Locale;
import java.util.Scanner;

/**
 * C�lculo da m�dia do aluno e informe sobre a sua situa��o escolar.
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
		System.out.println("***  C�lculo da m�dia e situa��o do aluno    ******");
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
		System.out.println("*****          Situa��o final            **********");
		System.out.println("***************************************************\n");

		if (media >= 7) {

			System.out.printf("\nParab�ns!!!!!!\nVoc� est� APROVADO. A sua m�dia foi igual a: %.1f\n", media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("\nVo�� est� de RECUPERA��O, pois a sua m�dia foi igual a: %.1f\n", media);
		} else {
			System.out.printf("\nInfelizmente vo�� est� REPROVADO, pois a sua m�dia foi igual a: %.1f\n", media);
		}

	}

}
