package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<String>();
        genSubsequence(str, 0, list, new StringBuilder());

        for(String i : list){
            System.out.print(i + " ");
        }
    }

    private static void genSubsequence(String str, int i, List<String> list, StringBuilder stringBuilder) {
        if(i == str.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        stringBuilder.append(str.charAt(i));
        genSubsequence(str, i + 1, list, stringBuilder);


        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        genSubsequence(str, i+1, list, stringBuilder);
    }

}
