package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio39 {

    static void main() {

        double valorCompra = 180.0;

        double frete = (valorCompra >= 150) ? 0 : 20;

        System.out.println(frete);
    }
}
