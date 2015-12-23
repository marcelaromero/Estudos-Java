class RetornoValoresInt
{
    public int calculadora()
    {
        int a = 10;
        int b = 20;
        int c = a + b;

        return c;
    }
}

class Metodo_Com_Retorno_Inteiro {

    public static void main(String[] args) {

        RetornoValoresInt valores = new RetornoValoresInt();

        System.out.print(valores.calculadora());
    }
}