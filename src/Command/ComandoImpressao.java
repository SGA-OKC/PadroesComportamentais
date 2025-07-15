package Command;

public class ComandoImpressao implements Comando {

    private Impressao impre;

    public ComandoImpressao(Impressao impre) {
        this.impre = impre;
    }

    @Override
    public void impressao() {
        impre.imprimir();
    }

    @Override
    public void desfazer() {
        impre.naoImprimir();
    }
}
