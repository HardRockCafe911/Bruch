package Bruch;

public class Bruchtest3 {
	Bruch1 a = new Bruch1(); // a als Bruch definieren
	a.zaehler = 1; // wertzuweisung
	a.nenner = 2;
	Bruch1 b = new Bruch(); // zweiter Bruch
	b.zaehler = a.zaehler; //a wir b zugeordnet
	b.nenner = a.nenner; 
	if (a == b) //liefert false zurück

}
