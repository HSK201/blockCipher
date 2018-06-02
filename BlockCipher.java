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
		
		if(shiftNum == 1) {
			for(int i = 0; i<Text.length() ; i ++) {
				if(msg[i] == 'A')
					encryptMsg += 'B';
				
				else if(msg[i] == 'B')
					encryptMsg += 'C';
				
				else if(msg[i] == 'C')
					encryptMsg += 'D';
				
				else if(msg[i] == 'D')
					encryptMsg += 'E';
				
				else if(msg[i] == 'E')
					encryptMsg += 'F';
				
				else if(msg[i] == 'F')
					encryptMsg += 'G';
				
				else if(msg[i] == 'G')
					encryptMsg += 'H';
				
				else if(msg[i] == 'H')
					encryptMsg += 'I';
				
				else if(msg[i] == 'I')
					encryptMsg += 'J';
				
				else if(msg[i] == 'J')
					encryptMsg += 'K';
				
				else if(msg[i] == 'K')
					encryptMsg += 'L';
				
				else if(msg[i] == 'L')
					encryptMsg += 'M';
				
				else if(msg[i] == 'M')
					encryptMsg += 'N';
				
				else if(msg[i] == 'N')
					encryptMsg += 'O';
				
				else if(msg[i] == 'O')
					encryptMsg += 'P';
				
				else if(msg[i] == 'P')
					encryptMsg += 'Q';
				
				else if(msg[i] == 'Q')
					encryptMsg += 'R';
				
				else if(msg[i] == 'R')
					encryptMsg += 'S';
				
				else if(msg[i] == 'S')
					encryptMsg += 'T';
				
				else if(msg[i] == 'T')
					encryptMsg += 'U';
				
				else if(msg[i] == 'U')
					encryptMsg += 'V';
				
				else if(msg[i] == 'V')
					encryptMsg += 'W';
				
				else if(msg[i] == 'W')
					encryptMsg += 'X';
				
				else if(msg[i] == 'X')
					encryptMsg += 'Y';
				
				else if(msg[i] == 'Y')
					encryptMsg += 'Z';
			}
		}
		
		/*
		else if(shiftNum == 2) {}
		else if(shiftNum == 3) {}
		*/
		
		else System.out.println("The number entered unavailable");
		
		/* alphabetical array
		char[] normAlpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] oneShiftAlpha = {'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
		char[] twoShiftAlpha = {'Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
		*/
		
		//Print encryption text
		System.out.println("The text encryption is : " + encryptMsg);
	}
	

}
