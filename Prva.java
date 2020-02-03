
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int k = sc.nextInt();
		int stSkatel = 0;
		int kup = 1;
		if (k <=a)
			System.out.println(kup);
		for (int i = a; i<=k; i+=b){
			stSkatel += i;
			if (stSkatel >= k){
				System.out.println(kup);
				break;
			}
			kup++;		
		}
	}
}
