package br.sp.ricardomello.cucumberTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sp.ricardomello.stepDefinition.testFornecedorSteps;
//import br.sp.ricardomello.stepDefinition.testLoginSteps;

@RunWith(Suite.class)
@Suite.SuiteClasses({				
	  testFornecedorSteps.class,  			
	})
public class TestSuite {

}
