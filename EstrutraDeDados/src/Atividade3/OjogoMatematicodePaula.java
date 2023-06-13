package Atividade3;
import java.util.Scanner;
public class OjogoMatematicodePaula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int result;
            if (Character.isUpperCase(s.charAt(1))) {
                if (s.charAt(0) == s.charAt(2)) {
                    result = Character.getNumericValue(s.charAt(0)) * Character.getNumericValue(s.charAt(2));
                } else {
                    result = Character.getNumericValue(s.charAt(2)) - Character.getNumericValue(s.charAt(0));
                }
            } else if (Character.isLowerCase(s.charAt(1))) {

                if (s.charAt(0) == s.charAt(2)) {
                    result = Character.getNumericValue(s.charAt(0)) * Character.getNumericValue(s.charAt(2));

                } else {
                    result = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(2));
                }
            } else {
                result = 0;
            }
            System.out.println(result);
        }

        sc.close();
    }
}




