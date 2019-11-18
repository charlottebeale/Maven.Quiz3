package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    Private VowelUtils  vowelUtils;

    public String translate(String str) {
        String[] words = str.split(" ");
        Sring translated = "";
        for(String word: words) {
            translated += translateOneWord(word) + " ";
        }
        return translated.trim();
    }


    public String translateOneWord(String str) {
    if(vowelUtils.startsWithVowel(str)) {
        return str + "way";
    } else if (!vowelUtils.startsWithVowel(str)) {
        return str + "ay";
        }
    elas {
          Integer indexOfVowel = vowelUtils.getIndexOfFirstVowel(str);
          String substr1 = str.substring(0, indexOfVowel);
          String substr2 = str.substring(indexOfVowel);
          return substr2 + substr1 + "ay";
        }
    }
 }
