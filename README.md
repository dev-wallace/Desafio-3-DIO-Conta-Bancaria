﻿# Desafio-3-DIO-Conta-Bancaria
# Desafio 03 / 05 - Conta Bancária com Construtor em POO

## Descrição

Você está desenvolvendo um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), você criará uma classe `ContaBancaria` com um construtor que permitirá a inicialização da conta com um saldo inicial.

## Entrada

O programa solicitará ao usuário que informe o saldo inicial da conta. Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.

## Saída

A classe `ContaBancaria` conterá métodos para realizar depósitos e saques, atualizando o saldo da conta. O saldo atual será exibido após cada transação.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

### Entrada e Saída

| Entrada | Saída |
|---------|-------|
| 50      | 50    |
| 100     | Depósito feito. Saldo atual: 100.0 |
|         | Saque feito. Saldo atual: 0.0      |
| 90      | 90    |
| 12      | Depósito feito. Saldo atual: 180.0 |
|         | Saque feito. Saldo atual: 168.0    |

## Código Java

```java
import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depósito
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito feito. Saldo atual: " + saldo);
    }

    // Método para saque
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque feito. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
    }

    // Método para obter saldo
    public double getSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial
        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Cria a conta bancária com o saldo inicial
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Realiza operações de depósito e saque
        System.out.print("Informe o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Informe o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        // Exibe o saldo final
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
