package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio17 {

    static void main() {

        byte idade = 22;
        boolean isCNH = true;

        if (idade >= 18 && isCNH) {

            System.out.println("Pode dirigir.");
        } else {

            System.out.println("Não pode dirigir.");
        }
    }
}
