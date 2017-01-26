import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson101 
{
	public static void main (String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter an equation:");
		String Equation = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(Equation.split(" ")));
		
		doEquation(equation);
		System.out.println(equation.get(0));
	}
	
	public static void doEquation (ArrayList<String> equation) 
	{
		int i = 0;
		while (i < equation.size())
		{
			if (equation.get(i).equals("*")) 
			{
				equation.set(i, "" + Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1)));
				equation.remove(i-1);
				equation.remove(i);
			}
			
			else if (equation.get(i).equals("/")) 
			{
				equation.set(i, "" + Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1)));
				equation.remove(i-1);
				equation.remove(i);
			}
			
			else if (equation.get(i).equals("+")) 
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			
			else if (equation.get(i).equals("-")) 
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
	
			else 
			{
				i++;
			}
		}
	}
}