/*
    계산기 만들기
*
*/
public class MainClass {

	public static void main(String[] args) {

		OperClass oc = new OperClass();
		oc.inputNumber();   // 숫자 받기
		oc.inputOp();		// 연산자 받기
		oc.printResult();	// 결과 출력
}
}