/*
* This class will consist of methods that well take a string and return a string in different ways needed for encryption in this program.
*/

package io.limasecurityworks.tools;

public class ReChars {

    public static String output = "";

    public static String reSpaces(String input) {

        for (int i = 0; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)) != " ") {
                output += Character.toString(input.charAt(i));
            }
        }

        return output;
    }

    public String reAllNonLetters(String input) {

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(i)) {
                output += Character.toString(input.charAt(i));
            }
        }

        return output;
    }
}