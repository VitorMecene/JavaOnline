package br.com.abc.introcucao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        salario = salario + 1000;
        salario += 1000;

        salario *= 1.0;
        salario = salario + (int) (salario * 1.0); // salario + 10% do salario

        System.out.println(salario);
    }
}
