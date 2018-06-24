package bauwerke;

public class Produktionsgebaeude extends Gebaeude {
	
	private Integer in_5_Minuten;
	private Integer in_15_Minuten;
	private Integer in_1_Stunde;
	private Integer in_4_Stunden;
	private Integer in_8_Stunden;
	private Integer in_1_Tag;
	private String name_5_min;
	private String name_15_min;
	private String name_1_h;
	private String name_4_h;
	private String name_8_h;
	private String name_1_t;
	
	/* ***********************************************************************************************
	 * 
	 *  Konstruktoren
	 * 
	 * *********************************************************************************************** 
	 */
	
	public Produktionsgebaeude() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Produktionsgeb�udekonstruktur
	 * Dieser Konstruktor ruft die Erzeugung eines Ge�budes auf. Dabei wird ein Wert mit Konstanten gef�llt:
	 *   - die Angabe, dass eine Stra�e ben�tigt wird mit true
	 * Beide Werte sind daher nicht mehr im Konstruktoraufruf enthalten!!
	 * 
	 * @param name           - Name des Geb�udes
	 * @param zeitalter      - Zeitalter als String
	 * @param muenzen		 - Anzahl M�nzen die zur Erstellung ben�tigt werden
	 * @param werkzeug	     - Anzahl Werkzeug die zur Erstellung ben�tigt werden
	 * @param personen       - Anzahl Personen die zur Erstellung ben�tigt werden
	 * @param diamanten      - Anzahl Diamanten die zur Erstellung ben�tigt werden
	 * @param laenge         - Grundfl�che des Geb�udes - L�ngenangabe 
	 * @param breite         - Grundfl�che des Geb�udes - Breitenangabe
	 * @param zeit           - Erstellungszeit als int-Wert in Sekunden
	 * @param in_5_min		 - Anzahl der Werkzeuge, die in 5 Minuten hergestellt werden
	 * @param in_15_min      - Anzahl der Werkzeuge, die in 15 Minuten hergestellt werden
	 * @param in_1_h         - Anzahl der Werkzeuge, die in 1 Stunde hergestellt werden
	 * @param in_4_h         - Anzahl der Werkzeuge, die in 4 Stunden hergestellt werden
	 * @param in_8_h         - Anzahl der Werkzeuge, die in 8 Stunden hergestellt werden
	 * @param in_1_tag       - Anzahl der Werkzeuge, die in einem Tag hergestellt werden
	 */ 
	public Produktionsgebaeude(String name, String zeitalter, int muenzen, int werkzeug, int personen, int diamanten,
			int laenge, int breite, int zeit, boolean strasse, int in_5_min, int in_15_min, int in_1_h,
			int in_4_h, int in_8_h, int in_1_tag, String name_5_min, String name_15_min, String name_1_h, 
			String name_4_h, String name_8_h, String name_1_t) {
		
		//aufruf des �bergeordneten Konstruktors
		super(name, zeitalter, muenzen, werkzeug, personen, diamanten, laenge, breite, zeit, true);
		
		//neue Attribute setzen
		this.in_5_Minuten = new Integer(in_5_min);
		this.in_15_Minuten = new Integer(in_15_min);
		this.in_1_Stunde = new Integer(in_1_h);
		this.in_4_Stunden = new Integer(in_4_h);
		this.in_8_Stunden = new Integer(in_8_h);
		this.in_1_Tag = new Integer(in_1_tag);
		this.name_5_min = name_5_min;
		this.name_15_min = name_15_min;
		this.name_1_h = name_1_h;
		this.name_4_h = name_4_h;
		this.name_8_h = name_8_h;
		this.name_1_t = name_1_t;
	}
	
	/* ***********************************************************************************************
	 * 
	 *  Getter- und Setter-Funktionen
	 * 
	 * *********************************************************************************************** 
	 */
	
	//***************************** Anzahl WZ in 5 Minuten ********************************************

	/**
	 * @return the in_5_Minuten
	 */
	public Integer getIn_5_Minuten() {
		return in_5_Minuten;
	}

	/**
	 * @param in_5_Minuten the in_5_Minuten to set
	 */
	public void setIn_5_Minuten(Integer in_5_Minuten) {
		this.in_5_Minuten = in_5_Minuten;
	}

	//***************************** Anzahl WZ in 15 Minuten *******************************************
	
	/**
	 * @return the in_15_Minuten
	 */
	public Integer getIn_15_Minuten() {
		return in_15_Minuten;
	}

	/**
	 * @param in_15_Minuten the in_15_Minuten to set
	 */
	public void setIn_15_Minuten(Integer in_15_Minuten) {
		this.in_15_Minuten = in_15_Minuten;
	}

