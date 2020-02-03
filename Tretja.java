
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Zaposleni {
        protected String ip;
        protected int placa;
        protected Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        @Override
        public String toString() {
            return this.ip;
        }
		public int vrniPlaco(){
			return this.placa;
		}
		public Vodja vrniVodjo(){
			return this.nadrejeni;
		}
        public int placaNadrejenega() {
			if (this.nadrejeni == null)
				return -1;
			return this.nadrejeni.vrniPlaco();
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
			int stevec = 0;
			for (Zaposleni delavc : zaposleni){
				for (Zaposleni delavc2 : zaposleni){
					if ((delavc instanceof Vodja && delavc2 instanceof Delavec) && delavc.placa < delavc2.placa)
						stevec++;
				}
			}
			return stevec;
        }
		
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
		

        public Vodja vrhovni() {
			if (this.nadrejeni == null)
				return this;
			return this.nadrejeni.vrhovni();
        }
    }
}
