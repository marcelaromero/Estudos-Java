package Grupo;

public class ContaCorrente {
    int conta;
    int agencia;
    double saldo;
    String nome;
    static double cpmf; // atributo estatico

    public String getNome() {return this.nome;}

    public void setNome(String nome) {this.nome = nome;}

    void efetuarSaque(double valor) {this.saldo = this.saldo - valor;} // metodo

    void efetuarDeposito (double valor) { this.saldo = this.saldo + valor;} //metodo

    void imprimaSaldo() { System.out.println(this.saldo);} // metodo

    public int getAgencia() { return this.agencia;}

    public void setAgencia(int agencia) {this.agencia = agencia;}

    public int getConta() {return  this.conta;}

    public void setConta(int conta) { this.conta = conta;}

    public double getCpmf() { return cpmf;}

    public void setCpmf(double cpmf){ ContaCorrente.cpmf = cpmf;} // atributo static deve sempre ser acessado por meio
    // do nome da classe

    public double getSaldo() { return this.saldo;}

    public void setSaldo(double saldo) { this.saldo = saldo;}
}
