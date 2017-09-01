package net.shakuro.pinion.selenium.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AdTests extends TestBase {

    @Test
    public void testAdAppearance() throws InterruptedException {
        app.widget().initWidgetThin();
        app.widget().likeByButton();
        app.widget().likeByButton();
        app.widget().likeByButton();

}
}
