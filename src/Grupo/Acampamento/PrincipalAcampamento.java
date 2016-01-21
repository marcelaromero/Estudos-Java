package Grupo.Acampamento;

/**
 * Created by marcela on 20/01/16.
 */
public class PrincipalAcampamento {
    public static void main(String[] args) {
        Acampamento novoObj = new Acampamento();

        novoObj.nome = "Marcela";
        novoObj.equipe = "D";
        novoObj.idade = 33;

        novoObj.imprimir();

        System.out.println();

        System.out.println("Executando o método separarGrupo");
        novoObj.separarGrupo();
        novoObj.imprimir();

    }

}
