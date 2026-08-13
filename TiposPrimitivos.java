package flamingo.apredendo.introducao;

public class TiposPrimitivos {

    public static void main (String[] args) {
        // byte : -128 a 127
        // short : -32.768 a 32.767
        // int : -2 Bilhões a 2 Bilhões
        // long : para números inteiros muito grandes (colocar L no final)
        // float : precisão simples (colocar f no final)
        // double : precisão dupla, padrão para decimais no java
        // char : guarda uma única letra ou símbolo em formato Unicode
        // boolean : guarda apenas dois valores: true or false
        byte idade = 22;
        int municipio = 114000000;
        long contaBancaria = 999999999999999999L;
        float salario = 25000.90f;
        double salarioExtra = 35000.45;
        char primeiraLetraNome = 'A';
        boolean vaiPraFesta = false;
        System.out.println("Minha idade é "+ idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " milhões de moradores");
        System.out.println("Minha conta bancária " + contaBancaria);
        System.out.println("Meu salário " + salario);
        System.out.println("Meu PL" + salarioExtra);
        System.out.println("Primeira letra do meu nome: " + primeiraLetraNome);
        System.out.println(vaiPraFesta);
    }
}
