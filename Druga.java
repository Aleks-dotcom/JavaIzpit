
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
    }

	public static int najCas(int[][] t, int krog) {
		int najkrajsi = 100000000;	
		for (int[] x: t){
			if(x[krog] <= najkrajsi)
				najkrajsi = x[krog];
		}
        return najkrajsi;
    }

    public static int[][] kumulativa(int[][] t) {
		
		return null;
    }
}
