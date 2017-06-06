package test;

public class tests {

	public static void main(String[] args) {
		String s="BTA*2301178829";
		String[] s1=s.split("BTA\\*");
		System.out.println(s1[1]);
		String s2="LC23011180";
		String[] s3 = s2.split("LC");
		System.out.println(s3[1]);
	}

}
