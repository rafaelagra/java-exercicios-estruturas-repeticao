import java.util.Scanner; //lê a entrada do usuário

public class Frigorifico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //cria objeto scanner para entrada

        //solicita a quantidade de bois
        System.out.print("Digite a quantidade de Bois: ");
        int qtdBois = sc.nextInt(); //lê a quantidade informada pelo usuário

        //variáveis para armazenar informações
        double pesoTotal = 0; //soma dos pesos para calcular média
        int idMaisMagro = 0; //ID do boi mais magro
        double pesoMaisMagro = Double.MAX_VALUE; //inicializa com valor muito alto //Double.MAX_VALUE → Garante que qualquer peso será menor que esse valor inicial.
        int idMaisGordo = 0; //ID do boi mais gordo
        double pesoMaisGordo = Double.MIN_VALUE; //inicializa com valor muito baixo //Double.MIN_VALUE → Garante que qualquer peso será maior que esse valor inicial.

        //loop para ler dados de cada boi
        for (int i = 1; i <= qtdBois; i++) {
            System.out.println("\n--- Boi " + i + " ---");

            //lê o número de identificação
            System.out.print("Número de identificação: ");
            int id = sc.nextInt();

            //lê o peso do boi
            System.out.print("Peso doi Boi (em Kg): ");
            double peso = sc.nextDouble();

            //atualiza o peso total
            pesoTotal += peso;

            //verifica se é o boi mais magro
            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                idMaisMagro = id;
            }
            //verifica se é o boi mais gordo
            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                idMaisGordo = id;
            }
        }

        //calcula peso médio
        double pesoMedio = pesoTotal / qtdBois;

        //exibe resultados finais
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Boi mais magro: ID " + idMaisMagro + " | Peso: " + pesoMaisMagro + "Kg");
        System.out.println("Boi mais gordo: ID " + idMaisGordo + " | Peso: " + pesoMaisGordo + "Kg");
        System.out.println("Peso médio dos bois: " +pesoMedio + "Kg");

        sc.close(); //fecha o scanner
    }
}
