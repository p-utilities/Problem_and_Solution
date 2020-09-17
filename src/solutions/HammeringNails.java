package solutions;

public class HammeringNails {
	public static int hammeringNails(int[] array, int k) {
		int maxSubLen = 0;
		int currentSubLen = 1;
		int currentNail = array[1];
		for(int i = 1; i < array.length - k; i++) {
			if(currentNail == array[i])
				currentSubLen++;
			else {
				if(currentSubLen > maxSubLen)
					maxSubLen = currentSubLen;
				currentSubLen = 1;
				currentNail = array[i];
			}
		}
		return maxSubLen + k;
	}
	
	public static void main(String[] args) {
		System.out.println(hammeringNails(new int[] {1,1,1,2,3,4,4,5}, 2));
	}
}
