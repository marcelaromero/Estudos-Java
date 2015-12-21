package Grupo;

/**
 * Created by marcela on 17/12/15.
 */
public class ContaCorrenteSobrecarga {

    // posso ate ter varios metodos com o mesmo nome, porem nao posso ter os mesmo atributos

    void imprimirAtributos() {
        System.out.println("Metodo imprimirAtributos()");
    }

    void imprimirAtributos(int a) {
        System.out.println("Metodos imprimirAtributos(int a)");
    }

    void imprimirAtributos(char a) {
        System.out.println("Metodo imprimirAtributos(char a");
    }

    void imprimirAtributos(int a, char b) {
        System.out.print("Metodo imprimirAtributos(int a, char b)");
    }

    void imprimirAtributos(char b, int a) {System.out.println("metodo que da o erro");}
    public static void main (String[] args) {

        ContaCorrenteSobrecarga marcela = new ContaCorrenteSobrecarga();
        marcela.imprimirAtributos('a', 2);
    }
}
