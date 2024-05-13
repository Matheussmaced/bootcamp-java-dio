public class Carro {
  public void ligar() {
    confereCambio();
    confereCombustivel();

    System.out.println("Carro ligar");
  }

  private void confereCombustivel() { // escapsulamento é esconder ações que não tem necessidade de ficarem visiveis
    System.out.println("Conferindo combustivel");
  }

  private void confereCambio() {
    System.out.println("Conferindo cabio em P");
  }
}
