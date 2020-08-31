import java.util.*;

public class Factor {

    public static void main(String[] args) {

        int number;
        Scanner s = new Scanner(System.in);

        number = s.nextInt();
        int coount = 0;

        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
                coount++;
            }
        }

        System.out.println("Total factors" + coount);
    }
}