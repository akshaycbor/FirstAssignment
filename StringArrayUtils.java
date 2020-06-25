/**
 * Created by Yang on 1/23/20.
 */

import java.util.List;
import java.util.ArrayList;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s:array) {
            if(value.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] rev = new String[array.length];
        for(int i=array.length-1; i>=0; i--) {
            rev[array.length-1-i] = array[i];
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i=0; i<array.length; i++) {
            if(array[i] != array[array.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] counter = new boolean[26];
        for(String s: array) {
            String lower = s.toLowerCase();
            for(char c: lower.toCharArray()) {
                System.out.println(c);
                if(c>='a' && c<='z') {
                    counter[c-'a'] = true;
                }
            }
        }
        boolean result = true;
        for(boolean isCharPresent:counter) {
            result = result && isCharPresent;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter=0;
        for(String a:array) {
            if(value.equals(a)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> res = new ArrayList<String>();
        for(String s:array) {
            if(!valueToRemove.equals(s)) {
                res.add(s);
            }
        }
        String[] result = new String[res.size()];
        res.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> res = new ArrayList<String>();
        for(String s:array) {
            if(res.size() == 0 || !s.equals(res.get(res.size()-1))) {
                res.add(s);
            }
        }
        String[] result = new String[res.size()];
        res.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> res = new ArrayList<String>();
        for(int i=0; i<array.length; i++) {
            if(res.size()==0 || !array[i].equals(array[i-1])) {
                res.add(array[i]);
            } else {
                res.set(res.size()-1, res.get(res.size()-1)+array[i]);
            }
        }
        String[] result = new String[res.size()];
        res.toArray(result);
        return result;
    }


}
