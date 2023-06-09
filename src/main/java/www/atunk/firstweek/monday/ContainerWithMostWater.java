package www.atunk.firstweek.monday;

/**
 * @description: LeetCode国际站第11题：https://leetcode.com/problems/container-with-most-water/description/
 * @author: 张军
 * @email: 23166321@qq.com
 * @date: 2023/6/9 16:28
 */
public class ContainerWithMostWater {
	class Solution {
		public int maxArea(int[] height) {
			int max = 0;
			int arae;
			int i = 0;
			int j = height.length - 1;

			while (i != j) {

				arae = (j - i) * Math.min(height[i], height[j]);
				max = arae > max ? arae : max;

				if (height[i] < height[j]) {
					i++;
				} else {
					j--;
				}
			}

			return max;

		}
	}
}
