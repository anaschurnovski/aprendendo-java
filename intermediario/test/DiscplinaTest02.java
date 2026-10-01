package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DiscplinaTest02 {
    public static void main (String[] args){
        Disciplina disciplina = new Disciplina();
        Scanner sc = new Scanner(System.in);

        System.out.println("nome da disciplina");
        String nome = sc.nextLine();
        disciplina.nome = nome ;

        System.out.println("Digite a catga horaria");
        int horario = sc.nextInt();
        disciplina.cargaHoraria = horario ;

        System.out.println("nome do professor");
        String professor = sc.nextLine();
        disciplina.nomeProfessor = professor ;

        System.out.println("semestre");
        String semestre = sc.nextLine();
        disciplina.semestre = semestre ;
    }
}
