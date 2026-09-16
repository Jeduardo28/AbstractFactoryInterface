public class FabricaMacOS implements FabricaInterface {
    @Override
    public Botao criarBotao() {
        return new BotaoMacOS();
    }

    @Override
    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoMacOS();
    }
}

