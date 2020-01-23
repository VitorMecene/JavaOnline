package br.com.abc.javacore.enumeracao.classes;

import br.com.abc.javacore.enumeracao.TipoCliente;

public class Cliente {

    public enum TipoPagamento{
        AVISTA, APRAZO
    }

    private String nome;
    private TipoCliente tipoCli;
    private TipoPagamento tipoPag;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPag) {
        this.nome = nome;
        this.tipoCli = tipo;
        this.tipoPag = tipoPag;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCli.getNome() +
                ", tipoPag=" + tipoPag +
                ", numero="+ tipoCli.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPag() {
        return tipoPag;
    }

    public void setTipoPag(TipoPagamento tipoPag) {
        this.tipoPag = tipoPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCli() {
        return tipoCli;
    }

    public void setTipoCli(TipoCliente tipoCli) {
        this.tipoCli = tipoCli;
    }
}
