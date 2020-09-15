
public class AtoiSolution {
//	public static int solution(String str) {
//		char plusOrMinus = '+';
//		int start, end;
//		if (str.isEmpty() || str.isBlank())
//			return 0;
//		start = findStartPoint(str);
//		if(str.charAt(start) == '-' || str.charAt(start) == '+') {
//			if(str.charAt(start) == '-')
//				plusOrMinus = '-';
//			start++;
//		}
//		
//		end = findEndPoint(str, start);
//		
//		if (start == end)
//			return 0;
//
//		if (start > end)
//			end= str.length();
//
//		try {
//			return Integer.parseInt(plusOrMinus + str.substring(start, end));
//		} catch (NumberFormatException e) {
//			return str.charAt(start) == '+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//		}
//	}
//	public static int atoiSolution(String str) {
//		boolean isPositive = true;
//		int startPoint, endPoint;
//
//		if (str.isEmpty() || str.isBlank())
//			return 0;
//		
//		startPoint = findStartPoint(str);
//
//		endPoint = findEndPoint(str, isPositive ? startPoint : startPoint + 1);
//		
//		
//		if (startPoint == (isPositive ? endPoint : endPoint - 1))
//			return 0;
//
//		if (startPoint > endPoint)
//			endPoint = str.length();
//
//		try {
//			return Integer.parseInt(str.substring(startPoint, endPoint));
//		} catch (NumberFormatException e) {
//			return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//		}
//	}
//
//	private static int findStartPoint(String str) {
//		int start = 0;
//		while (str.charAt(start) == ' ')
//			start++;
//		return start;
//	}
//
//	private static int findEndPoint(String str, int startPoint) {
//		String numbers = "0123456789";
//		for (int i = startPoint; i < str.length(); i++) {
//			if (i == startPoint && !numbers.contains(str.charAt(i) + "")) {
//				return startPoint;
//			}
//			if (!numbers.contains(str.charAt(i) + ""))
//				return i;
//		}
//
//		return str.length();
//	}
	public static int myAtoi(String str) {
		char plusOrMinus = '+';
		int start, end;
		if (str.isEmpty() || str.isBlank())
			return 0;
		start = findStartPoint(str);
		if(str.charAt(start) == '-' || str.charAt(start) == '+') {
			if(str.charAt(start) == '-')
				plusOrMinus = '-';
			start++;
		}
		
		end = findEndPoint(str, start);
		
		if (start == end)
			return 0;

		if (start > end)
			end= str.length();

		try {
			return Integer.parseInt(plusOrMinus + str.substring(start, end));
		} catch (NumberFormatException e) {
			if(start > 0)
				start--;
			return str.charAt(start) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}
	}
    
	private static int findStartPoint(String str) {
		int start = 0;
		while (str.charAt(start) == ' ')
			start++;
		return start;
	}

	private static int findEndPoint(String str, int startPoint) {
		String numbers = "0123456789";
		for (int i = startPoint; i < str.length(); i++) {
			if (i == startPoint && !numbers.contains(str.charAt(i) + "")) {
				return startPoint;
			}
			if (!numbers.contains(str.charAt(i) + ""))
				return i;
		}

		return str.length();
	}
	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
}
