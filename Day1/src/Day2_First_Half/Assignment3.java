package Day2_First_Half;

import java.util.Scanner;

class MathOperations {
 public void printTable(int number) {
     for (int i = 1; i <= 10; i++) {
         System.out.println(number + " x " + i + " = " + (number * i));
     }
 }

 public long calculateFactorial(int number) {
     long fact = 1;
     for (int i = 1; i <= number; i++) {
         fact *= i;
     }
     return fact;
 }

 public boolean checkPrime(int number) {
     if (number < 2)
         return false;
     int i = 2;
     while (i <= number / 2) {
         if (number % i == 0)
             return false;
         i++;
     }
     return true;
 }

 public void printFibonacci(int terms) {
     int a = 0, b = 1, c;
     System.out.print("Fibonacci Series: ");
     for (int i = 1; i <= terms; i++) {
         System.out.print(a + " ");
         c = a + b;
         a = b;
         b = c;
     }
     System.out.println();
 }
}


public class Assignment3  {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     MathOperations mo = new MathOperations();
     char goingback;

     do {
         System.out.println("********** MENU **********");
         System.out.println("1. Print Table of a Number");
         System.out.println("2. Calculate Factorial");
         System.out.println("3. Check Prime Number");
         System.out.println("4. Print Fibonacci Series");
         System.out.println("5. Exit");
         System.out.println("**************************");
         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter the number: ");
                 mo.printTable(sc.nextInt());
                 break;
             case 2:
                 System.out.print("Enter the number: ");
                 int n2 = sc.nextInt();
                 System.out.println("Factorial of " + n2 + " is " + mo.calculateFactorial(n2));
                 break;
             case 3:
                 System.out.print("Enter the number: ");
                 int n3 = sc.nextInt();
                 if (mo.checkPrime(n3))
                     System.out.println(n3 + " is a prime number.");
                 else
                     System.out.println(n3 + " is not a prime number.");
                 break;
             case 4:
                 System.out.print("Enter number of terms: ");
                 mo.printFibonacci(sc.nextInt());
                 break;
             case 5:
                 System.out.println("Exiting...");
                 sc.close();
                 return;
             default:
                 System.out.println("Invalid choice");
         }
         System.out.print("\n\n Go Back? (Y/N): ");
         goingback = sc.next().charAt(0);
         
         System.out.println("\n Going back to the Menu \n");

     } while (goingback == 'Y' || goingback == 'y');

     System.out.println("Thank you!");
     sc.close();
 }
}
