package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Carro;
import flamingo.aprendendo.intermediario.dominio.ImpressoraCarro;

import java.util.Scanner;

public class CarroTest {
    static void main() {

        ImpressoraCarro impressora = new ImpressoraCarro();

        Scanner sc = new Scanner(System.in);
        Carro carro01 = new Carro();

        System.out.println("Digite o nome do carro: ");
        carro01.nome = sc.nextLine();

        System.out.println("Digite a marca do carro: ");
        carro01.marca = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        carro01.ano = sc.nextInt();

        System.out.println("Digite a velocidade do carro: ");
        carro01.velocidadeAtual = sc.nextInt();

        impressora.imprime(carro01);

        sc.close();


    }
}
