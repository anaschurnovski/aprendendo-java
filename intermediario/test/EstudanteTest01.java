package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("digite o nome do estudante");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("digite sua idade");
        int idade = sc.nextInt();
        estudante.idade = idade;

        System.out.println("digite seu rg");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("digite seu numero");
        String numero = sc.nextLine();
        estudante.tel = numero;

        System.out.println("qual curso");
        String curso = sc.nextLine();
        estudante.curso = curso;

        System.out.println(estudante.nome + estudante.idade + estudante.rg + estudante.tel + estudante.curso);
    }
}
