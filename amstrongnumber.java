package week1.day4;

public class amstrongnumber {
	public static void main(String[] args) {
		int x=153;
	    int sum=0;
	    int orginalValue=x;
		while(x>0){
			int rem=x%10;
			sum=sum+(rem*rem*rem);
			x=x/10;
	}
if(sum==orginalValue) {
	System.out.println("amstrong number");
}
else {
	System.out.println("not a amstrong number");
}
}
}