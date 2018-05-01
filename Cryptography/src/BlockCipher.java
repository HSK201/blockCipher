import java.util.Scanner;

public class BlockCipher {
	
	//Main function
	public static void main(String[] args) {
		
		//input reader
		Scanner reader = new Scanner(System.in);
		
		//Enter actual string
		System.out.println("Please enter your text want crypt it: ");
		String Text = reader.next();
		
		String encryptionText ="";
		
		//Send the text to encryption function
		encryptionText = blockCipher(Text);
		
		//Print encryption text
		System.out.println("The text encryption is : " + encryptionText);
	}
	
	static //Block Cipher Function
	String blockCipher ( String message) {
		
		//Char array
		char msg [] = message.toCharArray();
		
		//A shift key
		int key = 1;
		
		//ASCII value
		int val = 0;
		char a;
		
		//Test array
		char[] test = null;	
		
		for(int i = 0 ; i < message.length() ; i++) {
			//Convert from char to number
			val = Character.getNumericValue(msg[i]);
			val+= key;
			
			//Convert from number to char
			a = (char) val;
			
			test[i] = a;
		}
		
		message = String.copyValueOf(test);
		return message;
	}

}
