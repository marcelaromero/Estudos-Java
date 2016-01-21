package Grupo.ContaCorrente;
/**
 * Created by marcela on 17/12/15.
 */
public class ExemploMensagem {
    public static void main(String[] args){

        ContaCorrente marcela = new ContaCorrente(); // Objeto
        marcela.efetuarDeposito(1000);
        marcela.efetuarSaque(150);
        marcela.imprimaSaldo();

    }
}
