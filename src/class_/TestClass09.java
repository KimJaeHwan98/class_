package class_;

public class TestClass09 {
	public void test1() {
		for(int i =0;i<5;i++) {
			System.out.println(i);
			if(i==3)
				//break;
				return ;
		}
		System.out.println("test1 종료");
	}
	public int test2() {
		int n= 10;
		if(n>100)
		return 100;
		
	return 0;
	}
	
	public String test3() {
	int num = 100;
	if(num>10)
		retun "문자열";
	else
		return100; //안되는 예제 에러:return 100
	}
	public String test4() {
		return "aaa";//,"bbb","ccc"; //에러: 변수도 하나
	}
}

//인트형태로 돌리는 리턴값을 적어줘야한다.
//반환 타입에 맞춰 무조건 써야한다.
//타입이 스트링이면 스트링만 써야한다.
//스트링이면 반환값도 무조건 스트링이여야한다.





















