package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import bauwerke.Gebaeude;
import bauwerke.Toolbox;

public class TestheutteDP {
	
	
  @Test(dataProvider = "multi-param")
  public void f(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  System.out.println("Name:" + n);
	  System.out.println("Zeitalter:" + s);
	  System.out.println("M�nzen:" + m);
	  System.out.println("Werkzeug:" + w);
	  System.out.println("Personen:" + p);
	  System.out.println("Diamanten:" + d);
	  System.out.println("L�nge:" + l);
	  System.out.println("Breite:" + b);
	  System.out.println("Bauzeit:" + z);
	  System.out.println("Stra�e ben�tigt:" + str);
  }
  
  @Test(dataProvider = "multi-param")
  public void con1(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getName(), n, "Der Name der H�tte ist nicht korrekt" );
  }
  
  @Test(dataProvider = "multi-param")
  public void con2(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getZeitalter(), s, "Wir sind in der Steinzeit");
  }
  
  @Test(dataProvider = "multi-param")
  public void con3(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getMuenzen(), new Integer(m), "Eine H�tte kostet keine M�nzen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con4(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getWerkzeug(), new Integer(w), "Eine H�tte kostet 56 WZ");
  }
  
  @Test(dataProvider = "multi-param")
  public void con5(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getDiamanten(), new Integer(d), "Eine H�tte kostet keine Diamanten");
  }
  
  @Test(dataProvider = "multi-param")
  public void con6(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getPersonen(), new Integer(p), "Eine H�tte ben�tigt keine Personen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con7(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getLaenge(), new Integer(l), "Eine H�tte hat eine L�nge von 2 LE");
  }
  
  @Test(dataProvider = "multi-param")
  public void con8(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getBreite(), new Integer(b), "Eine H�tte hat eine Breite von 2 LE");
  }
  
  @Test(dataProvider = "multi-param")
  public void con9(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.isStrasse_benoetigt(), str, "Eine H�tte braucht eine Strasse");
  }
  
  @Test(dataProvider = "multi-param")
  public void con10(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.HOUR), Toolbox.ermittleStunden(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.MINUTE), Toolbox.ermittleMinuten(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.SECOND), Toolbox.ermittleSekunden(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
  }
  
  @Test(dataProvider = "multi-param")
  public void toString1(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str) {
	  Gebaeude huette = new Gebaeude(n, s, m, w, p, d, l, b, z, str);
	  huette.toString();
  }
  

  //****************** DataProvider **********************************************************************************
  
  @DataProvider(name="multi-param")
  public Object[][] dp(Method m) {
	  
	  String dsn;
	  Properties props = new Properties();

	  switch (m.getName()) {
	case "con10":
		dsn = "huette2.xml";
		break;

	default:
		dsn = "huette1.xml";
		break;
	}
	  
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


	  return new Object[][] {
			  { props.getProperty("Name"), props.getProperty("Zeitalter"), new Integer(props.getProperty("Muenzen")).intValue(),
				  new Integer(props.getProperty("Werkzeug")).intValue(), new Integer(props.getProperty("Personen")).intValue(),
				  new Integer(props.getProperty("Diamanten")).intValue(), new Integer(props.getProperty("Laenge")).intValue(),
				  new Integer(props.getProperty("Breite")).intValue(), new Integer(props.getProperty("Bauzeit")).intValue(), strasse
			  }
	  };


  }
}
