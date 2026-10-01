package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Aluno;

public class AlunoTest {
    static void main() {
        Aluno aluno01 = new Aluno();

        aluno01.nome = "Ana";
        aluno01.nota = 10;

        System.out.println("Aluno(a): " + aluno01.nome);
        System.out.println("Nota: " + aluno01.nota);
        System.out.println("Aprovado: " + aluno01.isAprovado());
        System.out.println(aluno01.verificarConvite());
    }
}
