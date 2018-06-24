package bauwerke;

import java.util.GregorianCalendar;

public class Wohngebaeude extends Gebaeude {
	
	private Integer bewohner;
	private Integer muenz_einnahmen;
	private Integer einnahme_dauer;

	
	/* ***********************************************************************************************
	 * 
	 *  Konstruktoren
	 * 
	 * *********************************************************************************************** 
	 */
	
	public Wohngebaeude() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Wohngebäudekonstruktur
	 * Dieser Konstruktor ruft die Erzeugung eines Geäbudes auf. Dabei werden zwei Werte mit Konstanten gefüllt:
	 *   - die Anzahl der benötigten Personen mit 0
	 *   - die Angabe, dass eine Straße benötigt wird mit true
	 * Beide Werte sind daher nicht mehr im Konstruktoraufruf enthalten!!
	 * 
	 * @param name           - Name des Gebäudes
	 * @param zeitalter      - Zeitalter als String
	 * @param muenzen		 - Anzahl Münzen die zur Erstellung benötigt werden
	 * @param werkzeug	     - Anzahl Werkzeug die zur Erstellung benötigt werden
	 * @param diamanten      - Anzahl Diamanten die zur Erstellung benötigt werden
	 * @param laenge         - Grundfläche des Gebäudes - Längenangabe 
	 * @param breite         - Grundfläche des Gebäudes - Breitenangabe
	 * @param zeit           - Erstellungszeit als int-Wert in Sekunden
	 * @param bewohner		 - Anzahl der Bewohnter die hinzugewonnen werden
	 * @param einnahmen		 - Anzahl der Münzeinnahmen 
	 * @param einnahme_dauer - Zeit die gebraucht wird, um die Münzeinnahmen zu generieren in Sekunden
	 */
	public Wohngebaeude(String name, String zeitalter, int muenzen,
			int werkzeug, int diamanten, int laenge, int breite,
			int zeit, int bewohner, int einnahmen, int einnahme_dauer) {
		
		//aufruf des übergeordneten Konstruktors
		super(name, zeitalter, muenzen, werkzeug, new Integer(0), diamanten, laenge,
				breite, zeit, true);
		
		//neue Attribute setzen
		this.bewohner = new Integer(bewohner);
		this.muenz_einnahmen = new Integer(einnahmen);
		this.einnahme_dauer = new Integer(einnahme_dauer);
		
	}

	/**
	 * Wohngebäudekonstruktur
	 * Dieser Konstruktor ruft die Erzeugung eines Geäbudes auf. Dabei werden zwei Werte mit Konstanten gefüllt:
	 *   - die Anzahl der benötigten Personen mit 0
	 *   - die Angabe, dass eine Straße benötigt wird mit true
	 * Beide Werte sind daher nicht mehr im Konstruktoraufruf enthalten!!
	 * 
	 * Im gegensatz zum obigen Konstruktor arbeitet dieser mit einem GregorianCalender als Bauzeit-Typ.
	 * 
	 * @param bauzeit        - Erstellungszeit als GregorianCalender
	 * @param breite         - Grundfläche des Gebäudes - Breitenangabe
	 * @param diamanten      - Anzahl Diamanten die zur Erstellung benötigt werden
	 * @param laenge         - Grundfläche des Gebäudes - Längenangabe
	 * @param muenzen        - Anzahl Münzen die zur Erstellung benötigt werden
	 * @param name           - Name des Gebäudes
	 * @param werkzeug       - Anzahl Werkzeug die zur Erstellung benötigt werden
	 * @param zeitalter      - Zeitalter als String
	 * @param bewohner       - Anzahl der Bewohnter die hinzugewonnen werden
	 * @param einnahmen      - Anzahl der Münzeinnahmen 
	 * @param einnahme_dauer - Zeit die gebraucht wird, um die Münzeinnahmen zu generieren in Sekunden
	 */
	public Wohngebaeude(GregorianCalendar bauzeit, Integer breite,
			Integer diamanten, Integer laenge, Integer muenzen, String name,
			Integer werkzeug, String zeitalter, int bewohner, int einnahmen, int einnahme_dauer) {
		
		//aufruf des übergeordneten Konstruktors
		super(bauzeit, breite, diamanten, laenge, muenzen, name, new Integer(0),
				true, werkzeug, zeitalter);
		
		//neue Attribute setzen
				this.bewohner = new Integer(bewohner);
				this.muenz_einnahmen = new Integer(einnahmen);
				this.einnahme_dauer = new Integer(einnahme_dauer);
	}


