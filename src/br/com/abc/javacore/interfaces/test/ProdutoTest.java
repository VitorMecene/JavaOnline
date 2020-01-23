package br.com.abc.javacore.interfaces.test;

import br.com.abc.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4,3000);
        p.calculaFrete();
        p.calculaImposto();
        System.out.println(p);
    }

}
