package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://advantageonlineshopping.com/#/");
	    driver.manage().window().maximize();
	    System.out.println("Iniciando teste");
	    Thread.sleep(2000);
	    driver.findElement(By.id("menuUser")).click();
	    Thread.sleep(2000);
	  
	  
	}

	@When("vou na area de cadastro e comeco a preencher as lacunas")
	public void vou_na_area_de_cadastro_e_comeco_a_preencher_as_lacunas() throws InterruptedException {
		
		
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		Thread.sleep(000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input")).sendKeys("LuizaHosanna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input")).sendKeys("vina5282@uorak.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys("Lu6341");
		Thread.sleep(000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("Lu6341");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Luiza");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Hosanna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("11912349876");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select")).sendKeys("Brazil");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input")).sendKeys("São Paulo");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input")).sendKeys("Rua Volta Redonda 744");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input")).sendKeys("São Paulo");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input")).sendKeys("04608-904");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/sec-view/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"register_btnundefined\"]")).click();
		
		
	  
	}

	@Then("finalizo o cadastro")
	public void finalizo_o_cadastro() {
		
		System.out.println("Cadastro realizado com sucesso");
	 
	}



}
