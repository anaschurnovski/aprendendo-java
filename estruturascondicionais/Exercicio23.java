package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio23 {

    static void main() {

       double salario = 1700.00;
       String categoria;

        if (salario <= 1500) {
            categoria = "Salário baixo";

        } else if (salario <= 3000) {
            categoria = "Salário médio";

        } else if (salario <= 7000) {
            categoria = "Salário bom";

        } else {
            categoria = "Salário alto";
        }

        System.out.println(categoria);
    }
}
