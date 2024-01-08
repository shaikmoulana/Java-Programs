import java.util.*;
public class Big1_Small1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {20,50,30,40};
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
			if(max<num[i]) {
				max=num[i];
			}
			else if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
