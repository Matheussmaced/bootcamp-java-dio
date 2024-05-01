public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;
        float pi = 3.14f;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto; // cast pega um tipo mais ambangente e converte para um tipo
                                                  // especifico
                                                  // correspondente

        System.err.println(salarioMinimo + (", ") + pi);
        System.err.println(numeroCurto2);

        final double VALOR_PI = 3.14; // constante, não mudará o valor, porem o nome da variavel tem que ser em
                                      // capslook
    }
}
