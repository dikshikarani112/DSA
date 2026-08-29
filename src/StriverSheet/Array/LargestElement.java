package StriverSheet.Array;

import java.util.Scanner;

public class LargestElement {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int t=0;t<n;t++){
            int m = sc.nextInt();
            nums[t] = m;
        }
        System.out.println(largestElement(nums));
    }

    private static int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
