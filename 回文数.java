package Test;

public class 回文数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; int j=0;
		for(int n=1;n<100;n++) {
			int a=n/10;
			int b=n%10;
			if(a==b) {
				i++;
			}
		}
		for(int n=100;n<500;n++) {
			int a=n/100;
			int b=n%10;
			if(a==b) {
				j++;
			}
		}
		System.out.print(i+j);
	}

}
