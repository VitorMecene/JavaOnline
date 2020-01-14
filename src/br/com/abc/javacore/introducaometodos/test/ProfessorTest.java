package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.matricula = "1518";
        prof1.nome = "Jaqueline";
        prof1.cpf = "421.051.408-07";
        prof1.rg = "42.438.315-09";

        Professor prof2 = new Professor();
        prof2.matricula = "1518";
        prof2.nome = "Jaqueline";
        prof2.cpf = "421.051.408-07";
        prof2.rg = "42.438.315-09";

        // Quando é passado tipo primitivo é uma copia do valor

        // Quando é passdo tipo reference, está sendo passado a referencia
        // de um valor para uma varialvel distinta

        // Quando é passado variavel do tipo reference, o que esta sendo passado
        // na verdade é o endereço de memoria do objeto especifico

        /*
        prof1.imprime(prof1);
        prof1.imprime(prof2);
        */

        prof1.imprime();
        prof2.imprime();
    }
}
