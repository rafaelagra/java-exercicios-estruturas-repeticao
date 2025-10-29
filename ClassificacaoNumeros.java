import java.util.Scanner; //lê os dadoas do teclado

public class ClassificacaoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //captura a entrada do usuário

        //contadores para cada categoria: positivos, negativos e nulos
        int positivos = 0; //armazena a quantidade de números maiores que zero
        int negativos = 0; //armazena a quantidade de números menor que zero
        int nulos = 0; //armazena a quantidade de números igual a zero

        //loop para ler exatamente 15 números
        for (int i = 1; i <= 15; i ++) { // i começa em 1 e vai até 15
          System.out.print("Digite o " + i + "º número: "); //solicita ao usuário o número atual
            int numero = sc.nextInt(); //lê o número digitado pelo usuário

            //classificação do número usando estrutura condicional
            if (numero > 0) { //se o número for maior que zero
                System.out.println("o número é POSITIVO!"); //exibe mensagem
                positivos++; //incrementa o contador de positivos
            } else if (numero < 0) { //se o número for menor que zero
                System.out.println("o número é NEGATIVO!"); //exibe mensagem
                negativos++; //incrementa o contador de negativos
            } else { //caso contrário, o número é igual a zero
                System.out.println("o número é NULO!"); //exibe mensagem
                nulos++; //incrementa o contador de nulos
            }
        }
        //calculando os percentuais de cada categoria
        //usei 15.0 para garantir que a divisão seja feita com ponto flutuante (double)
        double percentualPositivos = (positivos / 15.0) * 100; //percentual de positivos
        double percentualNegativos = (negativos / 15.0) * 100; //percentual de negativos
        double percentualNulos = (nulos / 15.0) * 100; //percentual nulos

        //exibindo os resultados finais
        System.out.println("\n---RESULTADOS ---"); //cabeçalho dos resultados
        System.out.println("Percentual de positivos: " + percentualPositivos + "%"); //mostra percentual de positivos
        System.out.println("percentual de negativos: " + percentualNegativos + "%"); //mostra percentual de negativos
        System.out.println("percentual de nulos: " + percentualNulos + "%"); //mostra percentual de nulos

        sc.close(); //fecha scanner

    }
}
