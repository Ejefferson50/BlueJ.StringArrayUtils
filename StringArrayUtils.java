
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String outcome = array[0];

        return outcome;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String outcome = array[1];
        return outcome;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String outcome =array[array.length - 1];

        return outcome;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String outcome = array[array.length - 2]; 
        return outcome;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int index = 0; index <= array.length-1; index++){
            while (array[index] == value)
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] x = new String[array.length];

        for (int i = array.length-1; i >=0 ; i--){
            x[i] = array[array.length-1-i];

        }  
        return x;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean result = true;
        int index2 = array.length - 1;
        for (int index = 0; index <= array.length-1; index++){

            if(!array[index].equals(array[index2])){

                result = false;

            }
            index2--;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String merged = "";

        for (int index = 0; index <= array.length - 1; index++){
            merged += array[index].toLowerCase();
        }

        for (int i = 'a'; i <= 'z'; i++){
            if(merged.indexOf(i) == -1){
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for (int index = 0; index <= array.length-1; index++)
            if (array[index] == value)
                occurrences = occurrences + 1;

        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList <String> arrList = new ArrayList<String>();

        for (int index = 0; index <= array.length-1; index++)
            if (array[index] != valueToRemove){
                arrList.add(array[index]);

            }String [] result = arrList.toArray(new String[0]);

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList <String> arraList = new ArrayList<String>();
        arraList.add(array[0]);
        for (int index = 0; index <= array.length-2; index++)
            if (array[index] != array[index+1]){
                arraList.add(array[index+1]);

            }
        String[] result = arraList.toArray(new String[arraList.size()]);

        return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String origin = array[0];
        String mod = array[0];

        for (int index = 1; index < array.length; index++){
            if (origin.equals(array[index]) == false){
                mod = mod + " " + array[index];
            } else{
                mod = mod  + array[index];

            }
            origin = array[index];
        }

        return mod.split(" ", 0);
    }
}
