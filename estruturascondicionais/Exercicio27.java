package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio27 {

    static void main() {

        int codigoProduto = 5;
        String categoria;

        if (codigoProduto == 1) {
            categoria = "Eletrônico";

        } else if (codigoProduto == 2) {
            categoria = "Alimento";

        } else if (codigoProduto == 3) {
            categoria = "Roupa";

        } else if (codigoProduto == 4) {
            categoria = "Livro";

        } else {
            categoria = "Categoria inválida";
        }

        System.out.println(categoria);
    }
}
