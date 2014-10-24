/**
 * 
 * @author Kevin
 * 
 */
import java.util.Scanner;

public class MessageDecoderTest {

	public static void main(String[] args) {

		SubstitutionCipher aSub = new SubstitutionCipher(3);
		ShuffleCipher aShuffle = new ShuffleCipher (1);
		System.out.println("Please enter the message to decode: ");
		Scanner keyboard= new Scanner(System.in);
		String message = keyboard.next();
	
		System.out.println("Decoded by Shifting: " + aSub.decode(message));
		System.out.println("Decoded by Shuffling: " + aShuffle.decode(message));
	}

}