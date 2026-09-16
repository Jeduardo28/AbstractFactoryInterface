import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaInterfaceTest {
    @Test
    void windowsCriaBotaoDaFamiliaWindows() {
        assertInstanceOf(BotaoWindows.class, new FabricaWindows().criarBotao());
    }

    @Test
    void windowsCriaCaixaDaFamiliaWindows() {
        assertInstanceOf(CaixaSelecaoWindows.class, new FabricaWindows().criarCaixaSelecao());
    }

    @Test
    void macOSCriaBotaoDaFamiliaMacOS() {
        assertInstanceOf(BotaoMacOS.class, new FabricaMacOS().criarBotao());
    }

    @Test
    void macOSCriaCaixaDaFamiliaMacOS() {
        assertInstanceOf(CaixaSelecaoMacOS.class, new FabricaMacOS().criarCaixaSelecao());
    }

    @Test
    void telaRenderizaFamiliaWindowsCompleta() {
        Tela tela = new Tela(new FabricaWindows());
        assertEquals("Botao no estilo Windows" + System.lineSeparator()
                + "Caixa de selecao no estilo Windows", tela.renderizar());
    }

    @Test
    void telaRenderizaFamiliaMacOSCompleta() {
        Tela tela = new Tela(new FabricaMacOS());
        assertEquals("Botao no estilo MacOS" + System.lineSeparator()
                + "Caixa de selecao no estilo MacOS", tela.renderizar());
    }

    @Test
    void telaAceitaNovaFamiliaSemAlterarSeuCodigo() {
        FabricaInterface fabricaTeste = new FabricaInterface() {
            public Botao criarBotao() {
                return () -> "Botao de teste";
            }
            public CaixaSelecao criarCaixaSelecao() {
                return () -> "Caixa de teste";
            }
        };
        assertEquals("Botao de teste" + System.lineSeparator() + "Caixa de teste",
                new Tela(fabricaTeste).renderizar());
    }
}

