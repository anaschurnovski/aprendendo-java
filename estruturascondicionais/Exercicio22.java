package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio22 {

    static void main() {

       int nota = 10;
       String categoria;

        if (nota >= 9) {
            categoria = "Excelente";

        } else if (nota >= 7){
            categoria = "Bom";

        } else if (nota >= 5) {
            categoria = "Recuperação";

        } else {
            categoria = "Reprovado";

        }

        System.out.println(categoria);
    }
}
