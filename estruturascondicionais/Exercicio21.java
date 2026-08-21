package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio21 {

    static void main() {

       byte idade = 22;
       String categoria;

        if (idade < 12) {
            categoria = "Criança";
        } else if (idade <= 17) {
            categoria = "Adolescente";
        } else if (idade <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        System.out.println(categoria);
    }
}


