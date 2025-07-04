package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestCollections {

    public static void main(String[] args) throws InterruptedException {

        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(10);

        System.out.println("Created arrayList is : " + arrayList);
        System.out.println("\nIterating arrayList with forEach method() :");
        arrayList.forEach((n) -> System.out.println(n));

        System.out.println("\nIterating arrayList with for-each loop :");
        for (Integer i : arrayList)
            System.out.println(i + " ");

        System.out.println("\nSize of the arrayList is : " + arrayList.size());
        System.out.println("Get element by index: " + arrayList.get(2));
        System.out.println("Remove element by index: " + arrayList.remove(3));
        System.out.println("Now Size of the arrayList is : " + arrayList.size());

        HashMap<String, String> myHash = new HashMap<>();
        myHash.put("1", "I am first Hash");
        myHash.put("2", "I am second Hash");
        myHash.put("3", "I am third hash");
        myHash.put("10", "I am last Hash");
        myHash.put("2", "I am overriden second hash");

        System.out.println("\nCreated hashMap is : " + myHash);
        System.out.println("\nIterating HashMap with forEach method() :");
        myHash.forEach((k, v) -> {
            System.out.println((k + ":" + v));
        });

        System.out.println("\nIterating HashMap with for-each loop :");
        for (Map.Entry mapElement : myHash.entrySet()) {
            String key = (String) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.println("\nGet the third element : " + myHash.get("2"));
        System.out.println("Size of the hashMap is: " + myHash.size());
        myHash.put("4", "I am fourth Hash");
        System.out.println("Now size of the hashMap is: " + myHash.size());
        System.out.println("Does my hashMap contain key '3'? " + myHash.containsKey("3"));

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Karanjit_Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://instacalc.com/");

        WebElement inputField = driver.findElement(By.xpath("//calc[@data-reactroot]//descendant::div[@class='rows graphpaper']//row[1]//input"));
        Thread.sleep(2000);

        //element.clear() does not work here
        inputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        Thread.sleep(2000);

        inputField.sendKeys("4/2");

        WebElement outputField = driver.findElement(By.xpath("//calc[@data-reactroot]//descendant::div[@class='rows graphpaper']//row[1]//result"));

        String outputFieldText = outputField.getText();


        System.out.println("Output is: " + outputFieldText);

        driver.close();
*/

    }

}
