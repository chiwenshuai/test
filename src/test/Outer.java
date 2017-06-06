package test;

public class Outer {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.print("Outer.new");
		System.out.println(inner);
		inner = outer.getInner();
		inner.print("Outer.get");
		System.out.println(inner);
	}

	public Inner getInner() { 
        return new Inner(); 
    }
	
	public class Inner { 
        public void print(String str) { 
            System.out.println(str); 
        } 
    } 
}
