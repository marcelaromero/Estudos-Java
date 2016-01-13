package Grupo;

public class Apolice {
    String nomeSegurado;
    int idade;
    double valorPremio;

    // GET

    public String getNomeSegurado() { return this.nomeSegurado;}
    public int getIdade() { return this.idade;}
    public double getValorPremio() { return this.valorPremio;}

    // SET

    public void setNomeSegurado(String nomeSegurado) { this.nomeSegurado = nomeSegurado;}
    public void setIdade(int idade) { this.idade = idade;}
    public void setValorPremio( double valorPremio){ this.valorPremio = valorPremio;}

    void imprimir()

}
