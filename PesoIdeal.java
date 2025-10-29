import java.util.Scanner; //importa a entrada de dados

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //objeto scanner

        String continuar = "S"; //inicializa a variável 'continuar' com "S" para garantir que o loop execute ao menos uma vez.

        System.out.println("Olá,Este programa calcula seu peso ideal baseado em sua altura e sexo."); //mensagem inicial do programa

        do {
            System.out.print("Digite a altura (em metros): "); //solicita a altura da pessoa
            double altura = sc.nextDouble(); //lê a altura

            sc.nextLine(); //limpa o buffer do teclado

            System.out.print("Digite o sexo (M/F): ");
            String sexo = sc.nextLine().trim().toUpperCase(); //lê e normaliza o sexo

            //verifica se o sexo é válido
            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo inválido! Digite apenas M ou F."); //mensagem de erro
                continue; //volta para o inicio do loop
            }

            double pesoIdeal; //variável para armazenar peso ideal

            //calcula o peso ideal com base no sexo
            if (sexo.equals("M")) {
                pesoIdeal = 72.7 * altura - 58; //fórmula para homens
            } else {
                pesoIdeal = 62.1 * altura - 44.7; //fórmula para mulheres
            }

            System.out.printf("O peso ideal é: %.2f kg\n", pesoIdeal); //exibe o resultado

             //pergunta se o usuario deseja continuar
            System.out.print("DESEJA CONTINUAR (S/N)?: ");
            continuar = sc.nextLine().trim().toUpperCase(); //lê e normaliza a resposta

            //valida a resposta
            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.print("Resposta inválida! Digite apenas S ou N: "); //mensagem de erro
                continuar = sc.nextLine().trim().toUpperCase();
            }
        } while (continuar.equals("S")); //repete enquanto a resposta for 'S'

        System.out.println("Programa encerrado");
        sc.close(); //fecha o scanner
    }
}