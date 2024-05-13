public class ServicoMensagemInstantanea {
  public void enviarMensagem(String redeSocial) {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo " + redeSocial);
    salvarHistoricoMensagem();
  }

  public void receberMensagem(String redeSocial) {
    System.out.println("Recebendo mensagem pelo Telegram " + redeSocial);
  }

  private void validarConectadoInternet() {
    System.out.println("Verificando se há rede");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando historico de mensagem");
  }
}
