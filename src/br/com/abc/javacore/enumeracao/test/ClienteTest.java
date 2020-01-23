package br.com.abc.javacore.enumeracao.test;

import br.com.abc.javacore.enumeracao.TipoCliente;
import br.com.abc.javacore.enumeracao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(cliente);

    }
}

