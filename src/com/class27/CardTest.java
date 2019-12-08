package com.class27;

public class CardTest {

	public static void main(String[] args) {
		// take an object of child class and give refrence to the parent
		//type reference variable
		// during the run time JVM look at run time object of a child class we have access to parents method
		// during run time method of child class gets executed
		//TODO Auto-generated method stub
		Card obj=new Card();
		obj.chargeInterest();
		obj.creditLimit();
Card card=new AX();
card.chargeInterest();
card.creditLimit();
Card card1=new MC();
card1.creditLimit();
Card card2=new visa();
card2.creditLimit();
int[] numarray= {10,12,13};
Card[] cardArray= {card,card1,card2};// holding non primitive types of data types because they aree type of Card
Card[] cardArray1= {new MC(),new AX(),new visa(),new Discovery()};
for(Card myCard:cardArray1) {
	myCard.creditLimit();
myCard.chargeInterest();

}
AX ax1=new AX();
ax1.chargeInterest();
ax1.creditLimit();
MC mc1 =new MC();
MC mc2=new MC();
MC mc3=new MC();
mc1.cashBack();
mc1.chargeInterest();
mc1.creditLimit();
Card cc =new MC();
cc.chargeInterest();
cc.creditLimit();
MC[] masterCards= {mc1,mc2,mc3};
// creating an object and storing it directly into an Array of 
for(int y=0;y<cardArray1.length;y++)
{
cardArray1[y].creditLimit();
}
for(MC mCard:masterCards)
{
	mCard.cashBack();
	mCard.chargeInterest();
	mCard.creditLimit();
}
	}

}
