package Ismail.Week5;

import java.util.Arrays;

public class FrequencyOfCharacter {

    /*Write a return method that can find the frequency of characters
 Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
    public static void main(String[] args) {

        String str= "AAABBCDD";
        System.out.println("frequency Of Characters: " + frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str){
        str= str.replace(" ","").toUpperCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);// Sorting the characters of chars;
        String result="";
        int freq =1;

        for(int i=1; i<chars.length; i++){
            if(chars[i] == chars[i-1]){
                freq ++;
            }else {
                result = result + chars[i-1]+ freq;
                freq =1;// Reset frequency for new character
            }
        }
        result = result + chars[chars.length-1]+freq;

        return result;

    }

}
