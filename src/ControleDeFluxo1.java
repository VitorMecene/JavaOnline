public class ControleDeFluxo1 {
    public static void main(String[] args) {

        if (true){
            System.out.println("entrou no if true");
        }

        int idade = 20;
        float salario = 2000;
        if (idade > 18){
            System.out.println("entrou no clube");
        }

        boolean c = false;
        if (c == true){ // sinal de comparacao e nao de atribuiçao
            System.out.println("entrou no if");
        }

        if (idade >= 18){
            System.out.println("entrou no clube");
        }else{
            System.out.println("nao pode entrar no clube");
        }

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 adulto

        if (idade < 15){
            System.out.println("categoria infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("juvenil");
        }else{
            System.out.println("adulto");
        }

        String categoria;
        if (idade < 15){
            categoria = "infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
