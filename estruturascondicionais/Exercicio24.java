package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio24 {

    static void main() {

       double temparatura = 30;
       String categoria;

        if (temparatura < 15) {
            categoria = "Frio";

        } else if (temparatura >= 25) {
            categoria = "Agradável";

        } else if (temparatura >= 35) {
            categoria = "Quente";

        } else {
            categoria = "Muito quente";
        }

        System.out.println(categoria);
    }
}
