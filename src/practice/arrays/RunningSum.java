package practice.arrays;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }

    public static int totalCount(int[] arr, int n, int k) {
        int sum = 0;
        int residual = 1;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i] / k;
            if(arr[i] % k != 0) sum += residual;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] intArray = new int[]{5, 8, 10, 13};


        int res2 = totalCount(intArray, 4, 3);
        int[] result = runningSum(intArray);

        System.out.println(Arrays.toString(result));
        System.out.println(res2);

    }
}
