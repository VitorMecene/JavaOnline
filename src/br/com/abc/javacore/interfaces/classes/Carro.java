package br.com.abc.javacore.interfaces.classes;

public class Carro implements Tributavel {
    // do mais restrito <--> para o o mais publico
    //   private > default > protected > public

    // quanto é deixado em branco esta referencia sub-entende que vc esta utilizando o modificado acesso de pacote
    // não há problema em deixar em branco o mesmo na classe de interface por causa do padrão da mesma que não pode ser alterado
    // mas quando o mesmo for sobrescrito em uma classe comum, será obrigatorio evidenciar sua origem

    @Override
    public void calculaImposto() {

    }
}
