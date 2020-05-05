package br.sp.ricardomello.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import br.sp.ricardomello.page.Fornecedor;
//import br.sp.ricardomello.page.Login;
import br.sp.ricardomello.setup.ConfiguracaoFornecedor;
import cucumber.api.java.pt.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testFornecedorSteps {
	protected static WebDriver navegadorAbaDois;
	
	@Before
	@Dado("^que eu entrei no sistema")
	public void que_eu_entrei_no_sistema() throws Throwable {

		
		navegadorAbaDois = new ConfiguracaoFornecedor().navegadorAbaDois("chrome", "//phptravels.net/admin");
		new Fornecedor(navegadorAbaDois).AcessarDashboard();
		navegadorAbaDois.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		new Fornecedor(navegadorAbaDois).inserirEmailESenha("admin@phptravels.com", "demoadmin").clicarBtnLogin();
		
	}
	
	
	
	
	@Test
	@E("preencha o formulário$")
	public void formularior() {
		new Fornecedor(navegadorAbaDois).clicarContaEFornecenor().clicarAdd().prencherForm();
		navegadorAbaDois.close();
	}
    
	@Test
	@E("^clique em contas e clicar em fornecedores$") 
	public void accounts() throws Throwable {
		
		new Fornecedor(navegadorAbaDois).clicarContaEFornecenor();
		navegadorAbaDois.close();
	}
	@Test
	@E("clique no botão Adicionar$")
	public void btnAdd() {
		new Fornecedor(navegadorAbaDois).clicarContaEFornecenor().clicarAdd();
		navegadorAbaDois.close();
	}
	
	
	@Test
	@E("eu clicar no botão enviar $")
	public void formularior_2() {
		new Fornecedor(navegadorAbaDois).clicarContaEFornecenor().clicarAdd().prencherForm().clicarSubmit();
		navegadorAbaDois.close();
		
	}
	@Test
	@E("devo validar o email na lista$")
	public void formularior_3() {
		new Fornecedor(navegadorAbaDois).clicarContaEFornecenor().clicarAdd().prencherForm().clicarSubmit()
		.ValidarEmail("Email");
		
		
		
	}
     @After//After everyone test
     public void tearDown(){
    	 navegadorAbaDois.quit();
     }
}
