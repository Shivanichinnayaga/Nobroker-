package Runner;

import org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import;
import org.testng.annotations.Test;

import Pageobject.Aboutus;
import Pageobject.Enquiry;
import Pageobject.Flatmate;
import Pageobject.Menu;
import Pageobject.Rent;
import Pageobject.buy;
import Pageobject.career;
import Pageobject.menubook;
import Pageobject.pay;
import Pageobject.refer;
import utilities.Baseclass;

public class objectclass extends Baseclass {
	@Test
	public void object() throws InterruptedException 
	{
		
		
		
		
		Menu m = new Menu(driver);
		m.menu1().click();
		m.menu2().click();
		m.pghostel1().click();
		Thread.sleep(2000);
		
		
		Flatmate fm = new Flatmate(driver);
		fm.Flat1().click();
		fm.Bang1().click();
		Thread.sleep(2000);
		
		pay p =new pay(driver);
		p.Pay1().click();
		Thread.sleep(2000);
		
		Aboutus au=new Aboutus(driver);
		au.about1().click();
		Thread.sleep(2000);
		 
		Enquiry e=new Enquiry(driver);
        e.enquiry1().click();
        Thread.sleep(2000);
        
        career cs=new career(driver);
		cs.career1().click();
		Thread.sleep(2000);
		
		Rent r=new Rent(driver);
		System.out.println(r.rents1().getText());
		r.emi1().click();
		
		
		
		buy b = new buy(driver);
		System.out.println(b.buy1().getText());
		Thread.sleep(2000);
		b.Homeloan1().click();
		Thread.sleep(2000);
		
		menubook mb=new menubook(driver);
		mb.menu1().click();
		Thread.sleep(2000);
		mb.paint1().click();
		Thread.sleep(2000);
		System.out.println(mb.choose1().getText());
		Thread.sleep(2000);
		
		
		
		
		 
		
		
}
        

}
