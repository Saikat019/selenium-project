package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties properties = new Properties();
    FileInputStream fileInputStream = null;

    public Base(){
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\Demo1\\src\\main\\java\\com\\qa\\config\\config.properties");
            properties.load(fileInputStream);
        }
        catch(Exception e) {
        }
    }
    public static void initialization(){

        /*System.setProperty("webdriver.gecko.driver", "E:\\mySoftware\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        */

        String browserName = properties.getProperty("browser");
        if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "E:\\mySoftware\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));

        /*WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("Mulberri inc");
        element.sendKeys(Keys.ENTER);*/

    }
}
