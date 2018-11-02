package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage{

	@FindBy(id="identifierId")
	WebElement userid;
	
	@FindBy(name="password")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]/content/span")
	WebElement next1button;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/content/span")
	WebElement next2button;
	
	public GmailLoginPage typeUserID(String uid) {
		type(userid, uid);
		return this;
	}
	
	public GmailLoginPage typePassword(String pwd) {
		type(pswd, pwd);
		return this;
	}

	public GmailLoginPage click1() {
	click(next1button);
	return new GmailLoginPage();
	}
	
	public GmailLoginPage click2() {
		click(next2button);
		return new GmailLoginPage();
	}

	}
