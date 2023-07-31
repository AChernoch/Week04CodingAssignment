package Week04;

import java.util.Arrays;

public class week4CodingProject {

	public static void main(String[] args) {
	
		System.out.println("\n Question 1:");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Created ages int array with 8 variables.
		int result = ages[0] - ages[ages.length -1]; //subtracted fisrt value minus the last value.
		System.out.println("First elements minus last element is: " + result); //Printed results from calculation.
		int[] ages2 = {34, 25, 91, 64, 76, 7, 3, 5, 18};//created new int array with 9 variables
		int results = ages2[0] - ages2[ages2.length - 1];//subtracted first value minus the last.
		System.out.println("The first element minus the last element is: " + results);//printed results from above calculation.
		double sumOfAges2 = 0;
		for (int age : ages2) {
			sumOfAges2 += age; // calculated the sum of the ages2 array
		}
		double averageAges2 = sumOfAges2 / ages2.length; // calculated average age
		System.out.println("The average age is: " + averageAges2); //Printed the average age.
	
		System.out.println("\n Question 2:");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Created string array.
		double sumCharacters = 0;
		for (String name : names) {
			sumCharacters += name.length();// calculated total values of names array
		}
		double averageNameLength = sumCharacters / names.length; //calculated the average length of names.
		System.out.println("The average name length is: " + averageNameLength);// printed out results.
	
		System.out.println("\n Question 3:");
		System.out.println("You can access the last element in an array by using "
			+ "the '(arrayname).length - 1'.");
	
		System.out.println("\n Question 4: ");
		System.out.println("Use the array index of [0] to find the first element.");
	
		System.out.println("\n Question 5: ");
		int[] nameLengths = new int[names.length];//Created int array and added string 
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();// for loop adding string into int array
		}
		System.out.println(Arrays.toString(nameLengths));  //Printed out results to show it worked
	
		System.out.println("\n Question 6: ");
		int sumOfNameLengths = 0;
		for (int lengths : nameLengths) {
			sumOfNameLengths += lengths; //Calculated the sum of lengths of int array
		}
		System.out.println("The sum of all variables is: " + sumOfNameLengths);//printed out results.
	
		System.out.println("\n Question 7: ");
		System.out.println("Method test: " + multiplyStringByN("Yo!", 3));
		
		System.out.println("\n Question 8: ");
		System.out.println("Method test full name: " + fullName("Alexander", "Chernoch"));
		
		System.out.println("\n Question 9: ");
		int[] randomNumbers = {25, 45, 10, 7, 31, 50};// int array created.
		System.out.println("Is the sum greater than 100? " + isSumGreaterThan100(randomNumbers));//testing the method.
		
		System.out.println("\n Question 10: ");
		double[] money = {2.88, 5.37, 1.08, 8.75};//created a double array
		System.out.println("The average amount is: " + averageDouble(money));//testing the method
		
		System.out.println("\n Question 11: ");
		double[] arrayOne = {9.9, 7.7, 6.6, 8.8, 5.5};// created a double array
		double[] arrayTwo = {1.1, 2.2, 3.3, 4.4, 5.5};// created a second double array
		System.out.println("Is the average of array one higher? " + isArrayOneGreater(arrayOne, arrayTwo));
		
		System.out.println("\n Question 12: ");
		boolean isHotOutside = true;//set is the boolean to true
		double moneyInPocket = 25.15;// set a double value for higher than 10.50
		System.out.println("Will I buy a drink? " + willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println("\n Question 13: ");
		//I wrote this method because the price of video games has been rising for
		//the many years that I have been playing. I used to buy the latest and greatest
		//but realized that if I wait a few months to a year they usually go on sale
		//with all of the DLC content included at a reduced rate.
		boolean isOnSale = true;
		double priceOfGame = 59.99;
		System.out.println("Is this video game on sale? " + isGameOnSale(isOnSale, priceOfGame));
		
	}// Method for Question 7.
	public static String multiplyStringByN (String word, int n) { //Created a static method
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word; // for loop to accept inputs
		}
		return result;//returned the result for testing
		
	}//Method for Question 8.
	public static String fullName (String firstName, String lastName) {
		return firstName + " " + lastName; //made a return for this method
		
	}//Method for Question 9.
	public static boolean isSumGreaterThan100 (int[] num) {// boolean is used because true or false answer is requested.
		int sum = 0;
		for (int number : num) {
			sum += number; // created a loop to run through all inputs of array
		}
		return sum > 100;// will return true or false
		
	}//Method for Question 10.
	public static double averageDouble (double[] array) {
		double sum = 0.0;
		for (double num : array) {
			sum += num; //calculated the sum of the double array
		}
		return sum / array.length;//returned the calculated average of the array
		
	}//Method for Question 11.
	public static boolean isArrayOneGreater (double[] arrayOne, double[] arrayTwo) {
		double sumOne = 0.0;
		double sumTwo = 0.0;
		for (double one : arrayOne) {
			sumOne += one;//calculated the sum of array one
			}
		double avgOne = sumOne / arrayOne.length;
		for	(double two : arrayTwo) {
			sumTwo += two;//calculated sum of array two
			}
		double avgTwo = sumTwo / arrayTwo.length;
		return avgOne > avgTwo;//return the boolean for the averages.
		
	}//Method for Question 12.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
		
	}// Create your own method for question 13.
	public static boolean isGameOnSale (boolean isOnSale, double priceOfGame) {
		return isOnSale && priceOfGame < 25.99;
	}
}