	/* ***********************************************************************************************
	 * 
	 *  Getter- und Setter-Funktionen
	 * 
	 * *********************************************************************************************** 
	 */
	
	//***************************** Bewohner *********************************************************
	
	/**
	 * @return the bewohner
	 */
	public Integer getBewohner() {
		return bewohner;
	}


	/**
	 * @param bewohner the bewohner to set
	 */
	public void setBewohner(Integer bewohner) {
		this.bewohner = bewohner;
	}

	//***************************** Münzeinnahmen ******************************************************

	/**
	 * @return the muenz_einnahmen
	 */
	public Integer getMuenz_einnahmen() {
		return muenz_einnahmen;
	}


	/**
	 * @param muenz_einnahmen the muenz_einnahmen to set
	 */
	public void setMuenz_einnahmen(Integer muenz_einnahmen) {
		this.muenz_einnahmen = muenz_einnahmen;
	}

	//***************************** Einnahmedauer ******************************************************

	/**
	 * @return the einnahme_dauer
	 */
	public Integer getEinnahme_dauer() {
		return einnahme_dauer;
	}


	/**
	 * @param einnahme_dauer the einnahme_dauer to set
	 */
	public void setEinnahme_dauer(Integer einnahme_dauer) {
		this.einnahme_dauer = einnahme_dauer;
	}


	
	
	
	/* ********************************************************************************************************************************
	 *                                                                                                                                *
	 *                         überschriebene Funktionen und Methoden                                                                 *
	 *                                                                                                                                *
	 * ********************************************************************************************************************************                         	
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"Wohngebaeude [bewohner=" + bewohner + ", muenz_einnahmen="
				+ muenz_einnahmen + ", einnahme_dauer=" + einnahme_dauer + "]";
	}

	
	/* ********************************************************************************************************************************
	 *                                                                                                                                *
	 *                         eigene Funktionen und Methoden                                                                         *
	 *                                                                                                                                *
	 * ********************************************************************************************************************************                         	
	 */
	 
	/**
	 * Diese Funktion berechnet die erwirtschaftete Münzmenge unter Verwendung eines Faktors. Es wird normal gerundet.
	 * Es wird dabei eine Erstellungsperiode unterstellt.
	 * 
	 * @param faktor - double-Wert der zu 1 addiert wird
	 * @return Integer - modifizierter Ertragswert
	 */
	public Integer getModEinnahmen(double faktor) { 
		double fak = 1 + faktor;
		Double erg = new Double(this.getMuenz_einnahmen() * fak + 0.5);
		// System.out.println("Original: " + this.getMuenz_einnahmen() + " Modi: " + faktor + " neuer Wert: " + new Integer(erg.intValue()));
		return new Integer(erg.intValue());
	}
	
	/**
	 * Diese Funktion berechnet die erwirtschaftete Münzmenge zu einer bestimmten Zeiteinheit. Hierzu wird die vorgegebene Zeit ins Verhältnis
	 * zur angegebenen Zeit gesetzt und die Münzmenge mit diesem Faktor bewertet.
	 * Evtl. Modifikatoren werden hierbei nicht berücksichtigt.
	 * 
	 * @param zeit - int-Wert der zu bewertende Zeit in Sekunden angibt
	 * @return Integer - die Anzahl von Münzen die in der angegebenen Zeit produziert wird
	 */
	public Integer berechneMuenzenInZeit(int zeit) {
		double fak = zeit / this.getEinnahme_dauer().doubleValue();
		Double erg = new Double(getMuenz_einnahmen() * fak + 0.5);
//		System.out.println("Prodzeit: " + this.getEinnahme_dauer() + " Faktor: " + fak + " Münzen in Zeit: " + new Integer(erg.intValue()));
		return new Integer(erg.intValue());
		
		
	}
	
}
