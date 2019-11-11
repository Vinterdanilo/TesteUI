package StepDefinition;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		
import PageObject.*;

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Abrir o navegador e a aplicacao$")					
    public void abri_o_navegador_e_a_aplicacao() throws Throwable							
    {		
       System.setProperty("webdriver.gecko.driver", "C:/Desenvolvimento/workspaces/Geckodriver/geckodriver.exe");		
       driver= new FirefoxDriver();					
       driver.manage().window().maximize();			
       driver.get("https://www.phptravels.net/admin");					
    }		
    
    @When("^inserir email e senha$")					
    public void inserir_email_e_senha() throws Throwable 							
    {		
       driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");							
       driver.findElement(By.name("password")).sendKeys("demoadmin");							
    }		

    @Then("^Fazer login$")					
    public void fazer_login() throws Throwable 							
    {		
       driver.findElement(By.className("btn-lg")).click();	
    }		
    
}	