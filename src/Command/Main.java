package Command;

public class Main {

    Impressao impre = new Impressao();

    Comando impressaoComando = new ComandoImpressao(impre);

    Comando.impressao();
    Comando.desfazer();

}