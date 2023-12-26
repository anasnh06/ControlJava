package exercice1;

public class Main {
	
	static boolean equal(int[] a, int[] b) {
		
		if(a.length==b.length) {
			for(int i=0; i<a.length;i++)
				if(a[i]!=b[i])
					return false;
		return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {1,3,2};
		int[] c = {1,2,3,6,8};
		int[] d = {1,2,3};
		
		System.out.println(equal(a, b));
		System.out.println(equal(a, c));
		System.out.println(equal(a, d));
	}

}
