package S_2024;


import java.util.Scanner;

public class Xau_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
                scanner.nextLine();
        while (tc-- > 0) {
            String s = scanner.nextLine();
            System.out.println();
            if (s.length() == 1 || s.charAt(0) == '0') {
                System.out.println("NO");
            } else {
                long n = 0;
                boolean found = false;

                for (int i = 0; i < s.length() / 2; ++i) {
                    n = n * 10 + (s.charAt(i) - '0');
                    String t = Long.toString(n);
                    long d = n + 1;

                    while (t.length() < s.length()) {
                        t += Long.toString(d);
                        d++;
                    }

                    if (t.length() != s.length()) {
                        continue;
                    } else if (t.equals(s)) {
                        found = true;
                        System.out.println("YES " + n);
                        break;
                    }
                }

                if (!found) {
                    System.out.println("NO");
                }
            }
        }
    }
}
