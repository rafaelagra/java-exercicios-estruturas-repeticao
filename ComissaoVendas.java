import java.util.Scanner;  //lê os dados dos usuários

public class ComissaoVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criado para a entrada de dados

        System.out.println("Olá,este programa calcula comissão de vendas!");
        System.out.print("Digite a quantidade de vendedores: ");
        int qtdVendedores = sc.nextInt(); //lê a quantidade informada pelo usuário

        //variáveis para armazenar totais e melhor vendedor
        double totalVendas = 0; //soma de todas as vendas
        double totalComissoes = 0; //soma de todas as comissões
        String melhorVendedor = ""; //nome do vendedor com maior venda
        double maiorVenda = 0; //valor da maior venda registrada

        //loop para ler os dados de cada vendedor
        for (int i = 1; i <=qtdVendedores; i++) {
            System.out.println("\n--- Vendedor " + i + " ---");

            //lê o nome do vendedor
            System.out.print("Nome do vendedor: ");
            sc.nextLine(); //limpa o buffer do teclado
            String nome = sc.nextLine(); //lê o nome completo

            //lê o valor vendido pelo vendedor
            System.out.print("Valor vendido: ");
            double valorVendido = sc.nextDouble();

            //calcula a comissão (5 % do valor vendido)
            double comissao = valorVendido * 0.05;

            //exibe a comissão do vendedor
            System.out.println("Comissão do vendedor " + nome + ": R$ " + comissao);

            //atualiza totais
            totalVendas += valorVendido;
            totalComissoes += comissao;

            //verifica se este vendedor tem a maior venda
            if (valorVendido > maiorVenda) {
                maiorVenda = valorVendido;
                melhorVendedor = nome;
            }
        }
        //exibe os resultados finais
        System.out.println("\n=== RESULTADOS FINAIS ===");
        System.out.println("Quantidade de vendedores: " + qtdVendedores);
        System.out.println("valor total vendido: R$ " + totalVendas);
        System.out.println("valor total pago em comissões: R$ " + totalComissoes);
        System.out.println("Melhor vendedor: " + melhorVendedor);
        System.out.println("valor da maior venda: R$ " + maiorVenda);
        System.out.println("Comissão do melhor vendedor: R$ " + (maiorVenda * 0.05));

        sc.close(); //fecha o scanner
    }
}
