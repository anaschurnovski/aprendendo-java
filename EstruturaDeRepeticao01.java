package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticao01 {
    static void main() {

        // for
        // while
        // do while

        /** for(int contador = 0; contador <= 10; contador++) {
         System.out.println(contador);
         } */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número (1 a 10) da tabuada desejada: ");

        int numero = sc.nextInt();


        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(numero + "x" + contador + " = " + numero * contador);
        }

        sc.close();

    }
}
