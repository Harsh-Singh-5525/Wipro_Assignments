package Day2_First_Half;

import java.util.Scanner;

class StringUtility {

    public int countVowels(String str) {
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }
        return count;
    }

    public int countConsonants(String str) {
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1)
                count++;
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        String s = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++; right--;
        }
        return true;
    }

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}

public class Assignment2  {
    public static void main(String[] args) {
        StringUtility util = new StringUtility();
        Scanner sc = new Scanner(System.in);

        char goingback;
        do {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            char cont;
            do {
                System.out.println("\n****** String Operations Menu *****");
                System.out.println("1. Count Vowels");
                System.out.println("2. Count Consonants");
                System.out.println("3. Check Palindrome");
                System.out.println("4. Reverse String");
                System.out.println("5. Convert to Uppercase");
                System.out.println("6. Convert to Lowercase");
                System.out.println("7. Replace a Word");
                System.out.println("8. Exit");
                System.out.print("\n Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume leftover newline

                switch (choice) {
                    case 1:
                        System.out.println("Number of vowels: " + util.countVowels(str));
                        break;
                    case 2:
                        System.out.println("Number of consonants: " + util.countConsonants(str));
                        break;
                    case 3:
                        System.out.println("Palindrome? " + util.isPalindrome(str));
                        break;
                    case 4:
                        System.out.println("Reversed string: " + util.reverseString(str));
                        break;
                    case 5:
                        System.out.println("Uppercase: " + util.toUpperCase(str));
                        break;
                    case 6:
                        System.out.println("Lowercase: " + util.toLowerCase(str));
                        break;
                    case 7:
                        System.out.print("Enter the word to replace: ");
                        String oldWord = sc.nextLine();
                        System.out.print("Enter the new word: ");
                        String newWord = sc.nextLine();
                        str = util.replaceWord(str, oldWord, newWord);
                        System.out.println("Modified string: " + str);
                        break;
                    case 8:
                        System.out.println("Exiting this string's operations...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
                if (choice == 8) 
                	break;
                System.out.print("\n Continue with same string? (Y/N): ");
                cont = sc.next().charAt(0);
                sc.nextLine();
               

            } while (cont == 'Y' || cont == 'y');

            System.out.print("\n Input a new string? (Y/N): ");
            goingback = sc.next().charAt(0);
            sc.nextLine();
           
        } while (goingback == 'Y' || goingback == 'y');

        System.out.println("\n Thank you!");
        sc.close();
    }
}
