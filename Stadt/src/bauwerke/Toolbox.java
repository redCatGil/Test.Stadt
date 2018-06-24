package bauwerke;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Toolbox {

	public Toolbox() {
		// TODO Auto-generated constructor stub
	}
	
	public static int ermittleStunden(int zeit) {
		int stunden;
		stunden = zeit/3600;
		return stunden;
	}
	
	public static int ermittleMinuten(int zeit) {
		int minuten;
		zeit = zeit - (ermittleStunden(zeit)*3600);
		minuten = zeit / 60;
		return minuten;
	}
	
	public static int ermittleSekunden(int zeit) {
		int sekunden;
		sekunden = zeit - (ermittleStunden(zeit)*3600);
		sekunden = sekunden - (ermittleMinuten(sekunden)*60);
		return sekunden;
	}
	
	
	/**
	 * Diese Funktion wandelt die in einen int als Sekunden gespeicherte Zeit in einen String um.
	 * @param zeit - Zeit in Sekunden 
	 * @return String - umgewandelte Zeit als String
	 */
	public static String intToTime(int zeit){
		String wert = null;
		if (zeit <= 60) {
			wert = zeit + "sec";
		} else {
			if (zeit < 3600) {
				wert =  Toolbox.ermittleMinuten(zeit) + ":" + Toolbox.ermittleSekunden(zeit) + " min" ;
			}
			else {
				wert = Toolbox.ermittleStunden(zeit) + ":" + Toolbox.ermittleMinuten(zeit) +
						":" + Toolbox.ermittleSekunden(zeit) + " h";
			}
		}
		return wert;
	}
	
	
	/**
	 * Diese Funktion wandelt die Zeit in einem Kalenderobjekt in einen String um.
	 * @param cal - Kalenderobjekt, in dem die Zeit enthalten ist
	 * @return String - Zeit als String
	 */
	public static String TimeToString(GregorianCalendar cal) {
		if (cal.get(Calendar.HOUR) == 0 && cal.get(Calendar.MINUTE) == 0) {
			return new String(cal.get(Calendar.SECOND) + " sec");
		} else {
			if (cal.get(Calendar.HOUR) == 0) {
				return new String(cal.get(Calendar.MINUTE) + " min" );
			}
			else {
				return new String(cal.get(Calendar.HOUR) + ":" +cal.get(Calendar.MINUTE) + " h" );
			}
		}
	}
	
	public static Wohngebaeude WogAuswahl(int wert) {
		switch (wert) {
		case 0:
			return new Huette();

		case 1:
			return new Langhaus();

		case 2:
			return new Pfahlbau();

		case 3:
			return new StrohgedecktesHaus();

		case 4:
			return new Chalet();

		case 5:
			return new Villa();

		case 6:
			return new Domizil();

		case 7:
			return new Ziegeldachhaus();

		case 8:
			return new Schindelhaus();

		case 9:
			return new Fachwerkhaus();

		case 10:
			return new Stadthaus();

		case 11:
			return new Sandsteinhaus();

		case 12:
			return new Herrenhaus();

		case 13:
			return new Landgut();

		case 14:
			return new Gutshaus();

		case 15:
			return new Mietshaus();

		case 16:
			return new Arkadenhaus();
			
		case 17:
			return new Kolonialhaus();
		case 18:
			return new Landhaus();
		default:
			return null;
		}

	}

}
