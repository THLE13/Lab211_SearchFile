package common;

/**
 *
 * @author CongThanh
 */
import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    public int checkInputLimit(int min, int max) {
        try {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            if (choice < min || choice > max) {
                throw new NumberFormatException();
            }
            return choice;
        } catch (NumberFormatException ex) {
            System.err.println("Re-input");
        }
        return 0;
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
//
//    public int[] createArray(int size_Array) {
//        int[] array = new int[size_Array];
//        Random rd = new Random();
//        for (int i = 0; i < size_Array; i++) {
//            array[i] = rd.nextInt(100);
//        }
//        return array;
//    }
//
//    public void display(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (i < array.length - 1) {
//                System.out.print(array[i] + ", ");
//            } else {
//                System.out.print(array[i]);
//            }
//        }
//        System.out.println("");
//    }

}
