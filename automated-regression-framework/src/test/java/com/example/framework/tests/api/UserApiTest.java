package com.example.framework.tests.api;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class UserApiTest {
 @Test
 public void apiTest(){
  RestAssured.get("https://jsonplaceholder.typicode.com/users").then().statusCode(200);
 }
}