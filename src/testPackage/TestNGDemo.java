package testPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGDemo {


    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DERDASH\\Desktop\\DUO TECH\\BrowserDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        String expected = "High Heel Shoes";
        driver.findElement(By.name("q")).sendKeys(expected  + Keys.ENTER);
        String resultPageTitle = driver.getTitle();

        Assert.assertTrue( resultPageTitle.contains(expected))  ;

    }

    @Test
    public void test2() {        Assert.assertTrue(true);     }

    @Test
    public void test3() {        Assert.assertTrue(true);     }

    @Test
    public void test4() {        Assert.assertFalse(false);     }

    @Test
    public void test5() {        Assert.assertEquals("Hello", "Hello");     }



}
