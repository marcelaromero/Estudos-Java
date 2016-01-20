package Grupo;

import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

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

    void imprimir() {
        System.out.println(this.nomeSegurado);
        System.out.println(this.idade);
        System.out.println(this.valorPremio);
    }

    public void calcularPremioApolice() {
        if (this.idade >= 18 && this.idade <= 25) {
            this.valorPremio += (this.valorPremio * 20) / 100;
        }
        if (this.idade > 25 && this.idade <= 36) {
            this.valorPremio += (this.valorPremio * 15) / 100;
        }
        if (this.idade > 36) {
            this.valorPremio += (this.valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(String nomeCidade){
        if (nomeCidade.equalsIgnoreCase ("Curitiba")){
            this.valorPremio -= (this.valorPremio * 20)/ 100;
        }
        if (nomeCidade.equalsIgnoreCase("Rio de Janeiro")){
            this.valorPremio -= (this.valorPremio * 15)/100;
        }
        if (nomeCidade.equalsIgnoreCase("São Paulo")){
            this.valorPremio -= (this.valorPremio * 10)/100;
        }
        if (nomeCidade.equalsIgnoreCase("Belo Horizonte")){
            this.valorPremio -= (this.valorPremio * 5)/100;
        }
    }

}
