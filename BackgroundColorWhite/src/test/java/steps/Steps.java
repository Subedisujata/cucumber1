package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page.NssPage;
import util.BrowserFactory;

public class Steps {
	WebDriver driver;

	@Given("^Set white Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		driver = BrowserFactory.startbrowser();
		driver.get("http://techfios.com/test/107/");
	}

	@When("^I click on the white button$")
	public void i_click_on_the_button() {
		NssPage whitebutton = PageFactory.initElements(driver, NssPage.class);
		whitebutton.clickButton();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		NssPage comparecolor = PageFactory.initElements(driver, NssPage.class);
		String Actualcolor = comparecolor.getcolor();
		System.out.println(Actualcolor);
		String Expectedcolor = "#ffffff";
		Assert.assertEquals("This is wrong background color", Expectedcolor, Actualcolor);
	}
}
