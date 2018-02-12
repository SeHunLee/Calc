import java.util.Scanner;

public class OperClass {
	Hap hp;
	NumVO nc; //고정
	OpVo ov;

	//생성자
	public OperClass() {
		System.out.println("계산기 프로그램");
		//ac = new MinusClass();
		nc = new NumVO();
		ov = new OpVo();
		hp = new ClacClass();
//		mc = new MinusClass();
	}
	
	public void inputOp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자 입력:");
		ov.setOp(sc.next());
	}
	
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력:");
		nc.setNum1(sc.nextInt());
		System.out.println("두번째 숫자 입력:");
		nc.setNum2(sc.nextInt());
	}
	
	public void printResult() {
		hp.clac(nc, ov);
		System.out.println(nc.getNum1() + ov.getOp() + nc.getNum2() 
							+ "=" + nc.getResutl());
	}
}
