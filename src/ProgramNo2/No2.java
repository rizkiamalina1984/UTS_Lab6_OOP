package ProgramNo2;

import java.util.Scanner;

public class No2 {

    public static boolean isPalindrome(String s) {
        // Menghilangkan spasi dan mengubah ke huruf kecil untuk konsistensi
        String cleanedString = s.replaceAll("\\s", "").toLowerCase();
        // Membandingkan string yang telah dibersihkan dengan kebalikannya
        int n = cleanedString.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) { // Loop untuk meminta input dua kali
            System.out.print("Masukkan string: ");
            String inputString = scanner.nextLine();

            if (isPalindrome(inputString)) {
                System.out.println("True - String tersebut adalah palindrome.");
            } else {
                System.out.println("False - String tersebut bukan palindrome.");
            }
        }

        scanner.close();
    }
}