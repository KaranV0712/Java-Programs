// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

// Main class
public class GFG {

	public static void main(String[] args)
	{
		// Input string
		String str = "geeks";

		//Convert the string to lowercase
		str = str.toLowerCase();
		// passing bool function till holding true
		if (isPalindrome(str))

			// It is a palindrome
			System.out.print("Yes");
		else

			// Not a palindrome
			System.out.print("No");
	}
}
