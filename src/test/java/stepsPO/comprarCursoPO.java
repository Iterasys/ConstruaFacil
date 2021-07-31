package stepsPO;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class comprarCursoPO {


    @Dado("^que acesso o site da Iterasys  PO$")
    public void queAcessoOSiteDaIterasysPO() {
        System.out.println("Passo 1");
    }

    @Quando("^pesquiso por \"([^\"]*)\" PO$")
    public void pesquisoPorPO(String arg0)  {
        System.out.println("Passo 2");
    }

    @E("^clico na Lupa PO$")
    public void clicoNaLupaPO() {
        System.out.println("Passo 3");
    }

    @Entao("^vejo a lista de resultados para o curso \"([^\"]*)\" PO$")
    public void vejoAListaDeResultadosParaOCursoPO(String arg0) {
        System.out.println("Passo 4");
    }

    @Quando("^clico em Matricule-se PO$")
    public void clicoEmMatriculeSePO() {
        System.out.println("Passo 5");
    }

    @Entao("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\" PO$")
    public void confirmoONomeDoCursoComoEOPrecoDePO(String arg0, String arg1)  {
        System.out.println("Passo 6");
    }
}
