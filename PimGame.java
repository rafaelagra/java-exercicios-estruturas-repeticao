public class PimGame {
    public static void main(String[] args) {

        System.out.println("Este programa imprime 'Pim' nos números múltiplos de 4.");
        for (int i = 1; i <=30; i++) { //loop para percorrer números de 1 até 30
            //verifica se o número é múltiplo de 4
            if (i % 4 == 0) {
              System.out.print("pim "); //exibe "pim" no lugar do número
            } else {
                System.out.print(i + " "); //exibe o número normalmene
            }
        }
    }
}
