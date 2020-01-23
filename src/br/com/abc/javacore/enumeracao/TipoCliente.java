package br.com.abc.javacore.enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
