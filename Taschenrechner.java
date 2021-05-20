/* ####################################################
Einsendeaufgabe 3.5
#################################################### */

package einsendeaufgabeDrei;

import javax.swing.JOptionPane;

public class EinsendeaufgabeDrei {
	
	public static int summe(int zahl1, int zahl2){ //die Methoden zur Berechnung der einzelnen Fälle
		 return (zahl1 + zahl2);
		}
		 public static int differenz(int zahl1, int zahl2){
			return (zahl1 - zahl2);
		 }
		 public static int produkt(int zahl1, int zahl2){
			 return (zahl1 * zahl2);
		 }
		 public static int quotientenwert(int zahl1, int zahl2){
			 return (zahl1 / zahl2);
		 }
		 public static int potenz(int zahl1, int zahl2, String eingabe) { // Die methode zur Berechnung von Potenzen in der For Schleife
			 for (int i=1; i<zahl2;++i) {
				 if (eingabe.equals(">"))  
			 		zahl1 *=zahl2;
			 }
				 return zahl1;
			 	 
		 }

	public static void main(String[] args) {
		 int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein:"));
	      int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein:"));
	       // die abfrage der 2 Zahlen nacheinander wird abgefragt

	      String eingabe = JOptionPane.showInputDialog("Geben Sie die gewünschte Operation ein (+, -, *, /):");
	       // Hier wird der Rechenoperator Abgefragt diesen gibt man als Zeichen ein.
	        
	      switch(eingabe) {
	          case "+": // Falls die Eingabe "+" erfolgt, wird Zahl1 und Zahl2 addiert und das Ergebnis ausgegeben.
	              System.out.println("Das Ergebnis = " + summe(zahl1, zahl2)); // oben wird es ausgerechnet hier wird es aufgerufen
	              break;
	             
	          case "-": // Falls die Eingabe "-" erfolgt, wird zahl1 und zahl2 subtrahiert und das Ergebnis ausgegeben.
	              System.out.println("Das Ergebnis = " + differenz(zahl1, zahl2)); //oben wird es ausgerechnet hier wird es aufgerufen
	              break;
	             
	          case "*": //Falls die Eingabe "*" lautet, wird zahl1 und zahl2 multipliziert und das Ergebnis ausgegeben.
	              System.out.println("Das Ergebnis = " + produkt(zahl1, zahl2)); //oben wird es ausgerechnet hier wird es aufgerufen
	              break;
	             
	          case "/": //Falls die Eingabe "/" lautet, wird zahl1 und zahl2 dividiert und das Ergebnis ausgegeben.
	              System.out.println("Das Ergebnis = " + quotientenwert(zahl1, zahl2)); //oben wird es ausgerechnet hier wird es aufgerufen
	              break;
	          case ">":
	        	  System.out.println("Das Ergebnis = " + potenz(zahl1, zahl2, eingabe));
	        	  break;
		}

	}

}
