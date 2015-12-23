class MetodoComRetorno{

    String nome = "João Silva";

    public String retornaNome()
    {
        return nome;
    }
}

class Metodo_Com_Retorno {

    public static void main(String[] args) {

        MetodoComRetorno m3 = new MetodoComRetorno();
        System.out.println(m3.retornaNome());

    }

}
