package codingbat.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

    }
    // 1
    /*public boolean firstLast6(int[] nums) {
        if (nums.length > 0)
            return (nums[0] == 6 || nums[nums.length - 1] == 6);
        return false;
    }*/

    // 2
   /* public boolean commonEnd(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            if ((a[0] == b[0] || a.length - 1 == b.length - 1))
            return true;
        }
        return false;
    }*/

    // 3
    /*public int[] makePi() {
        int[] makePi = new int[3];
        makePi[0] = 3;
        makePi[1] = 1;
        makePi[2] = 4;
        return makePi;
    }*/

    // 4
    public int[] rotateLeft3(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

}
