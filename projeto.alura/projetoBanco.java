import java.util.Scanner;

public class projetoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Luiz Polessi";
        String tipoConta = "Corrente";
        double saldo_inicial = 2500;
        int opcao = 0;

        System.out.println("Dados iniciais do cliente: \n");
        System.out.println(" Nome do cliente: " + nome);
        System.out.println(" Tipo de conta: " + tipoConta);
        System.out.println(" Saldo inicial: R$" + saldo_inicial);
        System.out.println("\n**********************************");


        while (opcao != 5) {
            System.out.print("\n1. Consultar valor\n2. Transferir valor\n3. Receber valor\n4. Cancelar conta\n5. Sair\n");
            Scanner leitura = new Scanner(System.in);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo na conta é: R$"+saldo_inicial);
            }
            else if (opcao == 2) {
                System.out.print("Digite o valor de transferencia: R$");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo_inicial) {
                    System.out.println("Nao ha dinheiro suficiente ");
                }
                else {
                    saldo_inicial -= valorTransferencia;
                    System.out.println("Saldo da conta: R$" + saldo_inicial);
                }
            }
            else if (opcao == 3) {
                System.out.print("Digite o valor recebido: R$");
                double valorRecebido = leitura.nextDouble();
                saldo_inicial += valorRecebido;
                System.out.println("Saldo da conta: R$"+saldo_inicial);
            }

            else if (opcao == 4) {
                System.out.print("Tem certeza que deseja cancelar sua conta? (s/n): ");
                char confirmacao = scanner.next().charAt(0);
                if (confirmacao == 's' || confirmacao == 'S') {
                    System.out.println("Conta cancelada com sucesso.");
                    saldo_inicial = 0;
                    nome = "";
                    tipoConta = "";
                    break;
                }
                else {
                    System.out.println("Operação cancelada. Sua conta continua ativa.");
                }
            }

            else {
                    System.out.println("Ate mais!!");
                    break;
            }
        }
    }
}