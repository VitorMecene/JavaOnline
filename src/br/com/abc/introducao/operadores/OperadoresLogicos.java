package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        int idade = 18;
        float salario = 1000f;

        System.out.println("Operador logico E:");
        System.out.println(idade >= 18 && salario >= 1000);
        System.out.println(idade >= 18 && salario >= 3000);

        System.out.println("Operador logico OU:");
        System.out.println(idade >= 18 || salario >= 1000);
        System.out.println(idade >= 18 || salario >= 3000);
    }
}
