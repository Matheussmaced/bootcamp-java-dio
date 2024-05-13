public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("898354");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("4060405");
        z400.ligar();

        Veiculo coringa = jeep;
        Veiculo coringa2 = z400;

        System.out.println("Jeep: "); // cada um vai ter uma caracteristica individual quando usar o metodo .ligar()
        coringa.ligar();
        System.out.println("z400: ");
        coringa2.ligar();

    }
}
