package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio41 {

    static void main() {

        double nota = 9.0;
        double presenca = 80.0;
        String resultado;

        if (nota >= 7 && presenca >= 75) {
            resultado = "Aprovado";

        } else if (nota >= 5 && nota < 7) {
            resultado = "Recuperação";

        } else {
            resultado = "Reprovado";
        }

        System.out.println(resultado);
    }
}

