package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    // Classe de Mapeamento possui 3 seções
    // 1 - Mapeamento de Elementos (Atributos)
    // 2 - Construtor entre os Elementos e os Passos
    // 3 - Funções e Métodos Mapeados

    // 1 - Mapeamento
    WebDriver driver;

    @FindBy(id = "searchtext")
    WebElement caixaDePesquisa; //txtPesquisa
    // Similar ao que faziamos antes:
    // driver.findElement(By.id("searchText"))

    @FindBy(id = "btn_form_search")
    WebElement botaoProcurar; //btnProcurar

    // 2 - Construtor

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    // 3 - Funções e Métodos
    public void pesquisarPorCurso(String curso){
        caixaDePesquisa.click();            // clicar na caixa
        caixaDePesquisa.clear();            // limpar a caixa
        caixaDePesquisa.sendKeys(curso);    // escrever na caixa
    }
    public void clicarNaLupa(){
        botaoProcurar.click();              // clicar no botão
    }

}
