// Abstract Factory: contrato para criar uma familia de componentes.
public interface FabricaInterface {
    Botao criarBotao();
    CaixaSelecao criarCaixaSelecao();
}

