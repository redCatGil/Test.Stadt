package testNG;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Calendar;

import bauwerke.*;
import enumeration.*;



public class Testhuette {
	
	private Gebaeude huette;
	
 @BeforeMethod
	public void beforeMethod() {
	 		
	 Properties props = new Properties();
	 String dsn = "huette1.xml";
	 boolean strasse = true;
		  	  
	 try {
		 FileInputStream inFile = new FileInputStream(dsn);
		 props.loadFromXML(inFile);
			
		} catch (IOException e) {
			System.err.println("Die Verarbeitung wurde abgebrochen!!");
			e.printStackTrace();
		}
	 
	 	if (props.getProperty("Strasse").compareToIgnoreCase("true") == 0) {
	 		strasse = true;
			
		} else {
			strasse = false;
		}
		
	 	huette = new Gebaeude(props.getProperty("Name"),
	 			              props.getProperty("Zeitalter"),
	 			              new Integer(props.getProperty("Muenzen")).intValue(),
	 			              new Integer(props.getProperty("Werkzeug")).intValue(),
	 			              new Integer(props.getProperty("Personen")).intValue(),
	 			              new Integer(props.getProperty("Diamanten")).intValue(),
	 			              new Integer(props.getProperty("Laenge")).intValue(),
	 			              new Integer(props.getProperty("Breite")).intValue(),
	 			              new Integer(props.getProperty("Bauzeit")).intValue(),
	 			              strasse);
	 			
		  
	  }
	
  @Test
  public void huettenname() {
// Gebaeude huette = new Gebaeude("Hütte", "Steinzeit", 0, 56, 0, 0, 2, 2, 5, true);
	  
	  Assert.assertEquals(huette.getName(), new String("Hütte"), "Der Name der Hütte ist nicht korrekt" );
  }
  
  @Test
  public void huettenzeitalter() {
	  Assert.assertEquals(huette.getZeitalter(), Zeitalter.Steinzeit.name(), "Wir sind in der Steinzeit");
  }
  
  @Test
  public void huettenmuenze() {
	  Assert.assertEquals(huette.getMuenzen(), new Integer(0), "Hütte kostet keine Münzen");
  }
  
  @Test
  public void huettenwerkzeug() {
	  Assert.assertEquals(huette.getWerkzeug(), new Integer(56), "Hütte kostet 56 WZ");
  }
  
  @Test
  public void huettendiamt() {
	  Assert.assertEquals(huette.getDiamanten(), new Integer(0), "Hütte kostet keine Diamanten");
  }
  
  @Test
  public void huettenpersonen() {
	  Assert.assertEquals(huette.getPersonen(), new Integer(0), "Hütte kostet keine Personen");
  }
  
  @Test
  public void huettenlaenge() {
	  Assert.assertEquals(huette.getLaenge(), new Integer(2), "Hütte hat eine Länge von 2");
  }
  
  @Test
  public void huettenbreite() {
	  Assert.assertEquals(huette.getBreite(), new Integer(2), "Hütte hat eine Breite von 2");
  }
  
  @Test
  public void huettenweg() {
	  Assert.assertEquals(huette.isStrasse_benoetigt(), true, "Hütte braucht eine Strasse");
  }
  
  @Test
  public void huettenzeitalter2() {
	  Assert.assertEquals(huette.getZeitalter(), Zeitalter.Steinzeit.name(), "Wir sind in der Steinzeit");
	  huette.setZeitalter("Eisenzeit");
	  Assert.assertEquals(huette.getZeitalter(), Zeitalter.Eisenzeit.name(), "Wir sind in der Eisenzeit");
  }
  
  @Test
  public void huettenzeitalter3() {
	  Assert.assertEquals(huette.getZeitalter(), Zeitalter.Steinzeit.name(), "Wir sind in der Steinzeit");
	  huette.setZeitalter("Winterzeit");
	  Assert.assertEquals(huette.getZeitalter(), Zeitalter.Steinzeit.name(), "Wir sind in der Steinzeit geblieben, da es die Winterzeit nicht gibt");
  }
  
 @Test
 public void sek1() {
	 Assert.assertEquals(Toolbox.ermittleSekunden(2), 2);
 }
  
 @Test
 public void min1() {
	 Assert.assertEquals(Toolbox.ermittleSekunden(75), 15);
	 Assert.assertEquals(Toolbox.ermittleMinuten(75), 1);
 }
 
 @Test
 public void std1() {
	 Assert.assertEquals(Toolbox.ermittleSekunden(3675), 15);
	 Assert.assertEquals(Toolbox.ermittleMinuten(3675), 1);
	 Assert.assertEquals(Toolbox.ermittleStunden(3675), 1);
 }
 
 @Test
 public void huettenzeit() {
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.SECOND), 5, "Bauzeit sollte nur zwei Sekunden betragen");	
 }
 
}
