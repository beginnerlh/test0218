/*
 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����

ʾ�� 1:

����: [1,2,3,4,5,6,7] �� k = 3
���: [5,6,7,1,2,3,4]
����:
������ת 1 ��: [7,1,2,3,4,5,6]
������ת 2 ��: [6,7,1,2,3,4,5]
������ת 3 ��: [5,6,7,1,2,3,4]
ʾ�� 2:

����: [-1,-100,3,99] �� k = 2
���: [3,99,-1,-100]
����: 
������ת 1 ��: [99,-1,-100,3]
������ת 2 ��: [3,99,-1,-100]
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
        k %= n;//Ҫ��ת��λ��
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];   //�����һλȡ��   �ٽ�����λ������ת
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.print("��ת������飺");
        for(int i = 0; i < nums.length; i++)
        {
        	System.out.print(nums[i]);
        }
    }
}
