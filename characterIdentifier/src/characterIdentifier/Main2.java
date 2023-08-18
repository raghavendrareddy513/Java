package characterIdentifier;

import java.util.Scanner;

public class Main2 {
	public static void identifyCharacter(char ch) { 
		if (Character.isDigit(ch)) 
		{ 
			System.out.println("Digit"); 
		} 
		else if (!Character.isLetter(ch)) 
		{ 
			System.out.println("Special character"); 
		} 
		else 
		{ 
			switch (Character.toLowerCase(ch)) 
			{ 
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
				if (Character.isLowerCase(ch)) 
				{ 
					System.out.println("Lower-case vowel"); 
				} 
				else 
				{ 
					System.out.println("Upper-case vowel"); 
				} 
				break; 
				default: 
					if (Character.isLowerCase(ch)) 
					{ 
						System.out.println("Lower-case consonant"); 
					} 
					else 
					{ 
						System.out.println("Upper-case consonant"); 
					} break; 
					} 
			} 
		} 
	public static void main(String[] args) 
		{ 
		Scanner scan = new Scanner(System.in);
		char ch  = scan.next().charAt(0);
		identifyCharacter(ch); 
		scan.close();
		} 
}
