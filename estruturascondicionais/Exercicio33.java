package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio33 {

    static void main() {

        double saldo = 300.0;
        double valorProduto = 250.0;

        String resultado = (saldo >= valorProduto) ? "Compra aprovada" : "Saldo insuficiente";

        System.out.println(resultado);
    }
}
