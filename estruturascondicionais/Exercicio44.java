package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio44 {

    static void main() {

        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        boolean contaAtiva = false;

        String resultado;

        if (emailCorreto && senhaCorreta && contaAtiva) {
            resultado = "Login realizado";

        } else if (!emailCorreto || !senhaCorreta) {
            resultado = "Dados inválidos";

        } else {
            resultado = "Conta bloqueada";
        }

        System.out.println(resultado);
    }
}
