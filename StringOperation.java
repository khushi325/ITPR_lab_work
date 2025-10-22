import java.util.Scanner; //importing Scanner class for user input
/*---------- Class for Character based operation -------------*/
class StringCharacterOperation
{
	/*--- Method to count number of uppercase characters ---*/
	public static int countUpperCase(String sentence)
	{
		int upper = 0 ; // to count of uppercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length();index++)
		{
			character = sentence.charAt(index);//extracted the character at given index
			if(character >='A' && character <= 'Z') //verifying uppercase character
			{
				upper++; //incrementing count of uppercase character
			}
		}
		//return count of uppercase character
		return upper;
	}
	
	/*--- Method to count number of lowercase characters ---*/
	public static int countLowerCase(String sentence)
	{
		int lower = 0 ; // to count of lowercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length();index++)
		{
			character = sentence.charAt(index);//extracted the character at given index
			if(character >='a' && character <= 'z') //verifying lowercase character
			{
				lower++; //incrementing count of lowercase character
			}
		}
		//return count of lowercase character
		return lower;
	}
	
	/*--- Method for counting number of alphabets in the given string ----*/
	public static int countAlphabet(String sentence)
	{
		//number of aphabets is equal to the number of uppercase character and lowercase character
		int alphabets = countUpperCase(sentence) + countLowerCase(sentence);
		//return this count
		return alphabets;
	}
	/*--- Method for counting number of special characters in the given string ----*/
	public static int countSpecialChars(String sentence)
	{
		//special characters are the characters other than alphabets in the sentence
		int specialchar = sentence.length() - countAlphabet(sentence);
		//return this count
		return specialchar;
	}
}
/*-------- Initial class ----------------------*/
public class StringOperation {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence : ");
		String sentence = sc.nextLine();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of characters : "+sentence.length());
		//number of uppercase characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of uppercase characters: "+StringCharacterOperation.countUpperCase(sentence));
		//number of lowercase characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of lowercase characters: "+StringCharacterOperation.countLowerCase(sentence));
		//number of alphabets
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Alphabets: "+StringCharacterOperation.countAlphabet(sentence));
		//number of special characters
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Special characters: "+StringCharacterOperation.countSpecialChars(sentence));
		

	}
    /*---- Method for counting number of consonants ----*/
public static int countConsonants(String data)
{
	int consonants = 0;
	char character;
	for(int index = 0; index < data.length(); index++)
	{
		character = data.charAt(index); // fetching character at given index from string
		if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
		{
			if(!(character=='a' || character=='A' || character=='e' || character=='E' ||
				 character=='i' || character=='I' || character=='o' || character=='O' ||
				 character=='u' || character=='U'))
			{
				consonants++; // incrementing count of consonants
			}
		}
	}
	return consonants;
}
	/*---- Method for counting number of vowels ----*/
	public static int countVowels(String data)
	{
		int vowels = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		{
			character = data.charAt(index); //fetching character at given index from string
			if(character=='a' || character == 'A' || character == 'e' || character == 'E' || character =='i' ||
			character=='I' || character=='o' || character == 'O' || character=='u' || character == 'U')
			{
				vowels++; //incrementing count of vowels
			}
		}
		return vowels;
	}

}
