import java.util.Scanner;

public class BlockCipher {
	
	//Main function
	public static void main(String[] args) {
		
		//input reader
		Scanner reader = new Scanner(System.in);
		
		//Enter actual string text
		System.out.println("Please enter the text you want to crypt  : ");
		String Text = reader.nextLine();
      String text = Text.toUpperCase();
		
		//Print entered text
		System.out.println("Your text before encryption : " + text);
		
		//Determine the shift number
		System.out.println("Choose the shift number (up to 6) : ");
		int shiftNum = reader.nextInt();
		
		//Convert the entered text to array of character
		char msg [] = text.toCharArray();
		
		String encryptMsg = "";
		
		char[] normAlpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int index = 0;
     
     for(int i = 0; i < msg.length; i++) {
				for(int j = 0; j < normAlpha.length; j++) {
					if( msg[i] == normAlpha[j] ) {
					index = j ;
					index +=shiftNum % 26;
					encryptMsg += normAlpha[index];
					}
				}
			}
         System.out.println("The encrypted text is : " + encryptMsg);
		
	}
	

}