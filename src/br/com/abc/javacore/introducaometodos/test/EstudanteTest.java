package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("Vitor");
        estudante.setIdade(-1);
        estudante.setNotas(new double[] {8,7,9});
        estudante.print();
        estudante.tirarMedia();
        System.out.println("Aprovado?" +estudante.isAprovado());
    }
}
