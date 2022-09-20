import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int [] x = {1,5,7,15,24,12,14,13,4,2,23};
		evenSum(x);
		evenOdd(x);
		minMax(x);
		minMaxOddEven(x);
		averageEvenOdd(x);
		
		
		//1a output the area of a square when a side is 3
		int aera_square = 3*3;
		System.out.println("1a : " + aera_square);
		
		//1b output the area of a rectangle, width=4 and height=3
		int aera_restangle = 4*3;
		System.out.println("1b : " + aera_restangle);
		
		//1c output the aera of a triangle, height=8, base=2
		int aera_triangle = (8*2)/2;
		System.out.println("1c : " + aera_triangle);
		
		//2a Fahrenheit to Celsius
		double fahrenheit = 60;
		double conv_to_celsius = (fahrenheit-32)*5/9;
		System.out.println("2a : " + conv_to_celsius);
		
		//2b Celsius to Fahrenheit
		double celcius = 25;
		double conv_to_fahrenheit = celcius*9/5+32;
		System.out.println("2b : " + conv_to_fahrenheit);
		
		//3a inches to centimeters
		double inches=20;
		double to_cm=inches*2.54;
		System.out.println("3a : " + to_cm);
		
		//3b centimeters to inches
		double cm=25;
		double to_inches=cm*0.39;
		System.out.println("3b : " + to_inches);
		
		
		//IF
		char grade;
		int gradeTest=25;
		
		if (gradeTest >= 90) {
			grade='A';
			}
		else if (gradeTest >= 80 && gradeTest < 90) {
			grade='B';
			}
		else if (gradeTest >= 70 && gradeTest < 80) {
			grade='C';
		}
		else if (gradeTest >= 60 && gradeTest < 70) {
			grade='D';
		}
		else {
			grade='F';
		}
		
		switch(grade) {
		case 'A':
			System.out.println("You got an A");
			break;
		case 'B':
			System.out.println("You got a B");
			break;
		case 'C':
			System.out.println("You got a C");
			break;
		case 'D':
			System.out.println("You got a D");
			break;
		default:
			System.out.println("You got an F");
			break;
		}
		
		//loop for -  add all even numbers
		int sum_for = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum_for += i;
			}
		}
		System.out.println("sum_for : " + sum_for);
		
		//while add all even numbers
		int sum_while = 0, j = 0;
		while (j < 101) {
			if (j % 2 == 0) {
					sum_while += j;
			}
			j++;
		}
		System.out.println("sum_while : " + sum_while);
		
		//average loop for
		int l = 0;
		double moyenne_for = 0;
		for (int k=0; k < 101; k++) {
			if (k % 2 == 0) {//pair
				l++;
				moyenne_for += k / l;
			}
		}
		System.out.println("Moyenne loop for = " + moyenne_for);
		
		//average - loop while
		int o = 0, n = 0, sum_moyenne_while = 0;
		double moyenne_while = 0;
		while (n < 101) {
			if (n % 2 == 0) {
				o += 1;
				sum_moyenne_while += n;
				
			}
			n += 1;
		}
		moyenne_while = (sum_moyenne_while / o);
		System.out.println("Moyenne loop while = " + moyenne_while);

		
		//scanner
		//ask 5 times the user which operation to do (+, -, *, /)
		//generate random numbers for the operations
		//Demande du type d'opération
		//Import de la classe Scanner en haut
		Scanner operation = new Scanner(System.in);
		Random random = new Random();
		int userAnswer;
		
		System.out.println("Type d'opération à faire (+,-,*,/)?");
		String userOpe = operation.nextLine();
		
		
		while(true) {
		if (userOpe.equals("+") || userOpe.equals("-") || userOpe.equals("*") || userOpe.equals("/"))
			break;
		else {
				System.out.println("Invalid input!");
				userOpe = operation.nextLine();
			}
		}
		
		
		if (userOpe.equals("+")) {
			int num1 = random.nextInt(13);
			int num2 = random.nextInt(13);
			int resultat = num1 + num2;
			System.out.println(num1 + "+" + num2 + "?");
			userAnswer = operation.nextInt();
			if (resultat == userAnswer) {
				System.out.println("Congrats!");
			}
			else {
				System.out.println("Faux!");
			}
		}
		operation.close();

		}

	
	//Calculate sum of even numbers
	public static int evenSum(int[] x) {
		int sommeEven = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				sommeEven = sommeEven + x[i];
			}
		}
		System.out.println("Sum even : " + sommeEven);
		return 0;
		}
	
	public static int evenOdd(int[] x) {
		int sommeOdd = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 1) {
				sommeOdd += x[i];
			}
		}
		System.out.println("Sun odd : " + sommeOdd);
		return 0;
	}
	
	public static int minMax(int[] x) {
		int min=x[0], max=x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				 max= x[i];
			}
			if (x[i] < min) {
				 min = x[i];
			}
			}
		System.out.println("Min = " + min + " / Max = " + max);
		return 0;
	}
	
	public static int minMaxOddEven(int[] x) {
		int minEven=x[1], maxEven=x[1];
		int minOdd=x[0], maxOdd=x[0];
		
		for(int i=0; i<x.length-1; i++) {
			if (x[i] % 2 == 0) {
				if (x[i] < minEven)
					minEven = x[i];
				if (x[i] > maxEven)
					maxEven = x[i];
			}
			if (x[i] % 2 == 1) {
				if (x[i] < minOdd)
					minOdd = x[i];
				if (x[i] > maxOdd)
					maxOdd = x[i];
			}
		}
		System.out.println("Min even = " + minEven + " Max even = " + maxEven);
		System.out.println("Min odd = " + minOdd + " Max odd = " + maxOdd);
		return 0;
	}
	
	public static int averageEvenOdd(int[] x) {
		double averageEven=0,averageOdd=0;
		
		for (int i=0; i<=x.length-1; i++) {
			if (x[i] % 2 == 0 && i >= 2) {
				averageEven = (averageEven + x[i]) / 2;
			}
			else {
				averageEven = x[i];
				}
			
			if (x[i] % 2 == 1 && i >= 0) {
				averageOdd = (averageOdd + x[i]) / 2;
			}
			else {
				averageOdd = x[i];
				}
		}
		System.out.println("Even average = "+averageEven);
		System.out.println("Odd average = "+averageOdd);
		return 0;
	}
}
	