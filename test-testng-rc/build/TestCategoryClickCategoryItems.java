import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class TestCategoryClickCategoryItems extends BaseTestCase {

    @Test public void testCategoryClickCategoryItems() throws Exception {
		selenium.open("/");
		selenium.click("css=div.topleveldisplaydiv");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'Pens, Pencils, & Markers')])[4]");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Pens");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//a[contains(text(),'Ballpoint Pens')])[2]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@class='browseby']/div[@title='Brand']/div[@class='facetContainerContent']/div/label[@class='facetLabel']/input");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[@class='browseby']/div[@title='Ink Color']/div[@class='facetContainerContent']/div/label[@class='facetLabel']/input");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("BIC 4-Color RT Grip Ballpoint Pen"));
    }
}