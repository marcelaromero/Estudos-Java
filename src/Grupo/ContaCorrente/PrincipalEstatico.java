package Grupo.ContaCorrente;

/**
 * Created by marcela on 17/12/15.
 */
public class PrincipalEstatico {
    public static void main(String[] args){
        ContaCorrente objeto1 = new ContaCorrente();
        ContaCorrente.cpmf = 0.038;
        objeto1.saldo = 100.000;
        ContaCorrente objeto2 = new ContaCorrente();
        objeto2.saldo = 99.000;

        System.out.println("Manipulando objetos em Java: \u2122"); // \u2122 eh um escape
        System.out.println();

        // Atributo estatico sendo acessado por um objeto
        System.out.println("objeto1 atributo estatico: " + objeto1.cpmf);
        System.out.println("Objeto1 atributo nao estatico " + objeto1.saldo);

        System.out.println();

        // acessando atributo estatico por meio de um objeto
        System.out.println("objeto2 atributo estatico: " + objeto2.cpmf);
        System.out.println("Objeto2 atributo nao estatico " + objeto2.saldo);

        System.out.println();

        objeto1.cpmf = 0.010;
        System.out.println("Objeto1 atributo estatico " + objeto1.cpmf);
        System.out.println("objeto1 atributo nao estico " + objeto1.saldo);

        System.out.println();

        // acessando atributo estatico por meio do nome da classe
        System.out.println("objeto1 atributo estatico acessado pelo nome da classe " + ContaCorrente.cpmf);
        System.out.println("objeto1 atributo nao estatico " + objeto1.saldo);
    }
}
