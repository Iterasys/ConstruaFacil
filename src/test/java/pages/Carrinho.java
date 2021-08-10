package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Carrinho {
    WebDriver driver;

    @FindBy(css = "span.item-title")
    WebElement curso;

    @FindBy(css = "span.new-price")
    WebElement preco;

    public Carrinho(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String lerNomeCurso(){
        return curso.getText();
    }

    public String lerPrecoCurso(){
        return preco.getText();
    }

}
