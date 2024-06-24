import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        imprimirDespositoFeito();
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
        
        imprimirSaldo();
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0 || valorSaque > saldo) {
            imprimirException();
        } else {
            saldo -= valorSaque;
            System.out.println("Saque feito.");
            imprimirSaldo();
        }
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

    private void imprimirException() {
        System.out.println("Saldo insuficiente. Saque não realizado.");
    }
    private void imprimirDespositoFeito(){
      System.out.println("Deposito feito.");
    }
}