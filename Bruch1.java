package Bruch;

public class Bruch1 {
	
		int zaehler;
		int nenner;
		void ausgeben() 
		 {				
				System.out.print(zaehler +"/"+ nenner);
			}
		void kuerzen()
		{
			int m, n, r;
			m = zaehler;
			n = nenner;
			r = m % n;
			
			while (r > 0) {
				m = n;
				n = r;
				r = m % n;
 			}
			zaehler =zaehler /n;
			nenner = nenner /n;
		}
		
		void gekuerztausgeben() // gekürzte ausgabe ersetzt b.ausgeben
		{                       // und b.kuerzen
			kuerzen();
			ausgeben();
		}
		void erweitern(int a) {
			zaehler *= a;
			nenner *= a;
		}
}
