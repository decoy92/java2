
public class VarEx1 {

	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000; // ���� age ���� 2000�� ���ؼ� ���� year�� ����
		age = age + 1; // ���� age�� ����� ���� 1 ������Ų��.
		
		System.out.println(year);
		System.out.println(age);
		
		
		// �� ������ �� ��ȯ�ϱ� x=y, y=x (X)
		int x = 10;
		int y = 20;
		int temp; // x���� �ӽ÷� ������ ������ ����
		temp = x;
		x = y;
		y = temp; // �ᱹ �ڸ��ű��. ��������.
		
		System.out.println(x); // 20
		System.out.println(y); // 10
		System.out.println(temp); // 10
		
		
	}

}
