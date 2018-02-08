
public class FinalTouches {
	
	static int cntGCD;

	public static void main(String[] args) {
		cntGCD = 0;
		System.out.println(countGCD(6000));
	}
	
    private static int countGCD(int a) {
    	if (a == 1) {
    		return cntGCD;
    	}
    		
    	if (a%2 != 0) {
    		return cntGCD;
    	}
    	else {
    		cntGCD++;
    		return countGCD(a/2);
    	}
    }

}
