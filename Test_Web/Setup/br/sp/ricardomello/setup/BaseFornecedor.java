package br.sp.ricardomello.setup;
import org.openqa.selenium.WebDriver;

public class BaseFornecedor {
	protected WebDriver navegadorAbaDois;
	
	public BaseFornecedor(WebDriver navegadorAbaDois) {
		this.navegadorAbaDois = navegadorAbaDois;
	}
	
}
