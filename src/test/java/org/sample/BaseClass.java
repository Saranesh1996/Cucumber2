package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public  static Actions a;
	public static Select s;
	public static Alert a1;
	public static JavascriptExecutor js;
	
	//webdriverMethods
	
	public static void browserCall() {
		//to set configure
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();

	}
	//webdriverMethods
	public static void launchUrl(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		// TODO Auto-generated method stub
driver.close();
	}
	//webdriverMethods
	public static void url() {
		// TODO Auto-generated method stub
		String cl = driver.getCurrentUrl();
		System.out.println(cl);

	}
	//webdriverMethods
	public static void title() {
		// TODO Auto-generated method stub
String title = driver.getTitle();
System.out.println(title);
	}
	
	//webelement methods
	public static void sendValues(WebElement element , String value) {
		// TODO Auto-generated method stub
		element.sendKeys(value);

	}
	//webelement methods
	public static void text(WebElement element) { 
		// TODO Auto-generated method stub
String text = element.getText();
System.out.println(text);
	}
	//webElement methods
	public static  String attribute(WebElement element,String name ) {
		// TODO Auto-generated method stub
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
		return attribute;

	}
	public static void click(WebElement element) {
		// TODO Auto-generated method stub
element.click();
	}
	public static void mouseHover(WebElement element) {
		// TODO Auto-generated method stub
     a = new Actions(driver);
    a.moveToElement(element).perform();
	}
	public static void dragDrop(WebElement source,WebElement target) {
		// TODO Auto-generated method stub
		a= new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public static void screenShot(String image) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot tks = (TakesScreenshot)driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\MavenProject\\Screenshot\\"+image+".png");
				FileUtils.copyFileToDirectory(source, des);
	}
	public static void selectByVisibleText(WebElement element, String text) {
		// TODO Auto-generated method stub
		 s = new Select(element);
			s.selectByVisibleText(text);	

	}
	public static void selectByIndex(WebElement e , int i) {
		// TODO Auto-generated method stub
s= new Select(e);
s.selectByIndex(i);
	}
	public static void selectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub
s= new Select(element);
s.selectByValue(value);
	}
	public static void isMultiple(WebElement e) {
		// TODO Auto-generated method stub
s= new Select(e);
if (s.isMultiple()) {
	System.out.println("multiple selection");
}else {
	System.out.println("single selection");
}
	}
	public static void getAllSelectedOptions(WebElement element) {
		// TODO Auto-generated method stub
		s= new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement links : allSelectedOptions) {
			System.out.println(links.getText());
		}
	}
public static void getFirstSelected(WebElement element) {
	// TODO Auto-generated method stub
s= new Select(element);
WebElement option = s.getFirstSelectedOption();
System.out.println(option.getText());
}
public static void getOptions(WebElement element) {
	// TODO Auto-generated method stub
	s= new Select(element);
	List<WebElement> options = s.getOptions();
	int size = options.size();
	System.out.println("number of elements"+ size);
	

}
public static void deselectByValue(WebElement E , String value) {
	// TODO Auto-generated method stub
s= new Select(E);
s.deselectByValue(value);
}
public static void deselectByIndex( WebElement element, int i) {
	// TODO Auto-generated method stub
s= new Select(element);
s.deselectByIndex(i);
}
	public static void deselectByVisibleText(WebElement element , String text) {
		// TODO Auto-generated method stub
s = new Select(element);
s.deselectByVisibleText(text);
	}
	public static void deselectAll(WebElement element) {
		// TODO Auto-generated method stub
s= new Select(element);
s.deselectAll();
	}
	
	//alerts
	public static void AlertSimple() {
		// TODO Auto-generated method stub

	 a1 = driver.switchTo().alert();
	a1.accept();
	}
	public static void alertDismiss() {
		// TODO Auto-generated method stub
a1= driver.switchTo().alert();
a1.dismiss();
	}
	public static void sendkeysAlert( String text) {
		// TODO Auto-generated method stub
a1= driver.switchTo().alert();
a1.sendKeys(text);
	}
public static void textAlert() {
	// TODO Auto-generated method stub
a1= driver.switchTo().alert();
String txt = a1.getText();
System.out.println(txt);
}
public static void thread(int value) throws InterruptedException {
	// TODO Auto-generated method stub
Thread.sleep(value);
}
public static void javaScript(String ScriptKey , WebElement ref) {
	// TODO Auto-generated method stub
JavascriptExecutor js = (JavascriptExecutor)driver;
Object script = js.executeScript(ScriptKey, ref);
}
public static void getAttribute(String ScriptKey , WebElement ref) {
	// TODO Auto-generated method stub
js= (JavascriptExecutor)driver;
Object get = js.executeScript(ScriptKey, ref);
System.out.println(get);
}
public static String getDataDrivenReadFile(int rowNum, int cellNum, String sheetName,String fileName) throws IOException {
	// TODO Auto-generated method stub
	// file path
	File f = new File("C:\\Users\\DELL\\eclipse-workspace\\MavenProject\\ExcelFile\\"+fileName+".xlsx");
//to read a  file
	FileInputStream fis = new FileInputStream(f);
// to define a workbook
	Workbook w = new XSSFWorkbook(fis);
// to get the sheet
	Sheet sheet = w.getSheet(sheetName);
	
// to get the particular row and particular cell in a row 
		Row row = sheet.getRow(rowNum);
	// to get the cell in row interface	
		String value ="";
			Cell cell = row.getCell(cellNum);
			int cellType = cell.getCellType();
			if (cellType==1) {
				
				 value = cell.getStringCellValue();
				System.out.println(value);
				
			}else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
			
				SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
				 value = sim.format(dateCellValue);
				System.out.println(value);
			}
			else {
				double num = cell.getNumericCellValue();
				long l = (long)num;
				value = String.valueOf(l);
				System.out.println(value);	
				
			}
			return value;
}
	public static void main(String[] args)throws IOException,InterruptedException { 
		
	}
	
}
