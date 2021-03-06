package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        checkAnagram("CAT", "ACT");
        checkAnagram("MARY", "ARMY");
    }
    public static void checkAnagram(String word, String anagram){
        String a = "CAT";
        String b = "ACT";
        boolean i = Anagram.isAnagram(a,b);

        if (i){
            System.out.println("\""+a+"\" and \""+b+"\" is Anagram.");
        }else{System.out.println(a+" and "+b+" is not Anagram.");}

    }

    public static boolean isAnagram(String word, String anagram){
        if (word.length() != anagram.length()) {
            return false;
        }
        word = word.toUpperCase();
        anagram = anagram.toUpperCase();
        char[] str1c = word.toCharArray();
        Arrays.sort(str1c);
        char[] str2c = anagram.toCharArray();
        Arrays.sort(str2c);

        return Arrays.equals(str1c, str2c);
    }
}

