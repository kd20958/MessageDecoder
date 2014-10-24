/**
 * 
 * @author Kevin
 *
 */
public class SubstitutionCipher implements MessageDecoder{
	
	int shift;
	
	public SubstitutionCipher(int shift){
		this.shift=shift;
	}
	
	public String decode(String plainText){
		String newString="";
		for (int i=0;i<plainText.length();i++){
			newString=newString+shifter(plainText.charAt(i)); // adds chars to strings
		}
		return newString; //implements msg decoder
	}
	
	private char shifter(char letter){
		return (char)(letter-this.shift); //shifts char
	}
}