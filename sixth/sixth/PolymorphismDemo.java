package sixth;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		displayObject(new Circle112(1, "red", false));
		displayObject(new Rectangle113(1, 1, "black", true));
	}
	
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on "+ object.getDateCreated() +
				". Color is " + object.getColor());
	}

}
