import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int m = scnr.nextInt();

        int prod = n*m;
        System.out.println(prod/2);

    }
}
