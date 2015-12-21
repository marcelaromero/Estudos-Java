/**
 * Created by Marcela on 10/12/2015.
 */
public class PolegadaToMetro {
    public static void main(String args[]){
        double polegada, metro;
        int counter; // para contar as linhas

        counter = 0;
        for (polegada=1; polegada<=144; polegada++){
            metro = polegada * 39.37;

            System.out.println(polegada + " polegadas corresponde a: " + metro + "metros");
            counter++;
            if (counter == 12){ // exibir uma linha em branco a cada 12 voltas do loop
                System.out.println();
                counter = 0;
            }
        }
    }

}
