package lang.basic;

import java.math.BigInteger;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/24 0024. - 星期四
 * nickName louyedaren
 */
public class One {
	private int anInt;
	private short anShort;
	private char anChar;
	private boolean aBoolean;
	private float aFloat;

	public static void main(String[] args) {
		new One().printData();
	}

	void printData(){
		System.out.println(anInt);
		System.out.println(anShort);
		System.out.println(anChar);
		System.out.println(aBoolean);
		System.out.println(aFloat);
	}
}
