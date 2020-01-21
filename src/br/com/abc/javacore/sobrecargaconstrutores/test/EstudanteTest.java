package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("1212", "carlos", new double[]{5, 7, 9}, "20/01/2020");
        est.imprime();
    }
}
