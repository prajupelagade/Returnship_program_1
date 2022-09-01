package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook1 
{
	@Before
	public void before1()
	{
	System.out.println("Before method");	
	}
    @After
    public void After1()
    {
    System.out.println("after method");	
    }
}
