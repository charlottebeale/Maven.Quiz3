package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        boolean hasVowels = false;
        word = word.toLowerCase(); for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                hasVowels = true;
            }
        }
        return hasVowels;
    }

    public static Integer getIndexOfFirstVowel(String word) {
    word = word.toLowerCase(); Integer index = -1;
    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
            index = i; break;
        }
    }
    return index;

    }

    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        return (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u');
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
