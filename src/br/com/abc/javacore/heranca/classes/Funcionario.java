package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Bloco static de funcionario");
    }

    {
        System.out.println("Bloco padrão 1 de funcionario");
    }

    {
        System.out.println("Bloco padrão 2 de funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do contrutor funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu "+super.nome+" recebi o pagamento de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
