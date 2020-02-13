package br.com.abc.javacore.exception.runtimeexception.test;

public class RuntimeexceptionTest {
    public static void main(String[] args) {
/*
        // EXEMPLO: java.lang.ArithmeticException
        // tentatida de calcular disisao por "0"
        int divisao = 10 / 0;
        System.out.println(divisao);
*/
/*
        // TRATAMENTO: java.lang.ArithmeticException
        int a = 10;
        int b = 0;
        if (b != 0){
            int c = a/b;
            System.out.println(c);
        }
 */
 /*
        // EXEMPLO: java.lang.NullPointerException
        // com o "objeto" nulo tenta chamar o metodo "toString"
        Object o = null;
        System.out.println(o.toString());
*/
/*
        // EXEMPLO: java.lang.ArrayIndexOutOfBoundsException ->
        // array com 2 posições e o programador imprime o indice 2, mas o indice final é 1
        int[] a = new int[2];
        System.out.println(a[2]);

*/

        try{
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("imprimindo depois da possivel execao");
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Fora do bloco catch");
    }
}
