package strings;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="moulana is a software trainee";
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(i%2==0) {
				s2[i]=s2[i].toUpperCase();
				System.out.print(s2[i]);
			}
			else {
				for(int j=s2[i].length()-1;j>=0;j--) {
					System.out.print(s2[i].charAt(j));
				}
			}
			System.out.print(" ");
		}
	}

}
