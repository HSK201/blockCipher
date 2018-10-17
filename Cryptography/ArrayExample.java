import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		String text;
		
		
		System.out.println("Enter your text want encrypt it: ");
		text = reader.nextLine();
		String Text = text.toUpperCase();
		
		System.out.println("Enter the number of letter want move: ");
		int letter = reader.nextInt();
		
		String encrypText = encoder(Text,letter);
		System.out.println("Your text after encryption: "+ encrypText);
		
		String orignalText = decoder(encrypText,letter);
		System.out.println("Your main text is: "+ orignalText);
		

	}
	
	static String encoder (String text, int key) {
		
		char msg[]= text.toCharArray();
		String encryptMSG = "";
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int index = 0;
		
		for(int i = 0 ; i < msg.length ; i++) {
			for(int j = 0 ; j < alphabet.length ; j++) {
				if( msg[i] == alphabet[j]) {
					index = j;
					index += key % 26;
					encryptMSG += alphabet[index];
				}
			}
		}
		
		return encryptMSG;
	}
	
	static String decoder (String text, int key) {
		
		String Text = "";
		char msg[]= text.toCharArray();
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int index = 0;
		
		for(int i = 0 ; i < msg.length ; i++) {
			for(int j = 0 ; j < alphabet.length ; j++) {
				if( msg[i] == alphabet[j]) {
					index = j;
					index -= key % 26;
					Text += alphabet[index];
				}
			}
		}
		
		return Text;
	}

}
