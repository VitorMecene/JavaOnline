package br.com.abc.introducao.controlefluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }

        // numeros pares de 0 até 100000
        int valor = 100000;
        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
