package pa;

class Car {
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�ڵ����� ����������ϴ�.");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� "+ num + "����, ���� ����" + gas + "�� �ٲپ����ϴ�.");
	}
	
	public void show() {
		System.out.println("���� ��ȣ�� " + num + "�Դϴ�.");
		System.out.println("���� ���� " + gas + "�Դϴ�.");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.show();
	}

}
