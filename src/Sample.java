import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i=0 ; i<3 ; i++) {
            String str = s.next();
            int number = s.nextInt();

            System.out.printf("%-15s%3d%n", str, number);
        }
    }
}
