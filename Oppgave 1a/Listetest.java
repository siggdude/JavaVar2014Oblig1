/*

Programutvikling v�r 2014
Obligatorsik Oppgave
Oppgave 1: Bil-register

Gruppemedlemer:
Eivind Schulstad	(s198752)
Gretar �varsson		(s198586)
Sigurd H�lleland	(s198597)

*/

import java.awt.event.*;

public class Listetest
{
  public static void main( String[] args )
  {
    Listevindu vindu = new Listevindu();
    //final for � kunne gj�re aksess p� lokal variabel fra anonym indre klasse
  	vindu.addWindowListener(
  			new WindowAdapter() {
  				public void windowClosing( WindowEvent e )
  				{
  					System.exit( 0 );
  				}
  			} );
  	}
}
