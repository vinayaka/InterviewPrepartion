package com.interview.RunningTestonLatest.Broser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SapiatGetDiscount {
	
	//Get the highest discount from the today sales Amozon

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//.style_badgeLabel__dD0Hv>span:first-child
		
		driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522&promotionsSearchStartIndex=10&promotionsSearchLastSeenAsin=B0C3C3WZMV");
		Thread.sleep(5000);
		List<WebElement> disCount=driver.findElements(By.cssSelector(".style_badgeLabel__dD0Hv>span:first-child"));
		System.out.println(disCount.size());
		List<String> discounttext=new ArrayList();
		String dis="";
		for(WebElement e:disCount) {
			//System.out.println(e.getText());
			 dis=e.getText();
			dis.substring(0, 2);
			//System.out.println(dis.substring(0, 2));
			discounttext.add(dis.substring(0, 2));
		}
		String[] s=new String[discounttext.size()];
		s=discounttext.toArray(s);
	//	Arrays.sort(s);
		
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(s[0]);
//		for(String s1:s) {
//			System.out.println(s1);
//		}
	}
	

}
