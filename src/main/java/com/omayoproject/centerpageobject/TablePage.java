package com.omayoproject.centerpageobject;

import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.omayoproject.base.BasePage;

public class TablePage extends BasePage {

	private Random rand = new Random();

	@FindBy(xpath = "//table[@id = 'table1']/tbody/tr/td[2]")
	private List<WebElement> rows;

	@FindBy(xpath = "//tbody/tr[2]/td")
	private List<WebElement> cells;

	@FindBy(xpath = "//table[@id='table1']/tbody/tr[1]/td[3]")
	private WebElement valueDelhi;

	@FindBy(xpath = "//table[@id='table1']/tbody/tr[4]/td[2]")
	private WebElement value31;

	@FindBy(xpath = "//table[@id = 'table1']/tbody")
	private List<WebElement> lists;

	public void printColumnValues() {

		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			System.out.println(row.getText());

		}

	}

	public void printRowsValues() {
		for (int i = 0; i < cells.size(); i++) {
			WebElement cell = cells.get(i);
			System.out.print(cell.getText() + " ");
		}
	}

	public void printSpecificValues() {
		String delhi_text = action.getText(valueDelhi);
		System.out.println(delhi_text);

		String Number31 = action.getText(value31);
		System.out.println(Number31);
	}

	public void prindRandomValues() {

		for (int i = 0; i < lists.size(); i++) {
			WebElement list = lists.get(i);
			int Random1 = rand.nextInt(1, 5);
			int Random2 = rand.nextInt(1, 4);
		

			String newXpath = "tr[" + Random1 + "]/td[" + Random2 + "]";
			WebElement li = list.findElement(By.xpath(newXpath));
			System.out.println("Random Value: " + li.getText() + "\nRandom1: " + Random1 + "\nRandom2: " + Random2);
		}
//	
	}

}
