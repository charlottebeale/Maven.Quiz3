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
        for (int i = 0; i < str.length(); i++) {
            if (i != indexToCapitalize) {
                answer += str.charAt(i) + "";
            } else {
                answer += (str.charAt(i) + "").toUpperCase();
            }
        }
        return answer;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < string.length() + 1; i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if (!result.contains(string.substring(i, j))) {
                    result.add(string.substring(i, j));
                }
            }
        }
        return result.toArray(new String[0]);
    }


    public static Integer getNumberOfSubStrings(String input) {
       int counter = 0;
        ArrayList<String > result = new ArrayList<>();
        for (int i = 0; i < input.length() + 1; i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                if (!result.contains(input.substring(i, j))) {
                    result.add(input.substring(i, j));
                    counter++;
                }
            }
        }
        return counter;
    }
}


