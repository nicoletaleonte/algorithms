package cap1;


class IsUnique {

    boolean isUniqueCharts(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    int isUniqueWithInt(String str) {
        if (str.length() > 128) return 1;

        int[] char_set = new int[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val] == 0) {
                return 1;
            }
            char_set[val] = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.isUniqueWithInt("acasa"));
    }
}
