package stepsPO;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Home;
import pages.Resultado;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class comprarCursoPO {
    WebDriver driver;
    WebDriverWait wait;

    Home home;
    Resultado resultado;

    @Before
    public void iniciar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/92/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver,5,1);
        home = new Home(driver);
        resultado = new Resultado(driver);

        System.out.println("Passo 0-Classe");
    }

    @After
    public void finalizar(){
        driver.quit();
        System.out.println("Passo Z-Classe");
    }

    @Dado("^que acesso o site da Iterasys  PO$")
    public void queAcessoOSiteDaIterasysPO() {
        driver.get("https://www.iterasys.com.br");
        System.out.println("Passo 1");
    }

    @Quando("^pesquiso por \"([^\"]*)\" PO$")
    public void pesquisoPorPO(String curso)  {
        home.pesquisarPorCurso(curso);
        System.out.println("Passo 2");
    }

    @E("^clico na Lupa PO$")
    public void clicoNaLupaPO() {
        home.clicarNaLupa();
        System.out.println("Passo 3");
    }

    @Entao("^vejo a lista de resultados para o curso \"([^\"]*)\" PO$")
    public void vejoAListaDeResultadosParaOCursoPO(String curso) {
        String textoEsperado = "Cursos › \"" + curso + "\"";
        wait.until(ExpectedConditions.textToBe(resultado.verificarElemento(),textoEsperado));
        assertEquals(resultado.lerIndicadorDeCurso(), textoEsperado);
        System.out.println("Passo 4");
    }

    @Quando("^clico em Matricule-se PO$")
    public void clicoEmMatriculeSePO() {
        resultado.clicarMatriculese();
        System.out.println("Passo 5");
    }

    @Entao("^confirmo o nome do curso como \"([^\"]*)\" e o preco de \"([^\"]*)\" PO$")
    public void confirmoONomeDoCursoComoEOPrecoDePO(String arg0, String arg1)  {
        System.out.println("Passo 6");
    }
}
