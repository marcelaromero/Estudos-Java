/**
 * Created by Marcela on 10/12/2015.
 * programa com bloco de codigo pra impedir a divisao por zero
 */
public class BlocoDemo {
    public static void main(String args[]){
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo desta instrução if é um bloco código
        if (i != 0){
            System.out.println("I does not equal zero");
            d = j/i;
            System.out.println("j/i is: "+ d);
        }
    }
}
