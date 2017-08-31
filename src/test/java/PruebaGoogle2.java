/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Beriozka
 */
public class PruebaGoogle2 {
    private static WebDriver driver = null;
    
    
    @BeforeClass
    public static void InicializarDriver() {
        System.setProperty("webdriver.chrome.driver", 
                "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void FinalizarDriver() {
        driver.quit();
    }        
    

    @Test
    public void BuscarGoogle() {
        driver.get("https://www.google.co.ve");
        
        WebElement CampoBuscar = driver.findElement(By.name("q"));
        CampoBuscar.sendKeys("casa");// PRUEBA1
        //
        WebElement BotonBuscar = driver.findElement(By.name("btnK"));
        BotonBuscar.click();
        
        WebDriverWait Esperar = new WebDriverWait(driver, 5);
        WebElement Resultado = driver.findElement(By.id("resultStats"));
        Esperar.until(ExpectedConditions.visibilityOf(Resultado));
    }
    
}
