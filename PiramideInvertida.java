import java.util.Scanner; //importa a classe scanner para entrada de dados

public class PiramideInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto scanner para ler o teclado

        //solicita ao usuário que digite o valor de N
        System.out.print("Digite um número inteiro N: ");
        int n = sc.nextInt(); //lê o número digitado

        //loop externo: controla o número de linhas, começa em N e vai até 1
        for (int i = n; i >= 1; i--) {
            //loop interno: imprime os números de 1 até o valor atual de i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); //imprime o número com espaço
            }
            System.out.println(); //quebra de linha depois de imprimir os números da linha atual
        }

        sc.close(); //fecha o scanner
    }
}
