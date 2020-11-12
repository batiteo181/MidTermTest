package vn.techmaster.Bai1512;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]] ++;
        }
        int result = 0;
        for(int i = 0;i<arr.length;i++){
            int count = arr[i];
            result += count*(count - 1)/2;
        }
        return result;
    }
}