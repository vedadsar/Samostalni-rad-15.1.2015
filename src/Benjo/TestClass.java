package Benjo;


public class TestClass {
	public static void main(String[] args) {
	BinarySearchThree b = new BinarySearchThree();
	
	b.add(5);
	b.add(3);
	b.add(3);
	b.add(4);
	b.add(7);
	b.add(67);
	b.add(44);
	b.add(12);
	b.add(7);
	b.add(6);
	
BinarySearchThree b1 = new BinarySearchThree();
	
	b1.add(67);
	b1.add(44);
	b1.add(59);
	
	
	System.out.println(b.isSubtree(b.getRoot(), b1.getRoot()));
	}
}
