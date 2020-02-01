package br.com.abc.javacore.polomorfismo.classes;

public class Gerente extends Funcionario {
    private double participacaoLucro;

    public Gerente(String nome, double salario, double participacaoLucro) {
        super(nome, salario);
        this.participacaoLucro = participacaoLucro;
    }

    public double getParticipacaoLucro() {
        return participacaoLucro;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + participacaoLucro;
    }

    public void setParticipacaoLucro(double participacaoLucro) {
        this.participacaoLucro = participacaoLucro;
    }
}
