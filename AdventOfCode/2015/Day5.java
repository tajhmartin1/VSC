import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day5{

public static void main(String[] args) throws FileNotFoundException {
    System.out.println(hasDoubleLetter("aeiouu"));
    System.out.println(isVowel('j'));
    System.out.println(isIllegalSequence("abcd"));
}
public static boolean isNice(String string){
    return hasThreeVowels(string)&& hasDoubleLetter(string) && !containsIllegalSequence(string);
    
}

public static boolean hasThreeVowels(String line){
    
    return true;
    
    }


public static boolean isVowel(char letter){
    // if("aeiou".indexOf(letter) ==-1){
    //         return false;
    //     }
        return "aeiou".indexOf(letter) != -1;
     }
    public static boolean hasDoubleLetter(String string){
        for(int i = 0; i < string.length() - 1; i+=1){
            if(string.charAt(i)==string.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsIllegalSequence(String string){
        if(string)
        return true;
    }
    public static boolean isIllegalSequence(String string){
        // String illegalSequence = "ab"
            // return "abxycdpq".indexOf( string) ==-1;
            if (string.indexOf("ab")!=-1 || string.indexOf("xy")!=-1 || string.indexOf("cd")!=-1 
            || string.indexOf("pq")!=-1
            ){
                return true;

            }
            return false;
        }
    
    }