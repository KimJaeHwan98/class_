package class_;

public class TestClass08 {
	public void inputData() {
		int num = 100;
		//return num;
		op( num );
	}
	public void op(int num) {
		num += 1000;
		printN(num);
		
	}
	public void printN(int n) {
		System.out.println("n :"+n);
	}
}
//좋지않은 코드.