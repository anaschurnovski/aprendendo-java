package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class Exercicio07 {

    static void main() {

        int dia, mes, idade, totalDias;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite os meses adicionais: ");
        mes = sc.nextInt();

        System.out.println("Digite os dias adicionais: ");
        dia = sc.nextInt();

        totalDias = (idade * 365) + (mes * 30) + dia;

        System.out.printf("Você têm total dias de vida: %d", totalDias);

        sc.close();
    }
}
