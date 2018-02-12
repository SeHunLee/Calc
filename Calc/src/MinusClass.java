public class MinusClass implements Hap {
	@Override
	public void clac(NumVO nc) {	
	System.out.println("빼기 연산");
	int num1 = nc.getNum1();
	 int num2 = nc.getNum2();
	 System.out.println(num1+"-"+num2+"="+(num1-num2)+"ㅋㅋㅋㅋ");
 }

	@Override
	public void clac(NumVO nc, OpVo op) {
		// TODO Auto-generated method stub
		
	}
}
