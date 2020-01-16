package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Vitor";
        estudante.idade = 23;
       // estudante.notas = new double[] {8,7,9};
        estudante.print();
        estudante.tirarMedia();
    }
}
