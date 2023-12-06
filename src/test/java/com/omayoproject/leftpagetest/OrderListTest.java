package com.omayoproject.leftpagetest;

import java.time.Duration;

import org.testng.annotations.Test;

import com.omayoproject.base.BaseTest;
import com.omayoproject.leftpageobject.OrderListPage;

public class OrderListTest extends BaseTest{

	private OrderListPage orderListPage;
	
	@Test()
	public void orderListTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 orderListPage = new OrderListPage();
		 orderListPage.orderList();
		
	}
}
