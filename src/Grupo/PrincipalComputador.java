package Grupo;

public class PrincipalComputador {
    public static void main(String[] args) {
        Computador novoObj = new Computador();

        novoObj.marca = "HP";
        novoObj.modelo = "DV874384";
        novoObj.preco = 3000;
        novoObj.numeroSerie = 212;
        novoObj.cor = "Preto";
        System.out.println("Imprimindo dados inicializados");

        novoObj.imprimir();

        novoObj.calcularValor();
        System.out.println();
        System.out.println("Imprimindo dados após a execução do método calcularValor");
        novoObj.imprimir();

        System.out.println();
        System.out.println("Novo Objeto");

        Computador obj2 = new Computador();

        obj2.marca = "IBM";
        obj2.modelo = "DV874384";
        obj2.preco = 4000;
        obj2.numeroSerie = 212;
        obj2.cor = "Branco";

        obj2.calcularValor();
        System.out.println();
        System.out.println("Imprimindo dados após a execução do método calcularValor");
        obj2.imprimir();

        int ret = obj2.alterarValor(2000);
        if (ret > 0){
            System.out.println("Valor Alterado");
        }else {
            System.out.println("Valor NÃO alterado");
        }
        System.out.println();
        System.out.println("Imprimindo dados após a execução do método alterarValor");
        obj2.imprimir();
        System.out.println();

        System.out.println("Executando o método alterarValor com valor negativo");
        ret = obj2.alterarValor(-1300);
        if (ret > 0){
            System.out.println("Valor Alterado");
        }else {
            System.out.println("Valor NÃO alterado");
        }
        System.out.println();
        System.out.println("Imprimindo dados após a execução do método alterarValor");
        obj2.imprimir();


    }
}
