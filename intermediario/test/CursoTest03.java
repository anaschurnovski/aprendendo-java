package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTest03 {
    public static void main (String[] args){
        Curso curso = new Curso();
        Scanner sc = new Scanner(System.in);


        System.out.println("nome do curso");
        String nome = sc.nextLine();
        curso.nome = nome ;

        System.out.println("duração do curso");
        String duracao = sc.nextLine();
        curso.duracao = duracao ;

        System.out.println("mensalidade");
        int mensalidade = sc.nextInt();
        curso.mensalidade = mensalidade ;

    }
}
