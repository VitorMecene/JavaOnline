package br.com.abc.javacore.introducaometodos.classes;

import java.util.concurrent.atomic.AtomicInteger;

// COESÃO: Alta coesão significa que a classe é mais especifica

// ACOPLAMENTO: é o quanto uma classe ta relacionada com a outra. Quanto menos melhor,
// pois qualquer alteração que for feita em uma não impactará na outra

// ENCAPSULAMENTO: Criar metodos de acesso para proteger o codigo

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print(){
        System.out.println("Nome:" +this.nome);
        System.out.println("Idade:" +this.idade);
        if(this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }

    }

    public void tirarMedia(){
        if(this.notas == null){
            System.out.println("\nEsse aluno não tem notas");
            return;
        }

        double media = 0;

            for (double nota : this.notas) {
                media += nota;
            }

        media = media / this.notas.length;

        if (media > 6){
            this.aprovado = true;
            System.out.println("aprovado");
        } else {
            this.aprovado = false;
            System.out.println("reprovado");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    /* Isso permite que a situação de aprovado eu reprovada seja modificada.
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    */
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean isAprovado(){
        return this.aprovado;
    }
}
