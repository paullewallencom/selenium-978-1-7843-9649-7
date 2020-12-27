package Chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Chapter2 {
	WebDriver selenium;

	@FindBy(how= How.NAME, using="verifybutton")
	WebElement verifybutton;

	public Chapter2(WebDriver selenium){
		this.selenium = selenium;
		if (!"Chapter 2".equalsIgnoreCase(this.selenium.getTitle())){
			selenium.get("http://book.theautomatedtester.co.uk/chapter2");
		}
	}

	public boolean isButtonPresent(String button){
		return selenium.findElements(By.xpath("//input[@id='"+button+"']")).size()>0;
	}
}
