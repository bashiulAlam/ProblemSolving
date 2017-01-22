/**
 * Created by Sabab on 1/22/2017.
 */
public class UppercaseCharsInString {

    public int numOfUpperCaseChars(String str) {

        int count = 0;
        for(int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }

        return count;
    }
}
