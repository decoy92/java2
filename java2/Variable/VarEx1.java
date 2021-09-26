
public class VarEx1 {

	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000; // 변수 age 값에 2000을 더해서 변수 year에 저장
		age = age + 1; // 변수 age에 저장된 값을 1 증가시킨다.
		
		System.out.println(year);
		System.out.println(age);
		
		
		// 두 변수의 값 교환하기 x=y, y=x (X)
		int x = 10;
		int y = 20;
		int temp; // x값을 임시로 저장할 변수를 선언
		temp = x;
		x = y;
		y = temp; // 결국 자리옮기기. 정리정돈.
		
		System.out.println(x); // 20
		System.out.println(y); // 10
		System.out.println(temp); // 10
		
		
	}

}
