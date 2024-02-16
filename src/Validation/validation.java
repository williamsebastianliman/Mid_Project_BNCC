package Validation;

import java.util.Scanner;

public class validation {
	public static int integerValidation(int minRange, int maxRange,String comment)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			try {
				System.out.print(comment+" ["+minRange+"-"+maxRange+"]: ");
				int num=scan.nextInt(); scan.nextLine();
				if(num>=minRange&&num<=maxRange)
				{
					return num;
				}
				else
				{
					System.out.println("Input Must Between "+minRange+" And "+maxRange+"!");
				}
			} catch (Exception e) {
				System.out.println("Input Must Be A Number");
				scan.nextLine();
			}
			
		}
	}
	public static String typeValidation(String comment, String types[])
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print(comment);
			String type=scan.nextLine();
			for(int i=0;i<types.length;i++) 
			{
				if(type.equals(types[i]))
				{
					return type;
				}
			}
			System.out.println("Type is Not Valid!");
		}
	}
	
	public static String stringValidation(String comment, int minChar)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print(comment+" [>="+minChar+"]: ");
			String sen=scan.nextLine();
			if(sen.length()>=minChar)
			{
				return sen;
			}
			else
			{
				System.out.println("String Length Must Be >= "+minChar+"Character(s)");
			}
		}
	}
	
	public static String plateValidation()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("Input License: ");
			String plate=scan.nextLine();
			String com[]=plate.split(" ");
			if(com.length!=3)
			{
				System.out.println("License Format is Incorrect!");
				continue;
			}
			if(com[0].charAt(0)>='A'&&com[0].charAt(0)<='Z')
			{
				if(com[1].length()>=1&&com[1].length()<=4)
				{
					boolean isValid=true;
					for(int i=0;i<com[1].length();i++)
					{
						if(!(com[1].charAt(i)>='0'&&com[1].charAt(i)<='9'))
						{
							isValid=false;
							break;
						}
					}
					if(isValid)
					{
						if(com[2].length()>=1&&com[2].length()<=3)
						{
							boolean isValid2=true;
							for(int i=0;i<com[2].length();i++)
							{
								if(!(com[2].charAt(i)>='A'&&com[2].charAt(i)<='Z'))
								{
									isValid2=false;
									break;
								}
							}
							if(isValid2)
							{
								return plate;
							}
							else
							{
								System.out.println("License Type Must Be In Upper Case Latin Alphabet!");
							}
						}
						else
						{
							System.out.println("License Type Must Be Between 1-3 Character(s)");
						}
					}
					else
					{
						System.out.println("License Number Digit Must Be Between 0-9");
					}
				}
				else
				{
					System.out.println("License Number Must Be Between 1-4 Digit!");
				}
				
			}
			else
			{
				System.out.println("Area Code Must Be In Upper Case Latin Alphabet!");
			}
		}
	}
	
}
