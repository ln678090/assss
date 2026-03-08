package org.ln678090;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class wwebTest {
private static String EMAIL;
private static String PASSWORD;
private static String USERNAME;


    @BeforeAll
    static void setUpall() {
        EMAIL=System.currentTimeMillis()+"fsddsds@gmail.com";
        PASSWORD=System.currentTimeMillis()+"sfsf";
        USERNAME=System.currentTimeMillis()+"sfsf";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void refiner(){
        ChromeOptions options = new ChromeOptions();
        if(System.getenv("CI")!=null){
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://loppytoon.com/dang-ky");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.findElement(By.id("email")).sendKeys(EMAIL);
            driver.findElement(By.id("user_name")).sendKeys(USERNAME);
            driver.findElement(By.id("password")).sendKeys(PASSWORD);
            driver.findElement(By.id("password_confirmation")).sendKeys(PASSWORD);
            driver.findElement(By.xpath("//button[text()='Đăng ký']")).click();
 org.openqa.selenium.WebElement  element =            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Đăng nhập']")));
assertTrue(element.isDisplayed());
        } finally {
driver.quit();
        }

    }
    @Test
    @Order(2)
    void login(){
        ChromeOptions options = new ChromeOptions();
        if(System.getenv("CI")!=null){
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://loppytoon.com/dang-nhap");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.findElement(By.id("email")).sendKeys(EMAIL);
//            driver.findElement(By.id("user_name")).sendKeys(USERNAME);
            driver.findElement(By.id("password")).sendKeys(PASSWORD);
//            driver.findElement(By.id("password_confirmation")).sendKeys(PASSWORD);
            driver.findElement(By.xpath("//button[text()='Đăng nhập']")).click();
  assertEquals("https://loppytoon.com/", driver.getCurrentUrl());
        } finally {
driver.quit();
        }

    }
}