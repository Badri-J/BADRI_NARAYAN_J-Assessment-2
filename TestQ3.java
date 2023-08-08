package test2;
import java.util.Scanner;

import aug2.MenuItem;

interface MenuItem
{
	Scanner input=new Scanner(System.in);
	public String menuitem ="";
	public double price=0.00;
	
}
class sandwich implements MenuItem
{
	String[] menuitems = {"club sandwich","cheeseburger"};
	double[] prices = {2.75,2.75};
	sandwich(String menuitem,double price){
		System.out.println(menuitems[0]+" "+prices[0]);
		System.out.println(menuitems[1]+" "+prices[1]);
	}

}
class salad implements MenuItem
{

	String[] menuitems = {"coleslaw","spinach salad"};
	double[] prices = {3.50,1.15};
	salad(String menuitem,double price){
		System.out.println(menuitems[0]+" "+prices[0]);
		System.out.println(menuitems[1]+" "+prices[1]);
}
class drink implements MenuItem
{

	String[] menuitems = {"cappuccino","orange soda"};
	double[] prices = {2.30,1.25};
	drink(String menuitem,double price){
		System.out.println(menuitems[0]+" "+prices[0]);
		System.out.println(menuitems[1]+" "+prices[1]);
	
}
class trio implements MenuItem
{
	public trio() {
		int t=input.nextInt();
		t-=1;
		if(t==0)
		{
			System.out.println(menuitems[0]+"/"+prices[0]);
		}
	}
	
}
public class TestQ3 {

	public static void main(String[] args) {
		MenuItem mi=new MenuItem();
		System.out.println(mi.sandwich(n));

	}

}
