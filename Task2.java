package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Jan");
        WebElement  day=driver.findElement(By.xpath("//select[@id='day']"));
        Select sel1=new Select(day);
        sel1.selectByValue("5");
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
       Select sel2=new Select(year);
       sel2.selectByVisibleText("1992");
       Thread.sleep(2000);
       closeBrowser();

    }
}
