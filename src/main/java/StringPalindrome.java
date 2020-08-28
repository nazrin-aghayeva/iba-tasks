import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        String str, str2 = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = in.nextLine();

        int len = str.length();

        for (int i = len - 1; i >= 0; i--)
            str2 = str2 + str.charAt(i);

        if (str.equals(str2))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");
    }

}
