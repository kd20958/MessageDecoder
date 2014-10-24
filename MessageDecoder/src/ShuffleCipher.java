/**
 * 
 * @author Kevin
 *
 */
public class ShuffleCipher implements MessageDecoder {
	
	public int numberOfShuffle;
	
	public ShuffleCipher (int numberOfShuffle) {
		this.numberOfShuffle = numberOfShuffle;
	}
	
	public String reShuffle(String text) {
	        String h1 ="";
	        String h2 ="";
	        
	        for(int i=0;i<text.length();i++) { //splits the chars
	        	if(i%2==0)
	                h1 += text.charAt(i);
	            else
	                h2 += text.charAt(i);               
	        }   
	        return h1+h2; //adds the split chars
	 }
	
	 public String decode(String cipherText) {
	        String message = cipherText;
	        for(int i=0;i<numberOfShuffle;i++)
	           message = reShuffle(message);
	        return message;
	 }
}