package Bruch;
import Bruch.Bruch1;
public class Bruchtest1 {
	public static void main (String[] args){
		Bruch1 b = new Bruch1 ();// hier wird ein neuer Bruch erzeugt
		b.zaehler = 3; // hier haben wir Reverenzvariablen
		b.nenner = 12;
		b.erweitern(4);          //erweitert mit 4 Parameterübergabe bei Methode
		b.ausgeben();
		System.out.print("\n Und nach dem Kürzen: ");
		b.gekuerztausgeben();                             //b.kuerzen;
		                             //b.ausgeben();
		
	}

}
