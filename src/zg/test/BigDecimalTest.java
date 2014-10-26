package zg.test;

import java.math.BigDecimal;

public class BigDecimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal deci = new BigDecimal("0.40");
		BigDecimal found = new BigDecimal("1.00");
		int count = 0;
		BigDecimal price = deci;
		while(found.compareTo(price) >= 0){
			count++;
			found = found.subtract(price);
		}
		System.out.println(count);
		System.out.println(found);
	}

}
