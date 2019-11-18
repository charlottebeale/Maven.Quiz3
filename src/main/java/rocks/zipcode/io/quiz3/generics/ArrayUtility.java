package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;
    private final List<SomeType> convertedToList;
    private final List<SomeType> listUnique;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
        this.convertedToList = Arrays.asList(array);
        this.listUnique = new ArrayList<>(new LinkedHashSet<>(convertedToList)); }
    }

    public SomeType findOddOccurringValue() {
        SomeType oddOccurring = null; for (SomeType st : listUnique) {
            if (Collections.frequency(convertedToList, st) % 2 != 0) {
                oddOccurring = st;
            }
        }
        return oddOccurring;
}
    }

    public SomeType findEvenOccurringValue() {
        SomeType oddOccurring = null; for (SomeType st : listUnique) {
            if (Collections.frequency(convertedToList, st) % 2 == 0) {
                oddOccurring = st;
            }
        }
        return oddOccurring;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        return Collections.frequency(convertedToList, valueToEvaluate); }
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> someTypeList = Arrays.stream(array) .filter(SomeType -> predicate.apply(SomeType)) .collect(Collectors.toList());
        return someTypeList.toArray((SomeType[]) Array.newInstance(array[0].getClass(), someTypeList.size()));
    }
}
