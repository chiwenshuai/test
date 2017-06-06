package test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws IOException {
		Scanner in =new Scanner(Paths.get("d:\\mysql.ini"));
		String in1 = in.next();
		String in2 = in.next();
		System.out.println(in);
		System.out.println(in1);
		System.out.println(in2);
	}

}
