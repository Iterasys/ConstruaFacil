package stepsPOEN;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class comprarCursoPOEN {


    @Given("^que acesso o site da Iterasys  POEN$")
    public void queAcessoOSiteDaIterasysPO() {
        System.out.println("Passo 1");
    }

    @When("^pesquiso por \"([^\"]*)\" POEN$")
    public void pesquisoPorPO(String arg0)  {
        System.out.println("Passo 2");
    }

    @And("^clico na Lupa POEN$")
    public void clicoNaLupaPO() {
        System.out.println("Passo 3");
    }

    @Then("^vejo a lista de resultados para o curso \"([^\"]*)\" POEN$")
    public void vejoAListaDeResultadosParaOCursoPO(String arg0) {
        System.out.println("Passo 4");
    }

    @When("^clico em Matricule-se POEN$")
    public void clicoEmMatriculeSePO() {
        System.out.println("Passo 5");
    }

    @Then("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\" POEN$")
    public void confirmoONomeDoCursoComoEOPrecoDePO(String arg0, String arg1)  {
        System.out.println("Passo 6");
    }
}
