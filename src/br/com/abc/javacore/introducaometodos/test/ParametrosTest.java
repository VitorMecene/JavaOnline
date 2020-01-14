package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do test");
        System.out.println("num1: "+num1);
        System.out.println("num1: "+num2);

        // Quando é passado argumentos do tipo primitivo para o metodo,
        // o que está sendo passado é uma copia desses valores, por tanto,
        // os valores originais nunca serão aterados
    }
}
