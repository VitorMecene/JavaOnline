package br.com.abc.javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;
/*
    public void imprime(Professor aux){
        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.cpf);
        System.out.println(aux.rg);
        System.out.println("------------------------------");
    }
*/
    // this: é usado quando é nescessário pegar os valores de dentro do proprio objeto
    public void imprime(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println("------------------------------");
    }
}
