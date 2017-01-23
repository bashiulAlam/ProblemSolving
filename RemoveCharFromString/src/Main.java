import java.util.Scanner;

/**
 * Created by Sabab on 1/23/2017.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RemoveCharUtil removeCharUtil = new RemoveCharUtil();
        String str = scanner.nextLine();
        char c = scanner.next().charAt(0);

        int index = removeCharUtil.getCharIndex(str, c);
        String firstStr = removeCharUtil.getSubString(str, 0, index);
        String secondStr = removeCharUtil.getSubString(str, index + 1, str.length() - 1);

        String concatStr = removeCharUtil.getConcatString(firstStr, secondStr);
        System.out.println("Final string : " + concatStr);
    }
}
