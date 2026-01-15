package com.example.framework.tests.ui;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LoginUITest {
 @Test
 public void openGoogle(){
  WebDriver d=new ChromeDriver();
  d.get("https://www.google.com");
  d.quit();
 }
}