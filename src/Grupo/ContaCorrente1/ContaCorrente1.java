package Grupo.ContaCorrente1;

/**
 * Created by marcela on 20/01/16.
 */
public class ContaCorrente1 {
    int conta, agencia;
    double saldo;
    String nomeCliente;

    public int sacar(double valor){
        if (this.saldo >= valor){ // para ocorrer o saque o saldo tem q ser maior q o valor q quero sacar
            this.saldo = this.saldo - valor;
            return 1;
        }
        return 0;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Conta: "+ this.conta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: "+ this.saldo);
    }
}
