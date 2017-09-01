package net.shakuro.pinion.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    //Authorization method
    public void login(String username, String password) {
        type(By.id("username"), username);
        type(By.id("password"), password);
        click(By.id("button"));
    }
}
