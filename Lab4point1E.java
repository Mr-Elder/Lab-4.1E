//Max De George Period 8 Lab4point1E

//***********************************************************
//   Lab4point1E.java
//   Computes total boxes sold during a campaign that is "n" weeks long         
//***********************************************************

import static java.lang.System.out;
import java.util.Random;

public class Lab4point1E
{
    public static void main(String[] args)
    {
	
	BandBooster booster1 = new BandBooster(GetInfo.getString("Please enter the name of band booster one: "));
	BandBooster booster2 = new BandBooster(GetInfo.getString("Please enter the name of band booster two: "));
	BandBooster booster3 = new BandBooster(GetInfo.getString("Please enter the name of band booster three: "));
	
	
	int weeks;	
	int nbrOfBoxes;
	int x = 1;
	int weeklySales;
	
	
	String Message = ("\n");
	String string1;
	String string2;
	String string3;
	
	
	
	
	weeks = GetInfo.getInt("Please enter the amount of weeks the fundraiser is: ");
	
	do
	{
		
		booster1.updateSales(GetInfo.getInt("Enter the number of boxes sold by " + booster1.getName() + " this week: "));
		
		booster2.updateSales(GetInfo.getInt("Enter the number of boxes sold by " + booster2.getName() + " this week: "));
		
		booster3.updateSales(GetInfo.getInt("Enter the number of boxes sold by " + booster3.getName() + " this week: "));
		
		x++;
	}
	while(x <= weeks);
		
	Message += booster1.toString();
	Message += booster2.toString();
	Message += booster3.toString();
	
	//booster1 sold most
				
	GetInfo.showMessage(Message);
		
		
		
	}
	
	}

