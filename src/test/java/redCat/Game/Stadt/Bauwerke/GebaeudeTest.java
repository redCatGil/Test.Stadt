package redCat.Game.Stadt.Bauwerke;

import java.util.GregorianCalendar;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import redCat.Game.Stadt.Bauwerke.api.Gebaeude_api;
import redCat.Game.Stadt.Bauwerke.impl.Gebaeude;

public class GebaeudeTest {
  Gebaeude_api geb;
  String name;
  String zeitalter;
  int muenzen;
  int werkzeug;
  int personen;
  int diamanten;
  int laenge;
  int breite;
  int zeit;
  boolean strasse;
  int stunde;
  int minute;
  int sekunde;
	
  @BeforeTest
  public void init() {
	name = "Arkadenhaus";  
	zeitalter = "Kolonialzeit";
	muenzen = 5278;
	werkzeug = 19838;
	personen = 155;
	diamanten = 1;
	laenge = 2;
	breite = 3;
	stunde = 6;
	minute = 20;
	sekunde = 0;
	zeit = stunde*3600 + minute*60 + sekunde; 
	strasse = true;
	geb = new Gebaeude(name, zeitalter, muenzen, werkzeug, personen, diamanten, laenge, breite, zeit, strasse);
  }
  
  @Test
  public void f() {
  }
  
  @Test
  public void GebaeudeNamenMussGleichSein() { 
	  Assert.assertEquals(geb.getName(), name, "Der Gebäudename sollte Arkadenhaus sein!");
  }
  
  @Test
  public void GebaeudeZeitalterMussGleichSein() {
	  Assert.assertEquals(geb.getZeitalter(), zeitalter, "Das Gebäude gehört zum Zeitalter Kolonialzeit");
  }
  
  @Test
  public void GebaeudeBauMuenzenMuessenGleichSein() {
	  Assert.assertEquals(geb.getMuenzen().intValue(), muenzen);
  }
  
  @Test
  public void GebaeudeBauWerkzeugMussGleichSein() {
	  Assert.assertEquals(geb.getWerkzeug().intValue(), werkzeug);
  }
  
  @Test
  public void GebaeudeBauDiasMussGleichSein() {
	  Assert.assertEquals(geb.getDiamanten().intValue(), diamanten);
  }
  
  @Test
  public void GebaeudeLaengeMussGleichSein() {
	  Assert.assertEquals(geb.getLaenge().intValue(), laenge);
  }
  
  @Test
  public void GebaeudeBreiteMussGleichSein() {
	  Assert.assertEquals(geb.getBreite().intValue(), breite);
  }
  
  @Test
  public void GebaeudeBauzeitStundenMussGleichSein () {
	  Assert.assertEquals(geb.getBauzeit().get(GregorianCalendar.HOUR), stunde);
  }
  
  @Test
  public void GebaeudeBauzeitMinutenMussGleichSein () {
	  Assert.assertEquals(geb.getBauzeit().get(GregorianCalendar.MINUTE), minute);
  }
  
  @Test
  public void GebaeudeBauzeitSekundenMussGleichSein () {
	  Assert.assertEquals(geb.getBauzeit().get(GregorianCalendar.SECOND), sekunde);
  }
  
  @Test
  public void GebaeudeBrauchtEineStrasse() {
	  Assert.assertTrue(geb.isStrasse_benoetigt());
  }
  
}
