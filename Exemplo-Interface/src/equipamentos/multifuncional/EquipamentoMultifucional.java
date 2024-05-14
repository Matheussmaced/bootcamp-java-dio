package equipamentos.multifuncional;

import equipamentos.copiadora.Copiandora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifucional implements Impressora, Digitalizadora, Copiandora {

  @Override
  public void copiar() {
    System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
  }

  @Override
  public void digitando() {
    System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
  }

  @Override
  public void imprimir() {
    System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
  }

}
