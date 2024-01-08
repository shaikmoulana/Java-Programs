import java.util.*;
public class Big2_Small2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int l=s.nextInt();
		int num[]=new int[l];
		for(int i=0;i<l;i++) {
			num[i]=s.nextInt();
		}
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		for(int i=0;i<l-1;i++) {
			if(num[i]!=num[i+1]) {
				System.out.println("Second largest :"+num[i+1]);
				break;
			}
		}
		
		System.out.println("the max value "+num[0]);
		System.out.println("the min value "+num[l-1]);
		System.out.println("the second max "+num[1]);
		System.out.println("the second min "+num[l-2]);
		System.out.println("the third max "+num[2]);
		System.out.println("the third min "+num[l-3]);
	}
}
