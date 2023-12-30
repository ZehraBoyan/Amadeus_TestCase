package org.example.SearchTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://flights-app.pages.dev/");

        // “From” ve “To” input alanlarında aynı değerin girilemediğini test et.

        WebElement frominput=driver.findElement(By.xpath("//input[@id='headlessui-combobox-input-:Rq9lla:']"));
        frominput.sendKeys("Istanbul");

        WebElement fromsubmit=driver.findElement(By.xpath("//ul[@class='absolute z-10 mt-1 max-h-60 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm']"));
        fromsubmit.click();

        Thread.sleep(1000);

        WebElement toInput = driver.findElement(By.xpath("//input[@id='headlessui-combobox-input-:Rqhlla:']"));
        toInput.sendKeys("Istanbul");

        WebElement tosubmit=driver.findElement(By.xpath("//ul[@id='headlessui-combobox-options-:R1qhlla:']"));
        tosubmit.click();

        if (frominput.getText().equals(toInput.getText())){
            System.out.println("'From ve 'To' alanlarina ayni isimler girilemez!!'");
        }
        else {
            System.out.println("Test Basarili.");
        }
        Thread.sleep(1000);

        driver.quit();

    }
}
