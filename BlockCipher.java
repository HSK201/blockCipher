import java.util.Scanner;

public class BlockCipher {
	
	//Main function
	public static void main(String[] args) {
		
		//input reader
		Scanner reader = new Scanner(System.in);
		
		//Enter actual string text
		System.out.println("Please enter your text want crypt it in capital case : ");
		String Text = reader.next();
		
		//Print entered text
		System.out.println("Your text before encryption : " + Text);
		
		//Determine the shift number
		System.out.println("Choose the shift number : ");
		int shiftNum = reader.nextInt();
		
		//Convert the entered text to array of character
		char msg [] = Text.toCharArray();
		
		String encryptMsg = "";
		
		char[] normAlpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int index = 0;
		
		if(shiftNum == 1) {
			for(int i = 0; i < msg.length; i++) {
				for(int j = 0; j < normAlpha.length; j++) {
					if( msg[i] == normAlpha[j] ) {
					index = j;
					index +=1;
					encryptMsg += normAlpha[index];
					}
				}
			}
		}
		
		
		else if(shiftNum == 2) {
			for(int i = 0; i < msg.length; i++) {
				for(int j = 0; j < normAlpha.length; j++) {
					if( msg[i] == normAlpha[j] ) {
					index = j;
					index +=2;
					encryptMsg += normAlpha[index];
					}
				}
			}
		}
		else if(shiftNum == 3) {
			for(int i = 0; i < msg.length; i++) {
				for(int j = 0; j < normAlpha.length; j++) {
					if( msg[i] == normAlpha[j] ) {
					index = j;
					index +=3;
					encryptMsg += normAlpha[index];
					}
				}
			}
		}
		
		
		else System.out.println("The number entered unavailable");
		
		/* alphabetical array
		char[] oneShiftAlpha = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
		char[] twoShiftAlpha = {'Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
		*/
		
		//Print encryption text
		System.out.println("The text encryption is : " + encryptMsg);
	}
	

}
