package br.com.abc.introducao.controlefluxo;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;

        if(dia == 1){
            System.out.println("domingo");
        }else if (dia == 2){
            System.out.println("segunda");
        }
        //...

        // OU --------------------------------------
        // utilizar apenas: char, int, byte, short, enum e String

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                if(true){
                    System.out.println("true");
                }
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }

        // outro exemplo ----------------------------------

        char sexo = 'F';
        switch (sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
