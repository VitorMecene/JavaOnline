package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();

        prof1.nome = "Andresa";
        prof1.matricula = "1717";
        prof1.cpf = "42105140807";
        prof1.rg = "424383159";

        prof2.nome = "Vanessa";
        prof2.matricula = "1721";
        prof2.cpf = "125.478.258-45";
        prof2.rg = "48.512.212-07";

        // prof1 = prof2; // atribui os valores de prof2 para prof1, ignorando os dados atribuidos em prof1;

        System.out.println(prof1.nome);
        System.out.println(prof1.matricula);
        System.out.println(prof1.cpf);
        System.out.println(prof1.rg);

        System.out.println("---------------------------------");

        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.cpf);
        System.out.println(prof2.rg);
    }
}
