package test;

import java.util.logging.Logger;

public class CodePoint {
	public static void main(String[] args) {
		String greeting = "Hello";
		int cpCount = greeting.codePointCount(0, greeting.length());
		Logger.getGlobal();
		System.out.println(cpCount);
	}
}
