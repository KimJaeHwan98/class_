package class_;
/*
 메인 클레스에서 작성한걸 sumFunc에 전부 집어넣고 메인코드를
 지운 뒤 메인 코드에서 변수를 만들어서 실행한다. 
 각각의 기능들을 나눠서 연습한다.
 */
import java.util.Scanner;

public class TestClass04 {
	public void sumFunc() {
		Scanner input = new Scanner(System.in);
		int num = 0 , sum = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		for(int i =1;i<=num;i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합 :"+sum);
	}
}
