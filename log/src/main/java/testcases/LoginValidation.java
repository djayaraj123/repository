package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import common.BrowserCommands;
import pages.GmailLoginPage;
import utilities.ReadPropertyFile;


@Test
public class LoginValidation extends BrowserCommands{

	public void testUserLogin() {
		
	ReadPropertyFile.loadProperties();
	BrowserCommands bc = new BrowserCommands();
	bc.launchChromeBrowser();
	bc.launchURL(ReadPropertyFile.readProperty("url"));
	
		new GmailLoginPage()
		.typeUserID("djayaraj115")
		.click1();
		
	
	}
	
}
