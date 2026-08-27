package flamingo.aprendendo.basico.faccat;

import java.util.Scanner;

public class Exercicio06 {

    static void main() {

        double altura, base, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A área do retângulo = %.2f", area);

        sc.close();
    }
}
