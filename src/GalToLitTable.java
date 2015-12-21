/**
 * Created by Marcela on 10/12/2015.
 * esse programa exibe uma tabela de conversões de galões em litros
 */
public class GalToLitTable {
    public static void main(String args[]){
        double gallons, liters;
        int counter;

        counter = 0; // inicialmente o contador de linhas é configurado com zero
        for (gallons=1; gallons<=100; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + "gallons is " + liters + "liters");

            counter++; // incremente o contador de linhas a cada iteração do loop
            // a cada decima linha, exibe uma linha em branco
            if ( counter == 10){
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}

