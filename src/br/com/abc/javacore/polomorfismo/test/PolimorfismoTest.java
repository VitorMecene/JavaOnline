package br.com.abc.javacore.polomorfismo.test;

import br.com.abc.javacore.polomorfismo.classes.Funcionario;
import br.com.abc.javacore.polomorfismo.classes.Gerente;
import br.com.abc.javacore.polomorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polomorfismo.classes.Vendedor;

public class PolimorfismoTest {

    public static void main(String[] args) {
        Gerente g = new Gerente("Osvaldo", 5000,2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);

//        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        relatorio.relatorioPagamentoVendedor(v);

        RelatorioPagamento relatorio = new RelatorioPagamento();

        relatorio.relatorioPagamentoGenerico(g);
        relatorio.relatorioPagamentoGenerico(v);
    }
}
