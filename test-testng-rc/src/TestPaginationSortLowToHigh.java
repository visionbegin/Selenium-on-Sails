



import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class TestPaginationSortLowToHigh extends BaseTestCase {
	@Test public void testPaginationSortLowToHigh() throws Exception {
		selenium.open("/office-supplies/pens-pencils-markers/pens/ballpoint-pens");
		selenium.select("name=ipp", "label=90");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=sort", "label=Price (Low-High)");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isElementPresent("//div[@class='prodListContent']"));
	}
}
