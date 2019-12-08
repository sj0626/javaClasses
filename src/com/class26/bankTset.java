package com.class26;

public class bankTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.money=900;
		double fee= bank.chargeFee();
System.out.println("Bank fee=" +fee);

PNC pnc=new PNC();
pnc.money=900;
double pncFee=pnc.chargeFee();
System.out.println("PNC fee=" +pncFee);
degree deg= new degree();
deg.getdegree();
underGraduate ug=new underGraduate();
ug.getdegree();
Postgraduate pg=new Postgraduate();
pg.getdegree();

ChromeDriver chrome=new ChromeDriver();
chrome.refresh();
chrome.open();
Firefox firefox=new Firefox();
firefox.refresh();
firefox.open();
WebDriver driver=new ChromeDriver();
driver.open();
driver.refresh();
WebDriver driver1=new Firefox();
driver1.open();
driver1.refresh();
child obj=new child();

	}


}
