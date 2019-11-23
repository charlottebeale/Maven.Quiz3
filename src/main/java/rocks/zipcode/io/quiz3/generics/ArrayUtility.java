package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType t : this.array){
            if(getNumberOfOccurrences(t) % 2 == 1){
                return t;
                }
            }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType t : this.array){
            if(getNumberOfOccurrences(t) % 2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int result = 0;
        for (SomeType t : this.array){
            if (t.equals(valueToEvaluate)){
                result++;
            }
        }
        return result;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        ArrayList<SomeType> listner = new ArrayList<>();
        for (SomeType t : this.array) {
            if(predicate.apply(t)){
                listner.add(t);
            }
        }
        return listner.toArray(Arrays.copyOf(this.array, 0));
    }
}
