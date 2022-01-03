import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int n = scnr.nextInt();

        int x = 0;

        for (int i=0; i<n; i++){
            String bit = scnr.next();
            if (bit.equals("++X") || bit.equals("X++")){
                x+=1;
            }
            if (bit.equals("--X") || bit.equals("X--")){
                x--;
            }
        }

        System.out.println(x);
    }
}
