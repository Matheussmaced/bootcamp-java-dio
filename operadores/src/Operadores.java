public class Operadores {
    public static void main(String[] args) throws Exception {
        // = atribuição

        String nome = "Matheus";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;

        // operadoresAritmeticos(args);
        // operadoresUnario(args);
        // operadoresTenario(args);
        // operadoresRelacional(args);
        operadoresLogico(args);
    }

    public static void operadoresAritmeticos(String[] args) throws Exception {

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // concatenação

        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto);
    }

    public static void operadoresUnario(String[] args) throws Exception {
        int numero = 5;
        numero = -numero; // vai ser igual a ele mesmo, mas negativo

        // System.out.println(-numero);
        // System.out.println(numero);

        numero = numero * -1; // tornando ele possitivo
        // System.out.println(numero);

        // x repetição

        numero++; // mesma coisa de numero = numero + 1

        System.out.println("antes do incremento " + numero);

        System.out.println("incremento " + ++numero); // agora ele passará a ter 7 sempre
        System.out.println("antes do incremento " + numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel); // imprimirá false
    }

    public static void operadoresTenario(String[] args) throws Exception {
        int a, b;

        a = 6;
        b = 6;

        String resultado = "";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        // usando tenario:

        String resultadoTenario = a == b ? "verdadeiro" : "falso";

        System.out.println("resultado tenario " + resultadoTenario);
    }

    public static void operadoresRelacional(String[] args) throws Exception {
        String nomeUm = "Matheus";
        String nomeDois = "Matheus";

        System.out.println(nomeDois == nomeUm);
        System.out.println(nomeUm.equals(nomeDois)); // se o conteudo desses objetos são iguais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm é maior a numeroDois? " + simNao);
    }

    public static void operadoresLogico(String[] args) throws Exception {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2) { // se as duas são true
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma da duas condições são verdadeiras");
        }

        System.out.println("Fim");
    }
}
