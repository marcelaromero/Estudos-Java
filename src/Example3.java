/**
 * Created by Marcela on 10/12/2015.
 * este programa ilustra a diferença entre int e double
 */
public class Example3 {
    public static void main(String args[]){
        int var;
        double x; // esta instruçao declara uma variavel de ponto flutuante

        var = 10;
        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); //exibe uma linha em branco

        // agora divide as duas por 4
        var  = var/4;
        x = x/4;

        System.out.println("var after division: " + var);
        System.out.println("vx after division: " + x);

    }
}
