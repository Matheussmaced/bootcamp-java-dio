package estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifucional;

public class Fabrica {

  public static void main(String[] args) {

    Impressora impressora = new Deskjet();
    EquipamentoMultifucional impressoraModerna = new EquipamentoMultifucional();

    impressora.imprimir();

    impressoraModerna.copiar();
    impressoraModerna.digitando();
    impressoraModerna.imprimir();

  }

}
