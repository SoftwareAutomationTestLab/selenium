package Test2;

import org.testng.annotations.Test;

public class Secondclass 
{
  @Test
  public void myTest2() 
  {
	  try
	  {
	  System.out.println("From second class");
	  }
	  catch(Exception e)
	  {
	   System.out.println(e.getMessage());
	  }
	  
  }
}
