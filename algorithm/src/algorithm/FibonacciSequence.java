package algorithm;

public class FibonacciSequence {
    public static int f(int n) {
    	if(n==1||n==2) {
    		return 1;
    	}
    	int a = 1;
    	int b = 1;
    	for(int i=3;i<=n;i++) {
    		b = a + b;//a为前第两项，b为前第一项
    		a = b - a;//下次循环时前两项将改变，应该记录下来
    	}
    	return b;
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(f(i));
		}
	}
}
