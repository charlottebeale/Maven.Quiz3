package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(i != indexToCapitalize) {
                answer += str.charAt(i) + "";
                }
            else {
                answer += (str.charAt(i) + "").toUpperCase();
            }
        }

        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }


    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
