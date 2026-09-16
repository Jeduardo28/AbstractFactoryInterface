// O cliente depende somente das interfaces, sem conhecer produtos concretos.
public class Tela {
    private final Botao botao;
    private final CaixaSelecao caixaSelecao;

    public Tela(FabricaInterface fabrica) {
        this.botao = fabrica.criarBotao();
        this.caixaSelecao = fabrica.criarCaixaSelecao();
    }

    public String renderizar() {
        return botao.renderizar() + System.lineSeparator() + caixaSelecao.renderizar();
    }
}

