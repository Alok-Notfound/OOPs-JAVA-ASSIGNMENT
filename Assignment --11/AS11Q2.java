import java.util.*;

class AS11Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int i;

        if (s1.length() != s2.length()) {
            System.out.println("Strings do not contain the same data.");
        } else {
            for (i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    break;
                }
            }

            if (i == s1.length()) {
                System.out.println("Strings contain the same data.");
            } else {
                System.out.println("Strings do not contain the same data.");
            }
        }

        sc.close();
    }
}