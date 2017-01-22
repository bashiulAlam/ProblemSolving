import java.util.Scanner;

/**
 * Created by Sabab on 1/22/2017.
 */
public class Main {

    public static void main(String[] args) {

        UppercaseCharsInString uppercaseCharsInString = new UppercaseCharsInString();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count = uppercaseCharsInString.numOfUpperCaseChars(str);
        System.out.println("Num of uppercase chars : " + count);
    }
}
