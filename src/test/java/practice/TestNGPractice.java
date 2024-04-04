package practice;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@Test
	public void createContact()
	{
		Assert.fail();
		System.out.println("create");
	}
	
	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
		System.out.println("modify");
	}
	
	
	@Test
	public void deleteContact()
	{
		System.out.println("delete");
	}

}
