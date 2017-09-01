package net.shakuro.pinion.selenium.appmanager;

import net.shakuro.pinion.selenium.model.SomeData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class WidgetHelper extends HelperBase {

    public WidgetHelper(WebDriver wd){

        super(wd);
    }



    public void initWidget() throws InterruptedException {
        Thread.sleep(5000);
        click(By.cssSelector("channel-preview"));
        Thread.sleep(3000);
        wd.switchTo().frame(0);
//        wait = new WebDriverWait(wd, 10);
//        wait.until(elementToBeClickable(By.cssSelector(".pinion-preview"))).click();
    }

    public void initWidgetThin() throws InterruptedException {
        Thread.sleep(3000);
        wd.switchTo().frame(1);
        click(By.cssSelector(".pinion-layout-inner"));
    }

    public void likeByButton() throws InterruptedException {
//        wait = new WebDriverWait(wd, 10);
//        wait.until(elementToBeClickable(By.cssSelector(".pinion-like-btn"))).click();
        click(By.cssSelector(".pinion-like-btn"));
        Thread.sleep(1000);
    }

    public void dislikeByButton() throws InterruptedException {
//        wait = new WebDriverWait(wd, 10);
//        wait.until(elementToBeClickable(By.cssSelector(".pinion-dislike-btn"))).click();
        click(By.cssSelector(".pinion-dislike-btn"));
         Thread.sleep(1000);
    }

    public void skipByButton() throws InterruptedException {
//        wait = new WebDriverWait(wd, 10,5000);
//        wait.until(elementToBeClickable(By.cssSelector(".pinion-skip-btn"))).click();
        click(By.cssSelector(".pinion-skip-btn"));
        Thread.sleep(1000);
    }

    public void viewInfo() {
        click(By.cssSelector(".pinion-toggle-info-btn"));
        click(By.cssSelector(".pinion-toggle-info-btn"));
    }

    public void fill(SomeData someData){
        type(By.cssSelector("locator"), someData.getTo());
        type(By.cssSelector("locator"), someData.getSubject());
    }



    public void confirm() {
        click(By.cssSelector("locator"));
    }

    public void closeByButton() {
        click(By.cssSelector(".pinion-cancel-fullscreen-btn"));
    }

    public void share() throws InterruptedException {
        Thread.sleep(1000);
        click(By.cssSelector(".pinion-share-btn"));
        Thread.sleep(1000);
    }

    public void closeShare() {
        click(By.cssSelector(".pinion-close-share-btn"));
    }

    public void goThroughIntro() throws InterruptedException {
        Thread.sleep(1000);
        click(By.cssSelector("div.pinion-hint-bubble"));
        Thread.sleep(1000);
        click(By.cssSelector("div.pinion-hint-bubble"));
        Thread.sleep(1000);
//        click(By.cssSelector("div.pinion-hint-bubble"));
//        Thread.sleep(1000);
//        click(By.cssSelector(".pinion-image-view"));
//        Thread.sleep(1000);
    }

    public void shareByMail() throws InterruptedException {
        Thread.sleep(1000);
        click(By.cssSelector(".pinion-share-mail"));
        Thread.sleep(1000);
    }

    public void shareByFacebook() throws InterruptedException {
        Thread.sleep(1000);
        click(By.cssSelector(".pinion-share-fb"));
        Thread.sleep(1000);
    }

    public void shareByTwitter() throws InterruptedException {
        Thread.sleep(1000);
        click(By.cssSelector(".pinion-share-tw"));
        Thread.sleep(1000);
    }

    public void sendSearchRequest(String request) throws InterruptedException {
        searchField().click();
        searchField().clear();
        searchField().sendKeys(request);
        searchField().sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }

    private WebElement searchField() {
        return wd.findElement(By.cssSelector(".app-header__search-field"));
    }


    public void likeBySwipe() throws InterruptedException {

        new Actions(wd).dragAndDrop(wd.findElement(By.cssSelector(".pinion-crop-center")), wd.findElement(By.cssSelector(".pinion-cancel-fullscreen-btn"))).perform();
        Thread.sleep(1000);
    }

    public void dislikeBySwipe() throws InterruptedException {
        new Actions(wd).dragAndDrop(wd.findElement(By.cssSelector(".pinion-crop-center")), wd.findElement(By.cssSelector(".pinion-avatar"))).perform();
        Thread.sleep(1000);
    }

    public void skipBySwipe(){
        new Actions(wd).dragAndDrop(wd.findElement(By.cssSelector(".pinion-crop-center")), wd.findElement(By.cssSelector(".pinion-cont"))).perform();
    }

    public void maximizePinionByClick() throws InterruptedException {
        wd.findElement(By.cssSelector(".pinion-content")).click();
        Thread.sleep(1000);
        wd.findElement(By.cssSelector(".pinion-content")).click();
    }

    public void maximizePinionByHolding() throws InterruptedException {
        new Actions(wd).clickAndHold(wd.findElement(By.cssSelector(".pinion-content"))).perform();
        Thread.sleep(1000);
        new Actions(wd).release().perform();
    }

    public void refreshPage() throws InterruptedException {
        wd.navigate().refresh();
        Thread.sleep(5000);
    }

    public void clickShowMore() throws InterruptedException {
        wd.findElement(By.cssSelector(".channel-view__show-more")).click();
        Thread.sleep(3000);
    }

//    public String iconColor = ((JavascriptExecutor) wd).executeScript("window.getComputedStyle($0, ':before').getPropertyValue('background-color');", findElement(By.cssSelector(""))).toString();
}
