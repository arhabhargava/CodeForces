import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String str1 = scnr.next();
        String str2 = scnr.next();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        int len = str1.length();
        for (int i=0; i<len; i++){
            if (str1.equals(str2)){
                System.out.println("0");
                break;
            }
            if (str1.charAt(i) > str2.charAt(i)){
                System.out.println("1");
                break;
            }
            if (str1.charAt(i) < str2.charAt(i)){
                System.out.println("-1");
                break;
            }
        }
    }
}
