package br.com.abc.javacore.introducaometodos.classes;

import java.util.concurrent.atomic.AtomicInteger;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void print(){
        System.out.println("Nome:" +this.nome);
        System.out.println("Nome:" +this.idade);
        if(notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }

    }

    public void tirarMedia(){
        if(notas == null){
            System.out.println("\nEsse aluno não tem notas");
            return;
        }

        double media = 0;

            for (double nota : notas) {
                media += nota;
            }

        media = media / notas.length;

        if (media > 6){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
