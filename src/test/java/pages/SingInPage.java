package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SingInPage {

    public static String username_text_xpath = "//*[@id=\"user-name\"]";
    public static String password_text_xpath = "//*[@id=\"password\"]";
    public static String login_btn_xpath = "//*[@id=\"login-button\"]";



    public static void sendKeys_username_login() {
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("standard_user");
    }

    public static void sendyKeys_password_login() {
        driver.findElement(By.xpath(password_text_xpath)).sendKeys("secret_sauce");

    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }

}
