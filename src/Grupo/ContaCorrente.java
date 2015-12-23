package Grupo;

public class ContaCorrente {
    int conta;
    int agencia;
    double saldo;
    String nome;
    static double cpmf; // atributo estatico

    // ----------------------- METODOS -------------------------------- //

    public String getNome() {return this.nome;}
    public int getAgencia() { return this.agencia;}
    public int getConta() {return  this.conta;}
    public double getCpmf() { return cpmf;}
    public double getSaldo() { return this.saldo;}


    public void setNome(String nome) {this.nome = nome;}
    public void setAgencia(int agencia) {this.agencia = agencia;}
    public void setConta(int conta) { this.conta = conta;}
    public void setCpmf(double cpmf){ ContaCorrente.cpmf = cpmf;}//atributo static deve sempre ser acessado por meio do nome da classe
    public void setSaldo(double saldo) { this.saldo = saldo;}


    void efetuarDeposito (double valor) {
        this.saldo = this.saldo + valor;
    } //metodo
    void efetuarSaque(double valor) {this.saldo = this.saldo - valor;} // metodo
    void imprimaSaldo() { System.out.println(this.saldo);} // metodo

}
