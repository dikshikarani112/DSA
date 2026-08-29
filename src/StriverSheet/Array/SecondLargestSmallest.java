package StriverSheet.Array;

import java.util.Scanner;

public class SecondLargestSmallest {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int t=0;t<n;t++) {
            nums[t] = sc.nextInt();
        }
        System.out.println();
        secondSmallLarge(nums);
    }

    private static void secondSmallLarge(int[] nums) {

        if(nums.length == 1 || nums.length == 0) {
            System.out.println("smallest :" +-1+ " largest " + -1);
        }
        int smaller = Integer.MAX_VALUE, smaller_value = Integer.MAX_VALUE;
        int larger = Integer.MIN_VALUE, larger_value = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] < smaller) {
                smaller_value = smaller;
                smaller = nums[i];
            }else if (nums[i] < smaller_value && nums[i] != smaller) {
                smaller_value = nums[i];
            }
            if(nums[i] > larger) {
                larger_value = larger;
                larger = nums[i];
            }else if (nums[i] > smaller_value && nums[i] != larger) {
                larger_value = nums[i];
            }
        }

        System.out.println("smallest :" +smaller_value + " largest " + larger_value);
    }
}
