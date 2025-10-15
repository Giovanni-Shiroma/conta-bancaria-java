import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double saldo = 2500.0;

        consultaDeDados(saldo);
        menuDeOpcoes(saldo);
    }

    public static void consultaDeDados(double saldo) {
        String nome = "Junior da Silva";
        String tipoConta = "Corrente";

        System.out.printf("""
                ***********************
                Dados do cliente:
                
                Nome: %s
                Tipo Conta: %s
                Saldo: R$ %.2f
                ***********************
                %n""", nome, tipoConta, saldo);
        menuDeOpcoes(saldo);
    }

    public static void menuDeOpcoes(double saldo) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("""
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                %n""");

        int operacoes = leitura.nextInt();

        if (operacoes == 1) {
            consultaDeDados(saldo);
        } else if(operacoes == 2) {
            recebeTransferencia(saldo);
        } else if(operacoes == 3) {
            transferirValor(saldo);
        } else if(operacoes == 4) {
            return;
        } else {
            System.out.println("Operação inválida!");
            menuDeOpcoes(saldo);
        }

    }

    public static void transferirValor(double saldo) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o valor para transferir: ");

        double valorTransferido = leitura.nextDouble();
        if(saldo < valorTransferido) {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
            System.out.println("Saldo: R$ " + saldo);
            menuDeOpcoes(saldo);
        } else  {
            saldo = saldo - valorTransferido;
            System.out.println("Saldo atualizado: R$ " + saldo);
            menuDeOpcoes(saldo);
        }
    }

    public static void recebeTransferencia(double saldo) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o valor a receber: ");

        double valorRecebido = leitura.nextDouble();
        saldo = saldo + valorRecebido;

        System.out.println("Saldo atualizado: R$ " + saldo);

        if(valorRecebido != 0) {
            menuDeOpcoes(saldo);
        }
    }
}
