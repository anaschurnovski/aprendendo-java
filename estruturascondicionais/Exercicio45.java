package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio45 {

    static void main() {

        double valorCompra = 350.0;
        double percentual;

        if (valorCompra <= 100) {
            percentual = 0;

        } else if (valorCompra <= 300) {
            percentual = 0.05;

        } else if (valorCompra <= 500) {
            percentual = 0.10;

        } else {
            percentual = 0.15;
        }

        double valorDesconto = valorCompra * percentual;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println(valorCompra);
        System.out.println((percentual * 100) + "%");
        System.out.println(valorDesconto);
        System.out.println(valorFinal);
    }
}
