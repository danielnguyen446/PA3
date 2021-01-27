/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none
 * 
 * This file contains code that performs classical ciphers to encrypt and decrypt text.
 * It will implement various static methods as well as method name overloading.
 */

import java.util.Scanner;

/**
 * This class contains the methods for parts 1, 2, and 3. The first part is to check validity of the input.
 * The second part encodes and decodes a single character by performing a caesar shift.
 * The third part performs the Vigenere cipher on an entire string and uses a string as the key.
 */
public class Cipher
{
    
    /*Part 1:These methods check validity of the input*/
    
    public static boolean isLowerCase(char letter)  /*this method will return true if the input is a lowercase letter.*/
    {
        if(letter>='a' && letter<='z')
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
        if(isLowerCase(plaintext))  /*if the character is valid, it should be encoded. Otherwise, it is simply returned.*/
        {
        	String alphabet = "abcdefghijklmnopqrstuvwxyz"; /*declare an alphabet*/
        	/*initialize integer variables to convert char to number from 0-27*/
        	int plaintextValue=plaintext - 'a';
        	int keyValue=key - 'a';
            
            	int outputValue = plaintextValue + keyValue; 
            	if(outputValue > 'z') /*if the letter got past 25(z), use the remainder. z-a gives 25*/
		{
			outputValue = outputValue%('z'-'a');
		}
		char output = alphabet.charAt(outputValue); /*return the letter that corresponds to the value*/
		return output;
        }
        else
        {
            	return plaintext;
	}
    }
    
    public static char caesarShiftDecode(char ciphertext, char key)
    {
        if(isLowerCase(ciphertext))  /*if the character is valid, it should be encoded. Otherwise, it is simply returned.*/
        {
            	String alphabet = "abcdefghijklmnopqrstuvwxyz"; /*declare an alphabet*/
            	/*initialize integer variables to convert char to number from 0-27*/
            	int ciphertextValue=ciphertext - 'a';
            	int keyValue=key - 'a';

           	int outputValue = ciphertextValue - keyValue; 
            	if(outputValue < 0) /*if the letter got past 0(a), use the remainder*/
		{
			outputValue = outputValue%('z'-'a');
		}
		char output = alphabet.charAt(outputValue); /*return the letter that corresponds to the value*/
		return output;
        }
        else
        {
            return ciphertext;
        }
    }

    
    /*Part 3: performs the Vigenere cipher on an entire string and uses a string as the key.
    
    public static String vigenereEncode(String plaintext, String key)
    {
        String ciphertext;
        int a=0;
        while(a<plaintext.length())
        {   //if the key is less letters than the message, it will keep looping throught the key.
            ciphertext.charAt(a) = caesarShiftEncode(plaintext.charAt(a), key.charAt(a%(key.length())));
            a++;
        }
    }
    
    public static String vigenereDecode(String ciphertext, String key)
    {
        
    }
 	*/
}