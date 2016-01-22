package Grupo;

import java.util.Scanner;

public class PrincipalContaCorrente1 {
    ContaCorrente1 cc = new ContaCorrente1();

    public static void main(String[] args) {
        PrincipalContaCorrente1 obj = new PrincipalContaCorrente1();
        int op = 0;

        while (op != 9){
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Cadastrar:");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Consultar Saldo");
            System.out.println("9 - Sair");
            System.out.println(" Entre com uma opção");
            op = sc.nextInt();

            switch (op){
                case 1:
                    obj.execCadastrar();
                    break;
                case 2:
                    obj.execSaque();
                    break;
                case 3:
                    obj.execDeposito();
                    break;
                case 4:
                    obj.execConsulta();
                    break;
            }

        }

    }
    public void execDeposito(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor para depósito: ");
        double valor = sc.nextDouble();
        this.cc.depositar(valor);
        System.out.println("Depósito realizado");
    }

    public void execSaque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para saque: ");
        double valor = sc.nextDouble();
        int ret = this.cc.sacar(valor);
        if (ret == 1){
            System.out.println("Saque Realizado");
        }else {
            System.out.println("Saque NÃO realizado");
        }
    }

    public void execConsulta(){
        this.cc.imprimir();
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome do cliente: ");
        this.cc.nomeCliente = sc.nextLine();
        System.out.println("Entre com o numero da agência: ");
        this.cc.agencia = sc.nextInt();
        System.out.println("entre com o numero da conta: ");
        this.cc.conta = sc.nextInt();
        System.out.println("Entre com o saldo do cliente: ");
        this.cc.saldo = sc.nextDouble();
    }


}
