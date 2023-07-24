package rocks.zipcode.assessment2.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] updatedArray = Arrays.copyOf(integerArray, integerArray.length + 1);
        updatedArray[updatedArray.length - 1] = valueToBeAdded;
        return updatedArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
//        for (Integer i: integerArray) {
//            if (i % 2 == 0) {
//                integerArray[i] += 1;
////                for (Integer j: integerArray) {
////                    if (j % 2 == 1) {
////                        integerArray[j] -= 1;
////                    }
////                }
//            }
//        }
//        return integerArray;
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
//        for (Integer i: integerArray) {
//            if (i % 2 == 0) {
//                integerArray[i] = integerArray[i] + 1;
//            }
//        }
//        for (int i = 0; i < integerArray.length; i++) {
//            if (i % 2 == 0) {
//                integerArray[i] += 1;
//            }
//        }
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (Integer i: input) {
            if (i % 2 == 1) {
                input[i] = input[i] - 1;
            }
        }
        return input;
    }
}
