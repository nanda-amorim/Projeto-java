import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        class ParametrosInvalidosException extends Exception {
            public ParametrosInvalidosException(String mensagem) {
                super(mensagem);
            }
        }
        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            int quantidadeIteracoes = parametroDois - parametroUm;
            for (int i = 1; i <= quantidadeIteracoes; i++) {
                System.out.println("Imprimindo Número" + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}









