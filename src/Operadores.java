public class Operadores {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        System.out.println("A soma é: " + numero1 + numero2); // neste caso o sinal "+" é usado para concatenar;
        System.out.println("A soma é: " + (numero1 + numero2));
        System.out.println("A soma é: " +soma);

        //------------------------------------------------------------------------------------

        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;
        int resto = 20%2;
        System.out.println("Resto da divisao "+ (20 % 2));
        System.out.println("Resto da divisao "+ resto);
        System.out.println(numeroDouble);
    }
}
