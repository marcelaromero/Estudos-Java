package Grupo;

/**
 * Created by marcela on 20/01/16.
 */
public class Computador {
    String marca;
    String cor;
    String modelo;
    int numeroSerie;
    double preco;

    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this. cor);
        System.out.println("Numero de série: " + this.numeroSerie);
        System.out.println("Preço: " + this.preco);
    }

    public void calcularValor() {
        if (this.marca.equalsIgnoreCase("HP")) {
            this.preco = (this.preco * 1.30);
        }
        if (this.marca.equalsIgnoreCase("IBM")) {
            this.preco = (this.preco * 1.50);
        }
    }

    public int alterarValor(double novoValor){
         if (novoValor > 0){
             this.preco = novoValor;
             return 1;
         }
             return 0;
    }
}
