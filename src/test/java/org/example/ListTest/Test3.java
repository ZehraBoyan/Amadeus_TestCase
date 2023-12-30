package org.example.ListTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://flights-app.pages.dev/");

        WebElement fromInput = driver.findElement(By.xpath("//input[@id='headlessui-combobox-input-:Rq9lla:']"));
        fromInput.sendKeys("Istanbul");

        Thread.sleep(1000);
        WebElement fromsubmit=driver.findElement(By.xpath("//ul[@class='absolute z-10 mt-1 max-h-60 w-full overflow-auto rounded-md bg-white py-1 text-base shadow-lg ring-1 ring-black ring-opacity-5 focus:outline-none sm:text-sm']"));
        fromsubmit.click();

        Thread.sleep(1000);

        WebElement toInput = driver.findElement(By.xpath("//input[@id='headlessui-combobox-input-:Rqhlla:']"));
        toInput.sendKeys("Los Angeles");

        Thread.sleep(1000);

        WebElement tosubmit=driver.findElement(By.xpath("//li[@class='relative cursor-default select-none py-2 pl-3 pr-9 bg-indigo-600 text-white']"));
        tosubmit.click();

        Thread.sleep(1000);

        //“Found X items” yazısında X sayısı ile listelenen uçuş sayısının aynı olduğunu test et.

        List<WebElement> elements=driver.findElements(By.xpath("//li[@class='overflow-hidden rounded-xl border border-gray-200']"));
        int elementCounts=elements.size();

        WebElement string=driver.findElement(By.className("mb-10"));
        String stringText=string.getText();
        int intText=Integer.parseInt(stringText.split("\\s+")[1]);

        if (elementCounts==intText){
            System.out.println("Test Basarili:Ucus sayisi ile string ifade sayisi esit");
        }
        else {
            System.out.println("Hata: Ucus sayisi ile string ifade esit degil");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
