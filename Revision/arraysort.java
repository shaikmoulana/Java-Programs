package Revision;
import java.util.*;
public class arraysort {
public static void main(String[] args) {
	int a[]= {40,20,30,5,10};
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
	int temp;
	for(int j=0;j<a.length;j++) {
		for(int i=j+1;i<a.length;i++) {
			if(a[j]>a[i]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
}
}
