package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticao02 {
    static void main() {

        // while

        /** int contador = 1;

        while (contador <= 10) {
            System.out.println(contador);

            contador++;
        } */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número (1 a 10) da tabuada desejada: ");

        int numero = sc.nextInt();

        int contador = 1;

        while (contador <=10) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);

            contador++;

        }

        sc.close();

    }
}
