package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(VowelUtils.isVowel(words[i].charAt(0))){
                words[i] = words[i] + "way";
            }
            else {
                int x = 0;
                StringBuilder builder = new StringBuilder();
                while (!VowelUtils.isVowel(words[i].charAt(x)) && x < words[i].length() - 1){
                    builder.append(words[i].charAt(x));
                    x++;
                }
                if(x > words[i].length() - 1){
                    words[i] = words[i] + "ay";
                }
                else {
                    words[i] = words[i].substring(x) + builder.toString() + "ay";
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String word: words) {
            builder.append(word);
            builder.append(" ");
        }
        return builder.toString().substring(0, builder.length() - 1);
    }
 }
