public abstract class Veiculo { // abstract = não sabe como uma das coisas ou a coisa acontece
  private String chassi;

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public abstract void ligar(); // mas todo mundo que quiser ser um veiculo, precisará ligar
}
