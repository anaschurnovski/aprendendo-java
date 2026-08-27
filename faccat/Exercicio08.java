package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class Exercicio08 {

    static void main() {

        int totalEleitores, brancos, nulos, validos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de eleitores: ");
        totalEleitores = sc.nextInt();

        System.out.println("Digite os votos brancos: ");
        brancos = sc.nextInt();

        System.out.println("Digite os votos nulos: ");
        nulos = sc.nextInt();

        System.out.println("Digite os votos válidos: ");
        validos = sc.nextInt();

        System.out.printf("Percentual brancos: %d%%\n", (brancos * 100) / totalEleitores);
        System.out.printf("Percentual nulos: %d%%\n", (nulos * 100) / totalEleitores);
        System.out.printf("Percentual validos: %d%%\n", (validos * 100) / totalEleitores);

        sc.close();
    }
}
