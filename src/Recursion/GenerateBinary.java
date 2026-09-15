package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinary {

    private static void allBinaryString(List<String> list, int n, String current) {
        if(n == current.length()){
            list.add(current);
            return;
        }

        allBinaryString(list, n, current+"0");
        if(!isOne(current.length() , current)){
            allBinaryString(list, n, current + "1");
        }

    }

    private static boolean isOne(int i, String current) {
        if(i == 0){
            return false;
        }
        if(current.charAt(i-1) == '1'){
            return true;
        }
        return false;
    }


    static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<String>();

        allBinaryString(list, n, "");
//        for(int i = 0; i < list.size(); i++){
//            System.out.print(list.get(i) + " ");
//        }
        for(String i : list) {
            System.out.print(i + " ");
        }
    }


}
