package Grupo;

import java.util.Date;

/**
 * Created by marcela on 17/12/15.
 */
public class ExemploMetodo {
    private int meuAtributo = 0; // private pode ser usado por qqer metodo
    public static void main(String[] args){
        Date diadehoje = new Date(); // Date ja eh uma classe do Java e diadehoje representa um atributo

        System.out.println("Dia de hoje eh: " + diadehoje);

        imprimir(); // executa o metodo imprimir, a ordem nao altera, nao eh igual C que eh estruturado que le de cima para
        // baixo
    }

    public static void imprimir(){
        int minhaVariavel = 0; // essa variavel pode ser usada somente no metodo imprimir
        System.out.println("Metodo Imprimir: " + minhaVariavel);
    }
}
