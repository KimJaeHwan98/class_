package class_;

public class TestClass06 {
	public int sumFunc(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public int test(int n, String s) {
		return 100;
	}
}
//return은 값을 돌려주겠습니다라는 의미가있다
//또는 빠져나가겠습니다 / 종료하고 빠져나가겠다.
// 돌려줘야하는 값과 리턴을 일치시킨다.
//숫자면 public int return sum(13123)
//return을 만나면 호출했던 값으로 돌아가서 값을 저장하고 출력한다.