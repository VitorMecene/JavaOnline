public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros1 = new int[5];
        int[] numeros2 = {1,2,3,4,5}; // tamanho = 5, index = 0 a 4
        int[] numeros3 = new int[]{1,2,3,4,5};

        for(int aux : numeros2){
            System.out.println(aux);
        }
    }
}
