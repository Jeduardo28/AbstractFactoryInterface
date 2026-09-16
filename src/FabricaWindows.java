public class FabricaWindows implements FabricaInterface {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoWindows();
    }
}

