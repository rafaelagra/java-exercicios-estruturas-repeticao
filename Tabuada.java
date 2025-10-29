import java.util.Scanner; //lê a entrada do usuário no teclado

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //captura o número digitado pelo usuário

        System.out.print("Digite um número para ver sua tabuada: "); //solicitei ao usuário para digitar um número
        int numero = sc.nextInt(); //lê o número e armazena na variável 'numero'

        //gerando a tabuada usando o loop for
        for (int i = 1; i <=10; i++) { // i começa em 1 e vai até 10
            int resultado = numero * i; //calcula o produto do número pelo contador i
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        sc.close(); //fecha o scanner
    }
}

