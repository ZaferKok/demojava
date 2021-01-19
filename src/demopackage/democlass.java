package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class democlass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CIMBOM\\Documents\\selenium dependencies\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Alles klar!");
        System.out.println("Ja!");
        System.out.println("Wie geht es dir?");
    }
}
