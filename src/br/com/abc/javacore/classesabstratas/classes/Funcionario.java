package br.com.abc.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    // sobrescrever um metodo abstrato em uma classe abstrata faz com que não seja
    // obrigatório sobrescrever este metodo na proxima classe "concreta"
    @Override
    public void imprime() {

    }

    public abstract void calculaSalario();

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
