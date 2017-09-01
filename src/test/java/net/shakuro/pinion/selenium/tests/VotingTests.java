package net.shakuro.pinion.selenium.tests;

import net.shakuro.pinion.selenium.appmanager.HelperBase;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import net.shakuro.pinion.selenium.model.SomeData;

public class VotingTests extends TestBase {

    @Test
    public void testLike() throws InterruptedException {

        app.widget().initWidget();
        app.widget().likeByButton();
        app.widget().goThroughIntro();
        app.widget().likeByButton();
//        Assert.assertEquals();
        app.widget().likeByButton();
        app.widget().likeByButton();
//        Assert.assertEquals(app.widget().iconColor, "green");
//        System.out.println(app.widget().iconColor);
//        app.widget().skipByButton();
//        app.widget().dislikeByButton();
    }

    @Test
    public void testDislike() throws InterruptedException {
        app.widget().initWidget();
        app.widget().dislikeByButton();
        app.widget().goThroughIntro();
        app.widget().dislikeByButton();
        app.widget().dislikeByButton();
        app.widget().dislikeByButton();
    }

    @Test
    public void testSkip() throws InterruptedException {
        app.widget().initWidget();
        app.widget().skipByButton();
        app.widget().skipByButton();
        app.widget().skipByButton();
        app.widget().skipByButton();
        app.widget().skipByButton();
    }


}
