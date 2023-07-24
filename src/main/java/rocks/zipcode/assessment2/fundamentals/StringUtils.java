package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder newStr = new StringBuilder(stringToBeRepeated);
        for (int i = 0; i < numberOfTimeToRepeat - 1; i++) {
            newStr.append(stringToBeRepeated);
        }
        return newStr.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
//        return string != null && string.matches("^[a-zA-Z0-9]*$");
//        for (int i = 0; i < string.length(); i++) {
//            char c = string.charAt(i);
//            if (!(c >= 'A' && c <= 'Z') &&
//                !(c >= 'a' && c <= 'z') &&
//                !(c >= '0' && c <= '9')) {
//                return false;
//            }
//        }
//        return true;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetterOrDigit(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            if (Character.is(i)) {
//                return true;
//            }
//        }
//        return false;
        return string != null && string.matches("^[!@#$%&*()_+=|<>?{}\\[\\]~-]*$");
    }
}
