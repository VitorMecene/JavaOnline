package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);

        double result = calc.dividiDoisNumeros(20,4);
        System.out.println(result);

        calc.imprimeDoisNumerosDivididos(20,0);
    }
}
