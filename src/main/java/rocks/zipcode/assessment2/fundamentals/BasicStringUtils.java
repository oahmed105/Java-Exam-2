package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String updatedString = string1.concat(string2);
        return updatedString;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
       return new StringBuilder(string1).reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder rev1 = new StringBuilder(string1).reverse();
        StringBuilder rev2 = new StringBuilder(string2).reverse();
        return rev1.append(rev2).toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//        StringBuilder removedChars = new StringBuilder(string).deleteCharAt(string.indexOf(charactersToRemove));
        String removedChars = string.replace(charactersToRemove, "");
        return removedChars;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedChars = string.replace(charactersToRemove, "");
        StringBuilder rev = new StringBuilder(removedChars).reverse();
        return rev.toString();
    }
}
