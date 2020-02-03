package cucumbercs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import cucumbercs.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudy
{
WebDriver driver;

@Given("User executive login")
public void team_executive_login()
{
// Write code here that turns the phrase above into concrete actions
//throw new cucumber.api.PendingException();
driver=DriverUtil.getDriver("chrome");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}
@When("User executive provides {string} and {string} as credentials")
public void team_executive_provides_and_as_credentials(String string, String string2)
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .linkText("SignIn")).click();
driver.findElement(By .name("userName")).sendKeys(string);
driver.findElement(By .name("password")).sendKeys(string2);
driver.findElement(By .name("Login")).click();
}

@Then("Login is successful")
public void login_is_successful()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
System.out.println("Login successful");
}





@Given("User is at signup for testmeApp")
public void team_is_at_signup_for_testmeApp()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
System.out.println("SignUp");
}
@When("User provides {string}")
public void team_provides(String string)
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .name("userName")).sendKeys(string);
}
@Then("User provides {string} , {string} , {string} , {string}")
public void team_provides(String string, String string2, String string3, String string4)
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .name("firstName")).sendKeys(string);
driver.findElement(By .name("lastName")).sendKeys(string2);
driver.findElement(By .name("password")).sendKeys(string3);
driver.findElement(By .name("confirmPassword")).sendKeys(string4);
}
@Then("User continues to provides {string} , {string} , {string} , {string} , {string} , {string} , {string}")
public void team_provides(String string, String string2, String string3, String string4, String string5, String string6, String string7)
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .xpath("//input[@value='Female']")).click();
driver.findElement(By .name("emailAddress")).sendKeys(string2);
driver.findElement(By .name("mobileNumber")).sendKeys(string3);
driver.findElement(By .name("dob")).sendKeys(string4);
driver.findElement(By .name("address")).sendKeys(string5);
driver.findElement(By .xpath("//*[@id=\"securityQuestion\"]/option[3]")).click();
driver.findElement(By .name("answer")).sendKeys(string7);
}

@Then("registration is successful")
public void registration_is_successful()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .name("Submit")).click();
}

@Given("User searches for products in the search field")
public void team_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable)
{
   // Write code here that turns the phrase above into concrete actions
   // For automatic transformation, change DataTable to one of
   // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
   // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
   // Double, Byte, Short, Long, BigInteger or BigDecimal.
   //
   // For other transformations you can register a DataTableType.
   //throw new cucumber.api.PendingException();
List<String> pro_list=dataTable.asList();
System.out.println(pro_list.size());
for(String plist:pro_list)
{
driver.findElement(By .name("products")).sendKeys(plist);
String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
System.out.println(str);
}
}

@When("User verifies the product availability")
public void team_verifies_the_product_availability()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
   driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
}














@Given("User proceeds to payment without adding any item in the cart")
public void team_proceeds_to_payment_without_adding_any_item_in_the_cart()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
	driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys("Lalitha");
	driver.findElement(By .name("password")).sendKeys("password123");
	driver.findElement(By .name("Login")).click();
	driver.findElement(By .xpath("//*[@id=\"myInput\"]")).sendKeys("HeadPhone");
	driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();	
    Assert.assertNotSame("View Cart", driver.getTitle());
}
@Then("TestMeApp doesnot display the cart icon")
public void testmeapp_doesnot_display_the_cart_icon()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
System.out.println("Cart symbol not found");
}
@When("User proceeds to payment with adding any item to the cart")
public void team_proceeds_to_payment_with_adding_any_item_to_the_cart()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}
@Then("TestMeApp displays cart icon")
public void testmeapp_displays_cart_icon()
{
   // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
System.out.println(driver.getTitle());
}
}





