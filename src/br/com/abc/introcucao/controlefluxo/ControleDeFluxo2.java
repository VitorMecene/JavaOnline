package br.com.abc.introcucao.controlefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 20;

        if(idade<18){
            System.out.println("Não adulto");
        }else{
            System.out.println("Adulto");
        }

        // OU ----------------------------------------------

        String status;
        if(idade<18){
            status = "Não adulto";
        }else{
            status = "Adulto";
        }
        System.out.println(status);

        // OU -----------------------------------------------

        status = idade < 18 ? "Não adulto":"Adulto";
        System.out.println(status);

        // OU -----------------------------------------------

        // não é aconselhavel a fazer, pois dificulta o entendimento se comparado a um "if" normal.
        status = idade < 18 ? "INFANTIL" : idade >= 15 && idade < 18 ? "JUVENIL":"ADULTO";
        System.out.println(status);

    }


}
