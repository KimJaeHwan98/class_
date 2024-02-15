package class_;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		TestClass05 t =new TestClass05();
		t.sumFunc(num);
	}
}
//이럴 때 사용하는게 매게변수이다.
//  메인에서 테스트에 저장해야하는 용도기때문에
//문자열이면 String을 테스트코드에 넣어줘야한다.
// 값을 넘겨준다.





















