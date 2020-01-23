package br.com.abc.javacore.interfaces.test;

import br.com.abc.javacore.interfaces.classes.Produto;
import br.com.abc.javacore.interfaces.classes.Tributavel;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4,3000);

        // é possivel criar uma variavel de referencia para uma interface
        // Tributavel t;

        // mas não é possivel criar um objeto para a interface, pois a mesma não é estanciavel
        // Tributavel tr = new Tributavel();

        p.calculaFrete();
        p.calculaImposto();
        System.out.println(p);
    }

}
