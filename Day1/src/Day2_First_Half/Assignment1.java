package Day2_First_Half;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            
            int num, i, fact, terms;

            switch (choice) {
                case 1:
                    System.out.print("Enter the number: ");
                    num = sc.nextInt();
                    for (i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;
                case 2:
                    System.out.print("Enter the number: ");
                    num = sc.nextInt();
                    fact = 1;
                    for (i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial of " + num + " is " + fact);
                    break;
                case 3:
                    System.out.print("Enter the number: ");
                    num = sc.nextInt();
                    if (num < 2) {
                        System.out.println(num + " is not a prime number.");
                        break;
                    }
                    i = 2;
                    boolean isPrime = true;
                    while (i <= num / 2) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                        i++;
                    }
                    if (isPrime)
                        System.out.println(num + " is a prime number.");
                    else
                        System.out.println(num + " is not a prime number.");
                    break;
                case 4:
                    System.out.print("Enter no. of terms: ");
                    terms = sc.nextInt();
                    int a = 0, b = 1, c = 0;
                    System.out.print("Fibonacci Series: ");
                    for (i = 1; i <= terms; i++) {
                        System.out.print(a + " ");
                        c = a + b;
                        a = b;
                        b = c;
                    }
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

