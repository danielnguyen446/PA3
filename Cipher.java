/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none
 * 
 * This file contains code that performs classical ciphers to encrypt and decrypt text.
 * It will implement various static methods as well as method name overloading.
 */
 

/**
 * This class contains the methods for parts 1, 2, and 3. The first part is to check validity of the input.
 * The second part encodes and decodes a single character by performing a caesar shift.
 * 
 */
public class Cipher
{
    /*Part 1:These methods check validity of the input*/
    
    public static boolean isLowerCase(char letter)  /*this method will return true if the input is a lowercase letter.*/
    {
        if(letter>=97 && letter<=122)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean isLowerCase(String str)   /*this method will be similar, but will check a string instead of single char.*/
    {
        int a = 0;
        while(a<str.length())    /*loop through and make sure each character is valid, starting at index 0*/
        {
            if(isLowerCase(str.charAt(a))==true)
            {
                a++;    /*if the character at index a is valid, go to the next index*/
            }
            else
            {
                return false;   /*otherwise, return false*/
            }
        }
        return true;    /*return true if it can get to the end of the string*/
    }
    
    /*Part 2: These methods below encode and decode a single character by performing a caesar shift.*/
    
    public static char caesarShiftEncode(char plaintext, char key)
    {
        if(isLowercase(plaintext))  /*if the character is valid, it should be encoded. Otherwise, it is simply returned*/
        {
            plaintext = plaintext + key;    /*use formulation 2: treat letters as integers.*/
            if(plaintext > 'z') /*if the letter got past z, it gets the ascii value of'a' subtracted from it so that it cycles back*/
		        {
			        plaintext = plaintext - 'z' + 'a' - 1;
		        }
        }
		return plaintext;
    }
    
    public static char caesarShiftDecode(char ciphertext, char key)
    {
        if(isLowercase(ciphertext))  /*if the character is valid, it should be decoded. Otherwise, it is simply returned*/
        {
            /*algorithm to encrypt, but in reverse*/
            ciphertext = ciphertext - key;  /*decrypting is equivalent to subtraction.*/
            if(ciphertext < 'a')
		        {
			        ciphertext = (ciphertext - 'a') + 'z' + 1;
		        }
        }
		    return plaintext;
    }
    
    /*Part 3: 
    
    public static StringvigenereEncode(String plaintext, String key)
    {
        int a=0;
        for(a;a<plaintext.length();a++)
        {
            
        }
    }
    public static StringvigenereDecode(String ciphertext, String key)
    {
        
    }*/
}
