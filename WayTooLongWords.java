import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        //System.out.println("Enter number of words: ");
        Scanner scnr =new Scanner(System.in);

        int n = scnr.nextInt();
        ArrayList<String> words = new ArrayList<String>();

        for (int i=0; i<n; i++){
            String word = scnr.next();
            words.add(word);
        }
        for (int i=0; i<n; i++){
            int len = words.get(i).length();
            if (len > 10) {
                len -= 2;
                System.out.println(words.get(i).charAt(0) + "" + len + "" + words.get(i).charAt(len+1));
            }
            else{
                System.out.println(words.get(i));
            }
        }
    }
}