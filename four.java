import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner robson = new Scanner(System.in);
		double num, result;
		int i = 1;
		System.out.println("e ai meu bom, fala um valor ai vai");
		num = robson.nextDouble();
		if (num >1000) {
			System.out.println("numero muito alto");
		} else {
		System.out.println("\nEssa é a sua tabuada do " + num);
		
			while(i < 11) {
				result = num*i;
				System.out.println(num + " X" +i+ " = " + result);
				i++;
			}
		}
		
	}

}
