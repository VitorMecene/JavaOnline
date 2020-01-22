package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Gina");
        Endereco end = new Endereco();

        p.setCpf("213156");
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        p.setEndereco(end);

        p.imprime();

        System.out.println("-------------------------------------");

        Funcionario f = new Funcionario("Augusto");

        f.setCpf("92951561");
        f.setSalario(15000);
        f.setEndereco(end);

        f.imprime();
    }
}
