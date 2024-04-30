
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int ano = 2021;
        ano = 2022;

        final String BR = "Brasil"; // final significa que a variavel nunca será alterada

        // System.err.println(ano);

        String primeiroNome = "Matheus";
        String segundoNome = "Gregorio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // chamada de um metodo

        System.err.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat((" ").concat(segundoNome));
    }

    @Override
    public String toString() {
        return "App []";
    }
}
