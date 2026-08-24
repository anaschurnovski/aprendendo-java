package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio42 {

    static void main() {

        double saldo = 100.0;
        double valorProduto = 150.0;
        boolean clienteVip = true;
        String resultado;

        if (saldo >= valorProduto) {
            resultado = "Compra aprovada";

        } else if (clienteVip) {
            resultado = "Compra aprovada pelo crédito VIP";

        } else {
            resultado = "Compra recusada";
        }

        System.out.println(resultado);
    }
}
