
public class ClacClass implements Hap {
	@Override
	public void clac(NumVO nc) {
	  int num1 = nc.getNum1();
	  int num2 = nc.getNum2();
	  System.out.println(num1+"+"+num2+"="+(num1+num2));
  }

	@Override
	public void clac(NumVO nc, OpVo ov) {
		// TODO Auto-generated method stub
		  int num1 = nc.getNum1();
		  int num2 = nc.getNum2();

			if(ov.getOp().equals("+")) {
				nc.setResutl(num1 + num2);
			} else if(ov.getOp().equals("-")) {
				nc.setResutl(num1 - num2);
			}
	}
}