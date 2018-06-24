package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bauwerke.Toolbox;
import bauwerke.Wohngebaeude;

public class Testheutte2DP {

	//****************** DataProvider **********************************************************************************
	  
	  @DataProvider(name="multi-param")
	  public Object[][] dp(Method m) {
		  
		  String dsn = "huette3.xml";;
		  Properties props = new Properties();

		  try {
			  FileInputStream inFile = new FileInputStream(dsn);
			  props.loadFromXML(inFile);

		  } catch (IOException e) {
			  System.err.println("Die Verarbeitung wurde abgebrochen!!");
			  e.printStackTrace();
		  }


		  return new Object[][] {
				  { props.getProperty("Name"), props.getProperty("Zeitalter"), new Integer(props.getProperty("Muenzen")).intValue(),
					  new Integer(props.getProperty("Werkzeug")).intValue(), 
					  new Integer(props.getProperty("Diamanten")).intValue(), new Integer(props.getProperty("Laenge")).intValue(),
					  new Integer(props.getProperty("Breite")).intValue(), new Integer(props.getProperty("Bauzeit")).intValue(), 
					  new Integer(props.getProperty("Bewohner")).intValue(), new Integer(props.getProperty("Einnahmen")).intValue(),
					  new Integer(props.getProperty("Einnahme_Zeit")).intValue()
				  }
		  };
		  
	  }
	  
	  @DataProvider(name="multi-paramMod")
	  public Object[][] dpMod(Method m) {
		  
		  String dsn = "huette3Mod.xml";;
		  Properties props = new Properties();

		  try {
			  FileInputStream inFile = new FileInputStream(dsn);
			  props.loadFromXML(inFile);

		  } catch (IOException e) {
			  System.err.println("Die Verarbeitung wurde abgebrochen!!");
			  e.printStackTrace();
		  }


		  return new Object[][] {
				  { props.getProperty("Name"), props.getProperty("Zeitalter"), new Integer(props.getProperty("Muenzen")).intValue(),
					  new Integer(props.getProperty("Werkzeug")).intValue(), 
					  new Integer(props.getProperty("Diamanten")).intValue(), new Integer(props.getProperty("Laenge")).intValue(),
					  new Integer(props.getProperty("Breite")).intValue(), new Integer(props.getProperty("Bauzeit")).intValue(), 
					  new Integer(props.getProperty("Bewohner")).intValue(), new Integer(props.getProperty("Einnahmen")).intValue(),
					  new Integer(props.getProperty("Einnahme_Zeit")).intValue(), new Double(props.getProperty("Faktor")).doubleValue(),
					  new Integer(props.getProperty("modEinnahme")).intValue()
				  }
		  };
		  
	  }
	
  @Test(dataProvider = "multi-param")
  public void f(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  System.out.println(huette.toString());
  }
  
  
  @Test(dataProvider = "multi-param")
  public void con1(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getName(), name, "Was f�r ein komischer H�ttenname...");
  }
  
  @Test(dataProvider = "multi-param")
  public void con2(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getZeitalter(), alter, "Die H�tte steht in der Steinzeit");
  }
  
  @Test(dataProvider = "multi-param")
  public void con3(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getMuenzen(), new Integer(m), "Die H�tte hat einen anderen M�nzbedarf...");
  }
  
  @Test(dataProvider = "multi-param")
  public void con4(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getWerkzeug(), new Integer(w), "Die H�tte hat einen anderen Werkzeugbedarf...");
  }
  
  @Test(dataProvider = "multi-param")
  public void con5(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getDiamanten(), new Integer(d), "Die H�tte hat einen anderen Diamantenbedarf...");
  }
  
  @Test(dataProvider = "multi-param")
  public void con6(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getLaenge(), new Integer(l), "Die H�tte hat eine falsche Grundfl�che: L�nge pr�fen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con7(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getBreite(), new Integer(b), "Die H�tte hat eine falsche Grundfl�che: Breite pr�fen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con8(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.HOUR), Toolbox.ermittleStunden(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.MINUTE), Toolbox.ermittleMinuten(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
	  Assert.assertEquals(huette.getBauzeit().get(Calendar.SECOND), Toolbox.ermittleSekunden(z), "Eine H�tte hat eine Bauzeit von 5 Min.");
  }
  
  @Test(dataProvider = "multi-param")
  public void con9(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getBewohner(), new Integer(bewohner), "Eine H�tte hat 14 Bewohner");
  }
  
  @Test(dataProvider = "multi-param")
  public void con10(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getMuenz_einnahmen(), new Integer(ein), "Die H�tte erwirtschaftet 11 M�nzen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con11(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getEinnahme_dauer(), new Integer(ein_zeit), "Die H�tte erwirtschaftet 11 M�nzen in 15 Minuten");
	  System.out.println("Stunden: " + Toolbox.ermittleStunden(huette.getEinnahme_dauer().intValue()) + 
			             " Minuten: " + Toolbox.ermittleMinuten(huette.getEinnahme_dauer().intValue()) +
			             " Sekunden: " + Toolbox.ermittleSekunden(huette.getEinnahme_dauer().intValue())); 
  }
  
  @Test(dataProvider = "multi-param")
  public void con12(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getPersonen(), new Integer(0), "Eine H�tte ben�tigt keine Personen");
  }
  
  @Test(dataProvider = "multi-param")
  public void con13(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.isStrasse_benoetigt(), true, "Die H�tte muss an einem Weg stehen");
  }
  
  @Test(dataProvider = "multi-paramMod")
  public void modEinnahmen1(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit,
		                    double faktor, int modEin) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.getModEinnahmen(faktor), new Integer(modEin), "Die H�tte erwirtschaftet nun 13 M�nzen");
	  Wohngebaeude huette2 = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, 14, ein_zeit);
	  Assert.assertEquals(huette2.getModEinnahmen(faktor), new Integer(17), "Die H�tte erwirtschaftet nun 13 M�nzen");
  }
  
  @Test(dataProvider = "multi-param")
  public void berechne1(String name, String alter, int m, int w, int d, int l, int b, int z, int bewohner, int ein, int ein_zeit) {
	  Wohngebaeude huette = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, ein_zeit);
	  Assert.assertEquals(huette.berechneMuenzenInZeit(3600), new Integer(44), "Die H�tte erwirtschaftet in einer Stunde 44 M�nzen");
	  Wohngebaeude huette2 = new Wohngebaeude(name, alter, m, w, d, l, b, z, bewohner, ein, 7200);
	  Assert.assertEquals(huette2.berechneMuenzenInZeit(3600), new Integer(6), "Die H�tte2 erwirtschaftet in einer Stunde 6 M�nzen");
  }
  
}
