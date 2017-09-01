package net.shakuro.pinion.selenium.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ShareTests extends TestBase {

    Logger logger = LoggerFactory.getLogger(VotingTests.class);

    @Test
    public void testShareByMail() throws InterruptedException {
        app.widget().initWidget();
        app.widget().share();
        app.widget().shareByMail();
    }


    @Test
    public void testShareByFacebook() throws InterruptedException {
        app.widget().initWidget();
        app.widget().share();
        app.widget().shareByFacebook();
    }


    @Test
    public void testShareByTwitter() throws InterruptedException {
        app.widget().initWidget();
        app.widget().share();
        app.widget().shareByTwitter();
    }




}
