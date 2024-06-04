import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
 
        // nome do cliente

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        // número da agencia com 4 digitos

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        if (agencia.length() != 4) {
              System.out.println("Por favor, digite uma agência válida com 4 dígitos: "); 
              agencia = scanner.next();
            
            }else {
                System.out.println("Número da agencia digitada: " + agencia);       
            }

        // numero da conta com 6 digitos

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        if (String.valueOf(numeroConta).length() != 6){
            System.out.println("Por favor, digite um número de conta válido com 6 dígitos: ");
            numeroConta = scanner.nextInt();
        } else {
                System.out.println("Número da conta digitada: " + numeroConta); 
        }

        // saldo
        System.out.println("Qual valor gostaria de depositar no momento? ");
        double saldo = scanner.nextDouble();

        //mensagem final

        System.out.println ("Olá" + " " + nomeCliente  + " obrigado por criar uma conta em nosso banco.\n" + 
                            "Sua agência é" +" " + agencia + " " + ""  + "conta" + " " + numeroConta + "\n " + 
                            "Seu saldo atual é " + " " +  saldo + " e  já está disponível para saque");
                          
    
        scanner.close(); 

        

 
                
    }
}
