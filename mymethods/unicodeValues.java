
package mymethods;

public class unicodeValues {
    
    public static final int smallA = (int)'a';
    public static final int bigA = (int)'A';
    public static final int smallZ = (int)'z';
    public static final int bigZ = (int)'Z';
    public static final int zero = (int)'0';
    public static final int nine = (int)'9';
    public static final char ROMAN_ONE = (char)8544;
    public static final char ROMAN_TWO = (char)8545;
    public static final char ROMAN_THREE = (char)8546;
    public static final char ROMAN_FOUR = (char)8547;
    public static final char ROMAN_FIVE = (char)8548;
    public static final char ROMAN_SIX = (char)8549;
    public static final char ROMAN_SEVEN = (char)8550;
    public static final char ROMAN_EIGHT = (char)8551;
    public static final char ROMAN_NINE = (char)8552;
    public static final char ROMAN_TEN = (char)8553;
    public static final char ROMAN_ELEVEN = (char)8554;
    public static final char ROMAN_TWELVE = (char)8555;
    public static final char ROMAN_FIFTY = (char)8556;
    public static final char ROMAN_HUNDRED = (char)8557;
    public static final char ROMAN_FIVE_HUNDRED = (char)8558;
    public static final char ROMAN_THOUSAND = (char)8559;
    public static boolean isUpper(char c){
        return (int)c >= bigA && (int)c <= bigZ;
    }
    public static boolean isLower(char c){
        return (int)c >= smallA && (int)c <= smallZ;
    }
    public static boolean isZeroNineRange(char c){
        return (int)c >= zero && (int)c <= nine;
    }
    public static boolean isWord(char c){
        return isUpper(c) || isLower(c) || isZeroNineRange(c);
    }
}
