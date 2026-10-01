package flamingo.aprendendo.intermediario.dominio;

public class Carro {
    public String nome;
    public String marca;
    public int ano;
    public double velocidadeAtual;

    public boolean isMultado (int limiteVia) {
        return velocidadeAtual > limiteVia;
    }

    public String verificarMulta (int limiteVia) {
        if (isMultado(limiteVia)) {
            return "Você foi multado.";
        }

        return "Dentro do limite";
    }
}
