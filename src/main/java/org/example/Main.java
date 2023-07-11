package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        //Definimos las Variables de Registro
        String UserName="Usuario29";
        String Password = "password123";
        String FirstName="FirstNamePrueba";
        String LastName="LastNamePrueba";
        String Email="usuario4@gmail.com";
        String Phone="0991724610";
        String Address1="Address1";
        String Address2="Address2";
        String City="CityPrueba";
        String State="StatePrueba";
        String Zip="001" ;
        String Country="ContryPrueba";


        // Configura la ubicación del archivo ejecutable de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:\\QaDrivers\\WebDriver/chromedriver.exe");

        // Configura la ubicación del archivo ejecutable de Brave
        System.setProperty("webdriver.chrome.braveSwitches", "--browser-executable-path=C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        // Configura opciones adicionales para Brave
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");

        // Inicia el navegador Brave
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://petstore.octoperf.com/actions/Account.action");
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.name("username")).sendKeys(UserName);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.name("repeatedPassword")).sendKeys(Password);
        driver.findElement(By.name("account.firstName")).sendKeys(FirstName);
        driver.findElement(By.name("account.lastName")).sendKeys(LastName);
        driver.findElement(By.name("account.email")).sendKeys(Email);
        driver.findElement(By.name("account.phone")).sendKeys(Phone);
        driver.findElement(By.name("account.address1")).sendKeys(Address1);
        driver.findElement(By.name("account.address2")).sendKeys(Address2);
        driver.findElement(By.name("account.city")).sendKeys(City);
        driver.findElement(By.name("account.state")).sendKeys(State);
        driver.findElement(By.name("account.zip")).sendKeys(Zip);
        driver.findElement(By.name("account.country")).sendKeys(Country);
        driver.findElement(By.name("account.listOption")).click();
        driver.findElement(By.name("account.bannerOption")).click();
        driver.findElement(By.name("newAccount")).click();

        // Singn In
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys(UserName);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.name("signon")).click();

        // Compra 2 Peces
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
        driver.findElement(By.linkText("FI-SW-01")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.linkText("FI-FW-02")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.xpath(" //*[@id=\"Catalog\"]/a")).click();

        // Retorna al Menu Inicial
        driver.findElement(By.linkText("Return to Main Menu")).click();

        //Compra 2 Gatos
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]")).click();
        driver.findElement(By.linkText("FL-DSH-01")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.linkText("FL-DLH-02")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.xpath(" //*[@id=\"Catalog\"]/a")).click();

        // Retorna al Menu Inicial
        driver.findElement(By.linkText("Return to Main Menu")).click();

        // Compra 3 Reptiles
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]")).click();
        driver.findElement(By.linkText("RP-SN-01")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.linkText("RP-LI-02")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.xpath(" //*[@id=\"Catalog\"]/a")).click();
        //

    }
}
