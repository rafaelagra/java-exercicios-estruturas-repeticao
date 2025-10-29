import java.util.Scanner; //lê entrada de dados

public class ListaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto scanner para ler do teclado

        //solicita ao usuario que digite o valor de N
        System.out.print("Digite um número inteiro N: "); //define o tamanho da sequência
        int n = sc.nextInt(); //lê o número digitado

        //loop externo: controla as linhas (de 1 até N)
        for (int i = 1; i <= n; i++) {
            //loop interno: imprime os números de 1 até i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); //imprime o número com espaço
            }
            System.out.println(); //quebra a linha depois de imprimir os números da linha atual
        }

        sc.close(); //fecha o scanner
    }
}
