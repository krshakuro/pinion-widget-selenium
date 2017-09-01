package net.shakuro.pinion.selenium.tests;

import org.testng.annotations.Test;

public class SearchTests extends TestBase {

    @Test
    public void testSearchResults() throws InterruptedException {
        app.widget().sendSearchRequest("test");

}
}
