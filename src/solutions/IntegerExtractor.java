package solutions;
import java.util.ArrayList;
import java.util.List;

public class IntegerExtractor {
	public static List<Integer> extract(String str) {
		var integers = new ArrayList<Integer>();
		String numbers = "0123456789";
        String minus = "-";
        int startPoint = -1;
        for(int i = 0; i < str.length(); i++){
        	if(startPoint == -1) {
        		if(minus.contains(str.charAt(i) + ""))
                    startPoint = i;
                else if(numbers.contains(str.charAt(i) + "")) {
                        startPoint = i;
                }
        	} else {
        		if(i == str.length() - 1) {
        			integers.add(Integer.parseInt(str.subSequence(startPoint, i+1) + ""));
        		}
        		if(!numbers.contains(str.charAt(i) + "")) {
        			try {
                    	integers.add(Integer.parseInt(str.subSequence(startPoint, i) + ""));
                    } catch(NumberFormatException e) {
                    	System.out.println(str.substring(startPoint, i));
                    	continue;
                    }
        			startPoint = -1;
        		}
        	}
        }
        return integers;
	}
	
	public static void main(String[] args) {
		var integers = extract("2222a2a222a2a22a22");
		integers.forEach(x->System.out.println(x));
	}
}
