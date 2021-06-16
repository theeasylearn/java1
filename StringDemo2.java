import java.util.Scanner;
public class StringDemo2
{
    public static void p(String message)
    {
        System.out.println(message);
    }
    public static void main(String arguments[])
    {
        Scanner input = new Scanner(System.in);
        String word1,word2,word3;
        p("Enter first string in any case");
        word1 = input.nextLine(); //nextLine() accept input with space 
        p("you have given string " + word1);
        
        word2 = word1.toLowerCase(); //return word1 in lowercase but do not change word1
        p("Lowercase string " + word2);

        word2 = word1.toUpperCase(); //return word1 in Uppercase but do not change word1
        p("uppercase string " + word2);

        word2 = word1.trim(); //return word1 with no extra space on left and right side 
        p("*" + word2 + "*");

        int length = word1.length(); //return length(no of character with space) of word1 including space

        p("length of the string is " + length);

        p("enter another string in any case");
        word3 = input.nextLine();

        if(word1.equals(word3)==true) 
            p("both words are exactly same(including case)");
        else 
            p("both words are not exactly same");
        
        if(word1.equalsIgnoreCase(word3)==true) 
            p("both words are same(ignoring case)");
        else 
            p("both words are not same");

        String part = word3.substring(5); //return all character from word3 string from position 5
        p("part of the string without first 5 letter " + part);

        part = word1.substring(0,5); //return all character from 0th position upto 5th position
        p("first 5 letter " + part);
        
        int position = word3.indexOf('A');
        p("position of A in word3 " + position);

        char SingleCharacter = word3.charAt(0);
        p("Single Character at first position is " + SingleCharacter);

        p("10 as string " + String.valueOf(10));
        p("10.25 as string " + String.valueOf(10.25f));
        p("10.25 as string " + String.valueOf(10.25));
        p("true as string " + String.valueOf(true));
    }
}