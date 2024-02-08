package com;

class ContainerWithMostWater {

	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxWater = 0;

		while (left < right) {
			int width = right - left;
			int h = Math.min(height[left], height[right]);

			int water = width * h;

			maxWater = Math.max(maxWater, water);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}

		}
		return maxWater;
	}
}