package Rajae.week5;

import java.util.Arrays;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
 /*Write a return method that can find the frequency of characters
 Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
        String str= "AAABBCDD";
        System.out.println("frequency Of Characters: " + frequencyOfChars(str));

        String str1= "Rajaa Hamida";
        System.out.println("frequency Of Characters: "+frequencyOfChars(str1));
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
