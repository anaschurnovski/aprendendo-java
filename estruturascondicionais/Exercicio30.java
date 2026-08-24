package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio30 {

    static void main() {

        int tipoCliente = 3;
        double valorCompra = 200.0;
        double desconto;

        if (tipoCliente == 1) {
            desconto = 0;

        } else if (tipoCliente == 2) {
            desconto = 0.05;

        } else if (tipoCliente == 3) {
            desconto = 0.10;

        } else if (tipoCliente == 4) {
            desconto = 0.15;

        } else {
            desconto = 0;

            double valorFinal = valorCompra - (valorCompra * desconto);

             System.out.println(valorFinal);
        }
    }
}
