public class ControleDeFluxo5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            } else {
                System.out.println("Saindo do laço");
                break;
            }

            // ou ---------------------------------------------------------------------
            /*
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
            */
        }
        System.out.println("fora do laço");
    }
}
