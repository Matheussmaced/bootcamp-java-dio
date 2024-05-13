public class ComputadorDoPedrinho {

  public static void main(String[] args) {
    MSNMessenger msnMessenger = new MSNMessenger();

    msnMessenger.enviarMensagem("MSN");
    msnMessenger.receberMensagem("MSN");

    FacebookMessenger facebookMessenger = new FacebookMessenger();

    facebookMessenger.enviarMensagem("Facebook");
    facebookMessenger.receberMensagem("Facebook");

    Telegram telegram = new Telegram();

    telegram.enviarMensagem("Telegram");
    telegram.receberMensagem("Telegram");

  }
}
