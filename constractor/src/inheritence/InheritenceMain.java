package inheritence;

public class InheritenceMain {

	public static void main(String[] args) {

		InheritenceParent inheritenceParent = new InheritenceChild();
		InheritenceChild inheritenceChild = new InheritenceChild();

		inheritenceParent.num = 10;
		inheritenceChild.num = 20;
		inheritenceParent.print();
		inheritenceChild.print();
		System.out.println(inheritenceChild.num);
	}

}
