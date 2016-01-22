package Grupo;

/**
 * Created by marcela on 20/01/16.
 */
public class PrincipalApolice {
    public static void main(String[] args) {
        Apolice novoObj = new Apolice();

        novoObj.nomeSegurado = "Marcela";
        novoObj.idade = 33;
        novoObj.valorPremio = 500;

        System.out.println("Imprimindo dados inicializados");
        novoObj.imprimir();

        System.out.println();

        System.out.println("Imprimindo dados apos a execução do método calcularPremioApolice");
        novoObj.calcularPremioApolice();
        novoObj.imprimir();

        System.out.println();

        System.out.println("Imprimindo dados apos a execução do método oferecerDesconto");
        novoObj.oferecerDesconto("Curitiba");
        novoObj.imprimir();

    }
}
