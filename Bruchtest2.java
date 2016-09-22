package Bruch;
import Bruch.Bruch1;
public class Bruchtest2 {

	public static void main(String[] args) {
		
		if (x > 10){ // Lebensdauer wir dagestellt
			Bruch1 c = new Bruch1();
			c.zaehler = 2;
			c.nenner = 3;
		}
		System.out.println(c.zaehler);
		Bruch1 b = new Bruch1();
		b.zaehler = 5;
		b.nenner = 8;
		b.ausgeben();
		b.nenner = 5;
		b.ausgeben();	// ausgabe der Methode
		if (b.nenner != 0); // Prüft ob der Nenner ungleich 0 ist
		Bruch1 a = new Bruch1();
		a.zaehler = 3;
		a.nenner = 4;
		if (a.nenner != 0);
		if (a == b);
		System.out.print("Bruch b = " + b.zaehler + "/" + b.nenner);
		System.out.print("Bruch a = " + a.zaehler + "/" + a.nenner);
	}
	Bruch1 d =new Bruch1();// als Beispiel für die Referenz als Parameter
	d.zaehler = 3;
	d.nenner = 4;
	Bruch1 f = new Bruch1();
	f.zaehler = 3;
	f.nenner = 12;
	d.ausgeben();
	d.multipiziere(f);
	System.out.println();
	d.ausgeben();
	double dezimalwert(){// aufbau einer Methode mit Rückgabewert
		return (double) zaehler/nenner;// mit return wird der Wert zurückgegeben
		System.out.print(a.dezimalwert());
		if (a.dezimalwert() < 3.5){}
		// Verkettung von  Konstruktoren
		class Bruch{ 
			int zaehler;
			int nenner;
			Bruch (int z,int n ){
				int hz, hn, r;
				if (n == 0){
					System.out.print("Fehler! Der Nenner darf nicht 0 sein!");
				}else{
					hz = z;
					hn = n;
					r = hz % hn;
									}
				zaehler = z/hn;
				nenner = n/hn;
			}
			Bruch(){
				this(0, 1);}
		
		}
		
		}
	}
	
	
	

	
}
