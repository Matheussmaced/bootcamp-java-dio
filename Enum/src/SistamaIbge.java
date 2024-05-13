public class SistamaIbge {
  public static void main(String[] args) {
    for (EstadoBrasileiro variavel : EstadoBrasileiro.values()) {
      System.out.println(variavel.getSigla() + " - " + variavel.getNome());
    }

    EstadoBrasileiro variavelEstado = EstadoBrasileiro.PIAUI;

    System.out.println(variavelEstado);
    System.out.println(variavelEstado.getIbge());
  }
}