	//***************************** Anzahl WZ in 1 Stunde **********************************************
	
	/**
	 * @return the in_1_Stunde
	 */
	public Integer getIn_1_Stunde() {
		return in_1_Stunde;
	}

	/**
	 * @param in_1_Stunde the in_1_Stunde to set
	 */
	public void setIn_1_Stunde(Integer in_1_Stunde) {
		this.in_1_Stunde = in_1_Stunde;
	}
	
	//***************************** Anzahl WZ in 4 Stunden **********************************************

	/**
	 * @return the in_4_Stunden
	 */
	public Integer getIn_4_Stunden() {
		return in_4_Stunden;
	}

	/**
	 * @param in_4_Stunden the in_4_Stunden to set
	 */
	public void setIn_4_Stunden(Integer in_4_Stunden) {
		this.in_4_Stunden = in_4_Stunden;
	}
	
	//***************************** Anzahl WZ in 8 Stunden **********************************************

	/**
	 * @return the in_8_Stunden
	 */
	public Integer getIn_8_Stunden() {
		return in_8_Stunden;
	}

	/**
	 * @param in_8_Stunden the in_8_Stunden to set
	 */
	public void setIn_8_Stunden(Integer in_8_Stunden) {
		this.in_8_Stunden = in_8_Stunden;
	}
	
	//***************************** Anzahl WZ in 1 Tag **************************************************

	/**
	 * @return the in_1_Tag
	 */
	public Integer getIn_1_Tag() {
		return in_1_Tag;
	}

	/**
	 * @param in_1_Tag the in_1_Tag to set
	 */
	public void setIn_1_Tag(Integer in_1_Tag) {
		this.in_1_Tag = in_1_Tag;
	}
	
	//***************************** Name der Produktion in 5 Minuten **************************************

	/**
	 * @return the name_5_min
	 */
	public String getName_5_min() {
		return name_5_min;
	}

	/**
	 * @param name_5_min the name_5_min to set
	 */
	public void setName_5_min(String name_5_min) {
		this.name_5_min = name_5_min;
	}
	
	//***************************** Name der Produktion in 15 Minuten *************************************

	/**
	 * @return the name_15_min
	 */
	public String getName_15_min() {
		return name_15_min;
	}

	/**
	 * @param name_15_min the name_15_min to set
	 */
	public void setName_15_min(String name_15_min) {
		this.name_15_min = name_15_min;
	}
	
	//***************************** Name der Produktion in 1 Stunde **************************************

	/**
	 * @return the name_1_h
	 */
	public String getName_1_h() {
		return name_1_h;
	}

	/**
	 * @param name_1_h the name_1_h to set
	 */
	public void setName_1_h(String name_1_h) {
		this.name_1_h = name_1_h;
	}
	
	//***************************** Name der Produktion in 4 Stunden **************************************

	/**
	 * @return the name_4_h
	 */
	public String getName_4_h() {
		return name_4_h;
	}

	/**
	 * @param name_4_h the name_4_h to set
	 */
	public void setName_4_h(String name_4_h) {
		this.name_4_h = name_4_h;
	}
	
	//***************************** Name der Produktion in 8 Stunden **************************************

	/**
	 * @return the name_8_h
	 */
	public String getName_8_h() {
		return name_8_h;
	}

	/**
	 * @param name_8_h the name_8_h to set
	 */
	public void setName_8_h(String name_8_h) {
		this.name_8_h = name_8_h;
	}
	
	//***************************** Name der Produktion in 1 Tag ******************************************

	/**
	 * @return the name_1_t
	 */
	public String getName_1_t() {
		return name_1_t;
	}

	/**
	 * @param name_1_t the name_1_t to set
	 */
	public void setName_1_t(String name_1_t) {
		this.name_1_t = name_1_t;
	}
	
	/* ********************************************************************************************************************************
	 *                                                                                                                                *
	 *                         �berschriebene Funktionen und Methoden                                                                 *
	 *                                                                                                                                *
	 * ********************************************************************************************************************************                         	
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString()+"Produktionsgebaeude [in_5_Minuten=" + in_5_Minuten
				+ ", in_15_Minuten=" + in_15_Minuten + ", in_1_Stunde="
				+ in_1_Stunde + ", in_4_Stunden=" + in_4_Stunden
				+ ", in_8_Stunden=" + in_8_Stunden + ", in_1_Tag=" + in_1_Tag
				+ ", name_5_min=" + name_5_min + ", name_15_min=" + name_15_min
				+ ", name_1_h=" + name_1_h + ", name_4_h=" + name_4_h
				+ ", name_8_h=" + name_8_h + ", name_1_t=" + name_1_t + "]";
	}
	
	
	

}
