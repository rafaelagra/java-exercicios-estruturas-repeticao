public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Este programa contabiliza os números pares de 1 até 27.");

        //usei o loop for porque sei o intervalo (1 até 27)
        for (int i = 1; i <= 27; i++) { // i começa em 1 e vai até 27

            //verifiquei se o número é par usando o operador %
            if(i % 2 == 0) { //se o resto da divisão por 2 for zero, é par
                System.out.println(i); //exibe o número par na tela
            }

        }

    }
}