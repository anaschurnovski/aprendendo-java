package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio43 {

    static void main() {

        int idade = 25;
        boolean temCarteirinhaEstudante = true;
        String resultado;

        if (idade < 12 || temCarteirinhaEstudante) {
            resultado = "Paga meia entrada";

        } else {
            resultado = "Paga entrada inteira";
        }

        System.out.println(resultado);
    }
}
