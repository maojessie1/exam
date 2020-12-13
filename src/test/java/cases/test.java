package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class test extends BaseCase {
    WebDriver driver;

    @Test
    public void test() {
        driver = setBrowser("chrome");
        driver.get("https://www.baidu.com");
//        driver.manage().window().maximize();
//        List<WebElement> elements = driver.findElements(By.cssSelector("*"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("script,div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div>a"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("li~li"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id='u1']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id='u1']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id^='head']"));
        /**
         * getTagName------>style
         * id------>guarantee-popper-style
         * getTagName------>div
         * id------>wrapper
         * getTagName------>div
         * id------>head_wrapper
         * getTagName------>div
         */
//        List<WebElement> elements = driver.findElements(By.cssSelector("style[id*='pp']"));
        /**
         * getTagName------>div
         * id------>s-top-more
         */
//        List<WebElement> elements = driver.findElements(By.cssSelector("[id*='more'][class='s-top-more']"));

//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id*='more'][class='s-top-more']"));
//        WebElement element = driver.findElement(By.cssSelector("div:first"));
//        System.out.println(element.getTagName());
       /* for (WebElement e :
                elements) {
            System.out.println("getTagName------>"+e.getTagName());
            String id = e.getAttribute("id");
            System.out.println("id------>"+id);

        }*/


//        WebElement element = driver.findElement(By.cssSelector("*"));
//        List<WebElement> element = driver.findElements(By.cssSelector(".s-top-nav+.s-center-box"));
//        List<WebElement> element = driver.findElements(By.cssSelector("#s-top-left"));
//        List<WebElement> element = driver.findElements(By.cssSelector(".s-top-left,#s-top-left a"));
//        List<WebElement> element = driver.findElements(By.cssSelector("div[class='mnav c-font-normal c-color-t"));
//        List<WebElement> element = driver.findElements(By.cssSelector("div[id*='more'][class='s-top-more']"));
//        List<WebElement>element = driver.findElements(By.cssSelector("div[id*='more'][class='s-top-more']"));

//        for (WebElement e : element) {
//            System.out.println(e.getTagName());
//        }


//        List<WebElement> elements = driver.findElements(By.cssSelector("div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("#head"));
//        List<WebElement> elements = driver.findElements(By.cssSelector(".s-top-nav"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div style"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div>style"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("span>span"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("input+input"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("input~input"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("input[type='hidden']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id='u']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id^='u']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id*='u']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id$='u']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id$='wrap'][class*='isindex']"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div[id$='wrap']/*"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div#head"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div#head div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div#head div>div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div#head div>div"));
//        List<WebElement> elements = driver.findElements(By.cssSelector("div:not([id='1'])"));
        List<WebElement> elements = driver.findElements(By.cssSelector("div:not([id='1'])"));
        for (WebElement e : elements) {
            String tagName = e.getTagName();
            System.out.println("tagName = " + tagName);
            String aClass = e.getAttribute("class");
            System.out.println("aClass = " + aClass);
            String cssValue = e.getCssValue("background-clip");
            System.out.println("cssValue = " + cssValue);
            String text = e.getText();
            System.out.println("text = " + text);

        }

        driver.close();
    }


}
