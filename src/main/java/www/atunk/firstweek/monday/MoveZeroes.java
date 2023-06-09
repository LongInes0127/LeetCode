package www.atunk.firstweek.monday;

/**
 * @description:LeetCode国际站第283题：https://leetcode.com/problems/move-zeroes/
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2023/6/9 16:35
 */
public class MoveZeroes {
	class Solution {
		public void moveZeroes(int[] nums) {
			int i = 0;
			int j = 0;
			int temp;

			for (; i < nums.length; i++) {
				if (nums[i] != 0) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;

					j++;
				}
			}
		}
	}
}
