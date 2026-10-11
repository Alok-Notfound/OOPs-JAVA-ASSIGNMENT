import java.util.*;

class AS11Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int max1 = 0, max2 = 0;
        char ch1 = ' ', ch2 = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > max1) {
                if (ch != ch1) {
                    max2 = max1;
                    ch2 = ch1;
                }
                max1 = count;
                ch1 = ch;
            } else if (count > max2 && ch != ch1) {
                max2 = count;
                ch2 = ch;
            }
        }

        if (max2 == 0)
            System.out.println("Second most frequent character not found.");
        else
            System.out.println("Second most frequent character: " + ch2);

        sc.close();
    }
}