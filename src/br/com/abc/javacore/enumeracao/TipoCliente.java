package br.com.abc.javacore.enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"){
        // sobrescrevendo o metodo getId para PESSOA_FISICA
        public String getId(){
            return "C";
        }
    }, PESSOA_JURIDICA(2, "Pessoa Juridica"){
        // sobrescrevendo o metodo getId para PESSOA_JURIDICA
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome){
        this.tipo = tipo;
        this.nome = nome;
    }

    // constant specific class body
    // corpo de classe especifico constante

    public String getId(){
        return "A";
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
