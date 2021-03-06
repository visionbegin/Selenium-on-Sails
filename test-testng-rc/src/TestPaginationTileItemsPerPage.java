



import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class TestPaginationTileItemsPerPage extends BaseTestCase {
	@Test public void testPaginationTileItemsPerPage() throws Exception {
		selenium.open("/office-supplies/pens-pencils-markers/pens/ballpoint-pens");
		selenium.click("link=Tile");
		selenium.waitForPageToLoad("30000");
		assertEquals(selenium.getXpathCount("//div[@class='browseModWrapper']"), "15");
		selenium.select("name=ipp", "label=45");
		selenium.waitForPageToLoad("30000");
		assertEquals(selenium.getXpathCount("//div[@class='browseModWrapper']"), "45");
		selenium.select("name=ipp", "label=90");
		selenium.waitForPageToLoad("30000");
		assertEquals(selenium.getXpathCount("//div[@class='browseModWrapper']"), "90");
	}
}
