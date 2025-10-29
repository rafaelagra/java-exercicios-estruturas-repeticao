import java.util.Scanner;//importei a classe scanner para entrada de dados

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto scanner para ler do teclado

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = sc.nextInt(); //lê o número digitado

        //verifica se o número é negativo
        if (numero < 0) {
            System.out.println("Não existe fatorial de número negativo!"); //exibe mensagem de erro para números negativos
        } else {
            long fatorial = 1; //inicializa a variável do fatorial com 1

            //se o número for maior que 0, calcula o fatorial
            for (int i = 1; i <= numero; i ++) {
                fatorial *= i; //multiplica o fatorial pelo valor atual de i
            }

            //exibe o resultado final
            System.out.println("o fatorial de " + numero + " é: " + fatorial);
        }

        sc.close(); //fecha o scanner
    }
}
