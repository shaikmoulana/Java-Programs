package Revision;

public class arrayperf {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		int c=0;
		for(int j=2;j<arr[i];j++) {
			if(arr[i]%j==0) {
				c++;
			}
		}
		if(c==0) {
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);
}
}
