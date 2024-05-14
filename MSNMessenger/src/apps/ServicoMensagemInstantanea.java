package apps;

public abstract class ServicoMensagemInstantanea { // quem quiser ser um serviço de mensagens, precisa ter esses
                                                   // elementos
  public abstract void enviarMensagem(); // precisa ter isso se quiser ser um serveço de mensagens

  public abstract void receberMensagem(); // precisa ter isso se quiser ser um serviço de mensagens

  // somente os filhos conhecem este método
  protected void validarConectadoInternet() {
    System.out.println("Validando se está conectado a internet");
  }
}
