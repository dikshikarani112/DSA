package Practice;


import java.util.HashMap;

public class FirstNonRepeating {

    private static char findFirstNonRepeatingChr(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if(map.get(c) == 1) {
                return c;
            }
        }

        return '-';
    }

    private static char findFirstNonRepeatingChr2(String str) {
       for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           if(str.indexOf(c) == str.lastIndexOf(c)) {
                return c;
           }
       }

       return '-';
    }

    public static void main(String[] args) {
        String str = "SWISS";
        System.out.println(findFirstNonRepeatingChr(str));
        System.out.println(findFirstNonRepeatingChr2(str));
    }


}
