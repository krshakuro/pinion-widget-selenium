package net.shakuro.pinion.selenium.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static net.shakuro.pinion.selenium.appmanager.HelperBase.isElementPresent;
import static net.shakuro.pinion.selenium.appmanager.HelperBase.wd;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class E2ETest extends TestBase {


    @Test
    public void testE2E() throws InterruptedException {
        app.widget().sendSearchRequest("governorr");
        assertFalse(isElementPresent(By.cssSelector("channel-preview")));
        app.widget().sendSearchRequest("governor");
        assertTrue(isElementPresent(By.cssSelector("channel-preview")));
        app.widget().initWidget();
        app.widget().likeByButton();
        assertTrue(isElementPresent(By.cssSelector(".pinion-hint")));
        app.widget().goThroughIntro();
        assertTrue(isElementPresent(By.cssSelector(".pinion-collection-item-vote-positive")));
        app.widget().likeBySwipe();
        assertTrue(wd.findElements(By.cssSelector(".pinion-collection-item-vote-positive")).size() == 2);
        app.widget().dislikeByButton();
        assertTrue(wd.findElements(By.cssSelector(".pinion-collection-item-vote-negative")).size() == 1);
        app.widget().dislikeBySwipe();
        assertTrue(wd.findElements(By.cssSelector(".pinion-collection-item-vote-negative")).size() == 2);
        app.widget().skipByButton();
        app.widget().skipBySwipe();
        app.widget().maximizePinionByClick();
        app.widget().maximizePinionByHolding();
        app.widget().share();
        assertTrue(isElementPresent(By.cssSelector(".pinion-share-fb")));
        assertTrue(isElementPresent(By.cssSelector(".pinion-share-tw")));
        assertTrue(isElementPresent(By.cssSelector(".pinion-share-mail")));
        app.widget().closeShare();
        app.widget().refreshPage();
        app.widget().clickShowMore();
        assertTrue(wd.findElements(By.cssSelector(".channel-preview__image")).size() == 8);


    }
}
