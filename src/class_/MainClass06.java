package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass06 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num , sum ;
	System.out.println("수 입력");
	num = input.nextInt();
	
	TestClass06 t = new TestClass06();
	sum = t.sumFunc(num);
	
	System.out.println(sum);
	
	
	
	t.test(20, "aaa");
	System.out.println("끝");

ArrayList<String> arr = new ArrayList<>();
boolean bool = arr.add("aaa");
String s = arr.get(0);
System.out.println(s);
System.out.println(bool);









}
}
// 넘어가는 변수가 같을 필요는 없다.
//메인에서는 값으로 넘어가고 테스트에서는 값을 받아온다.
//숫자면 인트 문자면 스트링으로 설정해줘야한다






















