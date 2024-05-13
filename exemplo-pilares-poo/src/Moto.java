public class Moto extends Veiculo { // extends significa que ele herdarar aquilo que tem em Veiculo.java, por
                                    // exemplo o .chassi
  // apos colocar como abstrato minha classe veiculo e dizer que preciso de um
  // metodo ligar() para todas as classes que são veiculo

  @Override
  public void ligar() {
    System.out.println("MOTO LIGADA");
  }
}
