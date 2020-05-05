package br.sp.ricardomello.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfiguracaoFornecedor {
	protected WebDriver navegadorAbaDois = null;
	
	public WebDriver getDrives() {
		return navegadorAbaDois;
	}

public void setDrivers(WebDriver navegadorAbaDois) {
		
		
	this.navegadorAbaDois = navegadorAbaDois;
		
	}
	
	public WebDriver navegadorAbaDois(String nomeNavegador, String url) {

		System.out.println("-----------------------------------Iniciando os Testes-----------------------------------");
		
		String propriedadeChrome = "webdriver.chrome.driver";
		String propriedadeChromeCaminho = "C:\\Users\\Kátia Pereira\\eclipse-workspace\\teste-automacao-web\\Test_Web\\Driver\\chromedriver.exe";
		String propriedadeFirefox = "webdriver.gecko.driver";
		String prorpiedadeFirefoxCaminho = "C:\\Users\\Kátia Pereira\\eclipse-workspace\\teste-automacao-web\\Test_Web\\Driver\\geckodriver.exe";
		String https = "https://";

		if (nomeNavegador.equalsIgnoreCase("chrome")) {
			System.setProperty(propriedadeChrome, propriedadeChromeCaminho);
			WebDriver navegadorAbaDois = new ChromeDriver();
			navegadorAbaDois.manage().window().maximize();
			navegadorAbaDois.get(https + url);
			return navegadorAbaDois;
		} else if (nomeNavegador.equalsIgnoreCase("firefox")) {
			System.setProperty(propriedadeFirefox, prorpiedadeFirefoxCaminho);
			WebDriver navegadorAbaDois = new FirefoxDriver();
			navegadorAbaDois.manage().window().maximize();
			navegadorAbaDois.get(https + url);
			return navegadorAbaDois;
		} else {
			System.out.println("Ainda falta implementar este navegador, " + nomeNavegador);
		}
		return null;
	}
	
public void FecharNavegador(WebDriver navegadorAbaDois) {
		
		System.out.println("-----------------------------------Terminando os Testes----------------------------------");
		
		this.navegadorAbaDois = navegadorAbaDois;
		navegadorAbaDois.close();
	}

}
