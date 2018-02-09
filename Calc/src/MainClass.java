/*
    계산기 만들기
*
*/
public class MainClass {

	public static void main(String[] args) {
		String op = null;
		OperClass oc = new OperClass(op);
		oc.inputNumber();
		oc.inputOp();
		oc.printResult();
}
}