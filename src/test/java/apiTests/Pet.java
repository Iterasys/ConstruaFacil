package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class Pet {


        // Padrão
        // Given = Dado
        // .When = Quando
        // .Then = Então

        // Funções de Apoio
        public String lerJson(String caminhoJson) throws IOException {
                return new String(Files.readAllBytes(Paths.get(caminhoJson)));
        }

        @Test
        public void incluirPet() throws IOException { // Create - Post

                String jsonBody = lerJson("src/test/resources/data/pet.json");

                given()                                                 //Dado
                        .contentType("application/json")                //Tipo do conteúdo
                        // "text/xml" para web services sincronos - ex: Correios
                        // "application/json" para web services assincronos - ex: iFood
                        .log().all()                                    //Registrar tudo do envio
                        .body(jsonBody)
                .when()                                                 //Quando
                        .post("https://petstore.swagger.io/v2/pet")     //Comando + endpoint
                .then()                                                 // Então
                        .log().all()                                    // Registrar tudo da volta
                        .statusCode(200)                                // Valida o Código do Estado Nativo
                        // .body("code", is(200))               // Valida o Código de Estado no Json
                        .body("id", is(1101))        // Valida o id do animal
                        .body("name", is("Atena"))            // Valida o nome do animal
                        .body("category.name", is("dog"))       // Valida a categoria do animal
                        //.body("tags.name", not(contains("não vermifugado")))  // Valida se contem a palavra chava
                        .body("tags.name", contains("vermifugado ok"))
                ;
        }

        @Test
        public void consultarPet(){
                String petId = "1101"; // Id do animal

                given()
                        .contentType("application/json")
                        .log().all()
                .when()
                        .get("https://petstore.swagger.io/v2/pet/" + petId) // Get == Consultar
                .then()
                   .log().all()
                   .statusCode(200)
                   .body("name", is("Atena"))
                   .body("status", is("available"))
                ;
        }

}
