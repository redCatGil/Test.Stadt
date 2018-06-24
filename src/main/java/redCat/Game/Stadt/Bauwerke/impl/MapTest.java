package redCat.Game.Stadt.Bauwerke.impl;

import redCat.Game.Stadt.Enumeration.Zeitalter;
import redCat.Game.Stadt.Tools.Bauwerke_Tools;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double faktor = Bauwerke_Tools.getZeitfaktor(Zeitalter.Kolonialzeit);
		System.out.println("Faktor der Kolonialzeit ist " + faktor.toString());
		Double fak2 = Bauwerke_Tools.getZeitfaktor(Zeitalter.valueOf("Steinzeit"));
		System.out.println("Faktor der Steinzeit ist " + fak2.toString());

	}

}
