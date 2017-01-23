/**
 * Created by Sabab on 1/23/2017.
 */
public class RemoveCharUtil {

    public int getCharIndex(String str, char c) {

        int index = str.charAt(c);

        return index;
    }

    public String getSubString(String str, int startIndex, int endIndex) {

        String subStr = str.substring(startIndex, endIndex);

        return  subStr;
    }

    public String getConcatString(String firstStr, String secondStr) {

        String str = firstStr.concat(secondStr);

        return str;
    }
}
