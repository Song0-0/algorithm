import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger(); //돈
		BigInteger m = sc.nextBigInteger(); //생명체 수
		
		System.out.println(n.divide(m)); //생명체 하나에게 돌아가는 돈의 양
		System.out.println(n.remainder(m)); //남는 돈

	}

}