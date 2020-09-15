package solutions;

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int startIndex = 0;
		int endIndex = height.length-1;
		int maxArea = 0;
		
		while (startIndex < endIndex) {
			int currentMaxArea = 0;
			if(height[startIndex] < height[endIndex]) {
				currentMaxArea = height[startIndex] * (endIndex - startIndex);
				startIndex++;
			}
			else {
				currentMaxArea = height[endIndex] * (endIndex - startIndex);
				endIndex--;
			}
			
			if(currentMaxArea > maxArea)
				maxArea = currentMaxArea;
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}
}
