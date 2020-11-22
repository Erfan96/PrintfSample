import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0 ; i<3 ; i++) {
            String str = s.next();
            int number = s.nextInt();

            if (str.length()<11 && number<1000) {
                System.out.printf("%-15s%03d%n", str, number);
            }
        }

        System.out.println("================================");
    }
}
