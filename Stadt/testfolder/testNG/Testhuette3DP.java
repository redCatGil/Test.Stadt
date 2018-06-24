package testNG;

import org.testng.annotations.Test;

import bauwerke.Huette;
import bauwerke.Toolbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Testhuette3DP {
	@Test(dataProvider = "dp")
	  public void con1(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getName(), n, "Der Name der Hütte ist nicht korrekt" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con2(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getZeitalter(), s, "Wir befinden uns noch in der Steinzeit" );
	  }

	@Test(dataProvider = "dp")
	  public void con3(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getMuenzen(), new Integer(m), "Eine Hütte kostet keine Münzen" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con4(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getWerkzeug(), new Integer(w), "Eine Hütte kostet 55 Werkzeuge" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con5(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getPersonen(), new Integer(p), "Eine Hütte bedarf keiner Personen" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con6(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getDiamanten(), new Integer(d), "Eine Hütte kostet keine Diamanten" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con7(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getLaenge(), new Integer(l), "Eine Hütte hat eine Länge von 2" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con8(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getBreite(), new Integer(b), "Eine Hütte hat eine Breite von 2" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con9(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getBauzeit().get(Calendar.HOUR), Toolbox.ermittleStunden(z), "Eine Hütte hat eine Bauzeit von 5 Sec.");
		  Assert.assertEquals(huette.getBauzeit().get(Calendar.MINUTE), Toolbox.ermittleMinuten(z), "Eine Hütte hat eine Bauzeit von 5 Sec.");
		  Assert.assertEquals(huette.getBauzeit().get(Calendar.SECOND), Toolbox.ermittleSekunden(z), "Eine Hütte hat eine Bauzeit von 5 Sec.");
	  }
	
	@Test(dataProvider = "dp")
	  public void con10(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.isStrasse_benoetigt(), str, "Eine Hütte muss an der Straße liegen" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con11(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getBewohner(), new Integer(bewohner), "Eine Hütte hat 14 Bewohner" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con12(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getMuenz_einnahmen(), new Integer(einnahme), "Eine Hütte generiert Einnahmen von 6 Gold" );
	  }
	
	@Test(dataProvider = "dp")
	  public void con13(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  Assert.assertEquals(huette.getEinnahme_dauer(), new Integer(einnahmedauer), "Eine Hütte bekommt alle 5 Min. Einnahmen" );
	  }
	
	
	@Test(dataProvider = "dp")
	  public void con14(String n, String s, int m, int w, int p, int d, int l, int b, int z, boolean str, 
			  int bewohner, int einnahme, int einnahmedauer) {
		  Huette huette = new Huette();
		  System.out.println(huette.toString());
	  }
	
  @DataProvider(name="dp")
  public Object[][] dp(Method m) {
	  
	  String dsn = "huette1.xml";
	  Properties props = new Properties();
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
				  new Integer(props.getProperty("Breite")).intValue(), new Integer(props.getProperty("Bauzeit")).intValue(), strasse,
				  new Integer(props.getProperty("Bewohner")).intValue(), new Integer(props.getProperty("Einnahme")).intValue(),
				  new Integer(props.getProperty("Einnahmedauer")).intValue()
			  }
	  };

  }
}
