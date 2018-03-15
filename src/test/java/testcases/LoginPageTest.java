package testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import testutils.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	public LoginPageTest(){
		super();
	// super keyword first calls the constructor of the parent call (Test Base) which will initialize the
	// 	the properties in the parent class constructor  
	// when we calling the  initialization(); method it is must to initilize the property 
	}
	
  @BeforeMethod 
  public void SetUp(){
	 initialization();
	 lp = new LoginPage();
	 
  }
 
  @AfterMethod
  public void TearDown(){
  driver.quit();
  }
  
  @Test(priority = 1)
   public void LoginPageTitle(){
	String title = lp.ValidateLoginPageTitle();
	  Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
  }
  @Test(priority = 2)
    public void CRMLogoImgTest(){
	 boolean logo = lp.ValidateCRMImage();
	 Assert.assertTrue(logo);
  }
  
  @Test(priority = 3)
    public void LoginTest() {
	 hp = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	 
	 
  }
  
  
}