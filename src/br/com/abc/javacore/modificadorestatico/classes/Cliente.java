package br.com.abc.javacore.modificadorestatico.classes;

public class Cliente {
    // 1 - Bloco de inicialização static é executado quando a JVM carregar a classe (é executado apenas uma vez)
    // 2 - Alocado espaço de na memoria para o objeto que será criado
    // 3 - Cada atributo de classe é criado e inicializado com seus valores default ou explicitos
    // 4 - Bloco de inicialização padrão é executado
    // 5 - O construtor é executado
    private static int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    {
        System.out.println("Dentro do bloco de inicializacao padrão");
    }

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao estatico");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
