package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

import Object.Car;
import Object.Motorcycle;
import Object.Vehicle;
import Printing.Printing;
import Validation.validation;

public class Main {
	
	public Main()
	{
		ArrayList<Vehicle> database=new ArrayList<Vehicle>();
		while(true)
		{
			System.out.println("-PT CHIPI CHAPA VEHICLE DATABASE-");
			System.out.println("1 -> INPUT DATA");
			System.out.println("2 -> VIEW");
			System.out.println("3 -> QUIT");
			int com=validation.integerValidation(1, 3, ">>");
			if(com==1)
			{
				String vTypes[]= {"Car","Motorcycles"};
				String vType=validation.typeValidation("Input Vehicle Type [Car/Motorcycles]: ", vTypes);
				String brand=validation.stringValidation("Input Brand", 5);
				String name=validation.stringValidation("Input Name", 5);
				String plate=validation.plateValidation();
				int topSpeed=validation.integerValidation(100, 250, "Input Top Speed");
				int gasCap=validation.integerValidation(30, 60, "Input Gas Capacity");
				if(vType.equals("Car"))
				{
					int wheel=validation.integerValidation(4, 6, "Input Wheel");
					String types[]= {"SUV","Supercar","Minivan"};
					String type=validation.typeValidation("Input Car Type [SUV/Supercar/Minivan]: ", types);
					int system=validation.integerValidation(1, 1000000, "Input Entertainment System Amount");
					Car carTemp=new Car(vType,brand,name,plate,topSpeed,gasCap,wheel,type,system);
					database.add(carTemp);
					System.out.println("Succsesfully Adding A New Car, Enter to Continue...");
					Scanner tempScan=new Scanner(System.in);
					tempScan.nextLine();
				}
				else
				{
					int wheel=validation.integerValidation(2, 3, "Input Wheel");
					String types[]= {"Automatic","Manual"};
					String type=validation.typeValidation("Input Motorcycle Type [Automatic/Manual]: ", types);
					int helmet=validation.integerValidation(1, 10000, "Input Helmet");
					Motorcycle motorTemp=new Motorcycle(vType,brand,name,plate,topSpeed,gasCap,wheel,type,helmet);
					database.add(motorTemp);
					System.out.println("Succsesfully Adding A New Motorcycles, Enter to Continue...");
					Scanner tempScan=new Scanner(System.in);
					tempScan.nextLine();
				}
			}
			else if(com==2)
			{
				int in=0;
				System.out.println("Number\t\tType\t\t\tName");
				boolean isEmpty=true;
				for(Vehicle v:database)
				{
					isEmpty=false;
					in+=1;
					Printing.printRow(in, v.getType(), v.getName());
				}
				if(isEmpty)
				{
					System.out.println("EMPTY");
				}
				else
				{
					while(true)
					{
						int num=validation.integerValidation(0, database.size(), "Pick a vehicle number to Drive [Enter '0' to exit!]");
						if(num==0)
						{
							System.out.println("Going Back to Main Menu, Enter to Continue...");
							Scanner tempScan=new Scanner(System.in);
							tempScan.nextLine();
							break;
						}
						else
						{
							Vehicle temp=database.get(num-1);
							temp.describe();
						}
					}
					
				}
				
			}
			else
			{				
				System.out.println("Press Enter to Exit...");
				Scanner tempScan=new Scanner(System.in);
				tempScan.nextLine();
				break;
			}
		}
		
		
	}
	public static void main(String[] args) {
		new Main();
	}

}
