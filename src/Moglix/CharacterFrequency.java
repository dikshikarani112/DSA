package Moglix;

public class CharacterFrequency {

    private static void frequencyCount(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;
        for(int i = 1; i<str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)) {
                count++;
            }else{
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count);
        System.out.println("Output String will be :");
        for(int i = 0; i<sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "deepaka";
        frequencyCount(str);

    }


}
