public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        //byte, short, int, long, float, double = 0
        //boolean = false
        //reference = null

        nomes[0] = "Naruto";
        nomes[1] = "Naruto";
        nomes[2] = "Naruto";

        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
