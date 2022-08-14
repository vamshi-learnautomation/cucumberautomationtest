package stepDefinations;

import io.cucumber.java.After;
import utilities.Testcontext;

public class Hooks {
	
	Testcontext Tc;
	public Hooks(Testcontext Tc)
	{
		this.Tc=Tc;
	}
		
	@After
	public void AfterScenario() throws Exception
	{
		Tc.testbase.WebdriverManager().quit();
		
	}
	
}
