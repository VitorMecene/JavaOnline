package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

    // public static void main(String... args) { ou
    // public static void main(String args[]) { ou
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);

        double result = calc.dividiDoisNumeros(20,4);
        System.out.println(result);

        calc.imprimeDoisNumerosDivididos(20,0);

        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
