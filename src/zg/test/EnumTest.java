package zg.test;

public class EnumTest {
	public static void main(String[] args) {
		double sum = BasicOperation.PLUS.apply(3, 4);
		double div = BasicOperation.DIV.apply(3, 4);
		double mul =  BasicOperation.MUlti.apply(3, 4);
		double sub = BasicOperation.SUB.apply(3, 4);
		System.out.println("和：" + sum);
		System.out.println("商：" + div);
		System.out.println("积：" + mul);
		System.out.println("差：" + sub);
		
		double exp = ExtendedOperation.EXP.apply(3, 4);
		double rem = ExtendedOperation.REMAINDER.apply(3, 4);
		System.out.println("指数:" + exp);
		System.out.println("余数:" + rem);
	}
}
