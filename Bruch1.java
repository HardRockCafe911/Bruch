// Ich hoffe das ist genug um sie zufrieden zustellen 

package Bruch;
// Attribute  
public class Bruch1 {
	
		int zaehler;
		int nenner;
		void ausgeben() 
		 {				
				System.out.print(zaehler +"/"+ nenner);
			}
		void kuerzen() // Methode: kopf der Methode
		{
			int m, n, r;// rumpf der Methode
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
		void multipiziere (Bruch1 m){// mulitiplikation Referenztypen als Parameter
			zaehler *= m.zaehler;
			nenner *= m.nenner;
		}
		
}
