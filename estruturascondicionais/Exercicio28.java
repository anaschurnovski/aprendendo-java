package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio28 {

    static void main() {

        int plano = 2;
        String descricao;

        if (plano == 1) {
            descricao = "Plano Básico - R$ 29,90";

        } else if (plano == 2) {
            descricao = "Plano Intermediário - R$ 59,90";

        } else if (plano == 3) {
            descricao = "Plano Premium - R$ 99,90";

        } else {
            descricao = "Plano inválido";
        }

        System.out.println(descricao);
    }
}
