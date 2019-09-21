package encrypt;

import java.util.*;

public class forney_p01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  public boolean validateSize(String data) {

			    boolean valid = false;
			    if (data.length() == 4) {
			      valid = true;
			    }
			    return valid;
			  }

			  /*
			   * Method Name: isIntegr(String input)
			   * Description: This method pass a String parameter and it validate the input to
			   * see is it a valid Integer Number.
			   */
			  public boolean isInteger(String input) {

			    boolean valid = true;
			    int number = 0;
			    input = input.trim(); // no space in front and end

			    if (input.isEmpty() == false) {
			      try {
			        number = Integer.valueOf(input).intValue();
			      }
			      catch (NumberFormatException e) {
			        valid = false;
			      }
			    }
			    return valid;
			  }

			  /*
			   * Method Name: encrypt(String data)
			   * Description: This method pass a String of four digits as a parameter & encrypt it
			   * by Replacing each digit with the result of adding 7 to the digit and getting the
			   * remainder after dividing the new value by 10. Then swap the first digit with the third,
			   * and swap the second digit with the fourth and then return the encryptedCode as a String.
			   */
			  public String encrypt(String data) {
			    String encryptedCode = new String();

			    encryptedCode += ( (Character.getNumericValue(data.charAt(2)) + 7) % 10);
			    encryptedCode += ( (Character.getNumericValue(data.charAt(3)) + 7) % 10);
			    encryptedCode += ( (Character.getNumericValue(data.charAt(0)) + 7) % 10);
			    encryptedCode += ( (Character.getNumericValue(data.charAt(1)) + 7) % 10);

			    return encryptedCode;
			  }

			  /*
			   * Method Name: decript(String data)
			   * Description: This method inputs an encrypted four-digit integer and decrypts it
			   * (by reversing the encryption scheme) to form the original number.
			   */
			  public String decrypt(String data) {
			    String decryptedCode = new String();

			    decryptedCode +=
			        ( ( ( (Character.getNumericValue(data.charAt(2))) + 10) - 7) % 10);
			    decryptedCode +=
			        ( ( ( (Character.getNumericValue(data.charAt(3))) + 10) - 7) % 10);
			    decryptedCode +=
			        ( ( ( (Character.getNumericValue(data.charAt(0))) + 10) - 7) % 10);
			    decryptedCode +=
			        ( ( ( (Character.getNumericValue(data.charAt(1))) + 10) - 7) % 10);

			    return decryptedCode;
			  }

			}
	}

}
