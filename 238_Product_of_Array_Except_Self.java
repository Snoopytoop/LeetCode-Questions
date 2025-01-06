class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        int[] result = new int[length];

        // getting prefix values
        prefix[0] = 1;

        for (int i = 1; i < length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // getting suffix values
        suffix[length - 1] = 1;
        result[length - 1] = prefix[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
            result[i] = suffix[i] * prefix[i];
        }

        return result;
    }
}
