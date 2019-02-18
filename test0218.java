/*
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
示例 2:

输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释: 
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]
*/
package lianxi0218;


public class test0218 {

	public static void main(String[] args) {
		Solution S =new Solution();
		int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		S.rotate(nums, k);
	
	}
}

class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
        k %= n;//要旋转的位次
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];   //将最后一位取出   再将其他位依次旋转
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.print("旋转后的数组：");
        for(int i = 0; i < nums.length; i++)
        {
        	System.out.print(nums[i]);
        }
    }
}
