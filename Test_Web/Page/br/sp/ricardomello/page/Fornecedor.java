package br.sp.ricardomello.page;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.sp.ricardomello.setup.BaseFornecedor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.NoAlertPresentException;
import java.util.Random;
public class Fornecedor extends BaseFornecedor {
	
	public Fornecedor(WebDriver navegadorAbaDois) {
		super(navegadorAbaDois);
        
	}
	
public void AcessarDashboard() throws InterruptedException {
	    
		System.out.println("• Acessando Página de Login...");
		navegadorAbaDois.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

  
	public Fornecedor clicarContaEFornecenor()  {
		
		 
		 navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 navegadorAbaDois.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		 navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 navegadorAbaDois.findElement(By.xpath("//ul[@id='ACCOUNTS']//a[contains(text(),'Suppliers')]")).click();
		 navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			
		 return this;
	  }
	
	  
	  public Fornecedor inserirEmailESenha(String email, String senha) throws InterruptedException {
		  
		  navegadorAbaDois.findElement(By.name("email")).sendKeys(email);
		  navegadorAbaDois.findElement(By.name("password")).sendKeys(senha);
		  navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return this;
		  
	  }
	  
	  public Fornecedor clicarBtnLogin()  {
		  navegadorAbaDois.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		  navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
			return this;
	     }
	  
	  public Fornecedor clicarAdd() {
		  
		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		  navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  return this;
	  }
	  public Fornecedor clicarSubmit() {
 		  
 		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		  navegadorAbaDois.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg']")).click();
 		  navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
 		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		  
 		  return this;
 	  }
     
	  
	  public Fornecedor prencherForm() {
		  String email[] = { "aaaaa@hotmail.com"
		           , "bbbbb@hotmail.com"
		           ,"cccc@hotmail.com"
		           ,"dddd@hotmail.com"
		           ,"eeee@hotmail.com" };
 Random random = new Random();
 
 String Email1 = email[random.nextInt(email.length)];

 String m = Email1;
 System.out.println("email é: " + m);                  
		  navegadorAbaDois.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.name("fname")).sendKeys("Ricardo");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.name("lname")).sendKeys("Oliveira");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.name("email")).sendKeys(m);
		  navegadorAbaDois.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.name("password")).sendKeys("123456");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.name("mobile")).sendKeys("123456789");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		  Select dropdow =new Select(navegadorAbaDois.findElement(By.name("country")));
		  dropdow.selectByValue("AL");
		  
		  navegadorAbaDois.findElement(By.name("address1")).sendKeys("Itaquera");
		  navegadorAbaDois.findElement(By.name("address2")).sendKeys("Diadema");
		  
		  navegadorAbaDois.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Select drop =new Select(navegadorAbaDois.findElement(By.name("applyfor")));
		  drop.selectByValue("Hotels");
		  
		  navegadorAbaDois.findElement(By.name("itemname")).sendKeys("Hotel");
		  navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  return this;
		  
	  }
	  
	  
	  
	  public Fornecedor ValidarEmail(String mensagemEsperada) {
			
			System.out.println("• Validando o email...");
			
			String xPathMensagem = "//th[contains(text(),'Email')]";
			String mensagemAtual = navegadorAbaDois.findElement(By.xpath(xPathMensagem)).getText();
			
			Assert.assertEquals("Validando o email adcionado na lista ", mensagemEsperada, mensagemAtual);
			navegadorAbaDois.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			navegadorAbaDois.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
			System.out.println("• Email validado...");
			return this;
		}
     
}
