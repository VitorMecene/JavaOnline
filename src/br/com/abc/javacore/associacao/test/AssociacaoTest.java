package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.exercicio1.Aluno;
import br.com.abc.javacore.associacao.exercicio1.Local;
import br.com.abc.javacore.associacao.exercicio1.Professor;
import br.com.abc.javacore.associacao.exercicio1.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Vitor", "23");
        Aluno aluno2 = new Aluno("Jaqueline", "20");

        Seminario sem = new Seminario("Java completo");
        Professor prof = new Professor("Andresa","Programação");
        Local local = new Local("Essa Mesma","Logo Ali");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno, aluno2});// <-- ou

        Seminario[] semArray = new Seminario[1];// <--
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();



    }
}
