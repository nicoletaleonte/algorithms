package cap1;

import java.util.Arrays;

public class Permutation {
    String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        return sort(firstString).equals(sort(secondString));
    }

    boolean permutation2(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] s_array = first.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < second.length(); i++) {
            int c = (int) second.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Permutation permutation =new Permutation();
        System.out.println(permutation.permutation("anna", "anna"));
        System.out.println(permutation.permutation2("anna", "anna"));

        char x='A';
        x+=1;
        System.out.println(x);
    }
}
