package flamingo.aprendendo.intermediario.dominio;

public class Aluno {
    public String nome;
    public double nota;

    public boolean isAprovado () {
        return nota >= 7;
    }

    public String verificarConvite() {
        if (isAprovado()) {
            return nome + " foi aprovada e recebeu o convite.";
        }
        return nome + "não foi aprovado, sem festa";
    }
}
