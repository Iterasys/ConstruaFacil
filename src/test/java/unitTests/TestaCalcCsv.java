package unitTests;

import devcalc.Calc;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class TestaCalcCsv {

    // 3.1 - Atributos

    // 3.2 - Métodos e Funções

    @DataProvider // Provedor de dados para os testes
    public Iterator<Object[]> provider() throws IOException {
        List<Object[]> testCases = new ArrayList<>();
        //List<String[]> testCases = new ArrayList<>();
        String[] testCase;
        String linha;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C://Users//corre//IdeaProjects//ConstruaFacil//src//test//resources//data//massaTestarSomarDoisNumeros.csv"));
        while((linha = bufferedReader.readLine()) != null){
            testCase = linha.split(",");
            testCases.add(testCase);
        }

        return testCases.iterator();
    }

    @Test(priority = 2, dataProvider = "provider")
    public void testarSomarDoisNumerosCsv(String num1, String num2, String resultadoEsperado) {
        // 1 - Prepara - Configurar - Given - Arrange
        // int num1 = 5;
        // int num2 = 7;
        //int resultadoEsperado = 12;

        // 2 - Executar - When - Act
        int resultadoAtual = Calc.somarDoisNumeros(Integer.parseInt(num1),Integer.parseInt(num2));

        // 3 - Validar - Then - Assert
        System.out.println("O resultado atual foi " + resultadoAtual + "\n O resultado esperado era " + resultadoEsperado);
        assertEquals(resultadoAtual, Integer.parseInt(resultadoEsperado));
    }

    @Test(priority = 1)
    public void testarSubtrairDoisNumeros(){
        int num1 = 6;
        int num2 = 2;
        int resultadoEsperado = 4;

        int resultadoAtual = Calc.subtrairDoisNumeros(num1,num2);

        System.out.println("O resultado esperado é " + resultadoEsperado
                            + " e o resultado atual é " + resultadoAtual);

        assertEquals(resultadoAtual,resultadoEsperado);

    }




}
