package class_;
/*
 t.test는 TestClass03을 불러오는 변수 t에서 기능을 불러온것이다.
 t로 메소드를 부르게되면 메소드 위치를 찾아가서 순서대로 진행한다. 그리고
 다시 돌아와서 다음 코드들을 진행한다.
 */
public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t = new TestClass03();
	System.out.println("main 시작");
	t.test();
	System.out.println("main 종료");
}
}
