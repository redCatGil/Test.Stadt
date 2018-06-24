package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import bauwerke.Jagdlager;

public class TestJagdlager {
  @Test
  public void con1() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName(), "Jagdlager", "Der Name des Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con2() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getZeitalter(), "Steinzeit", "Das Zeitalter des Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con3() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getMuenzen(), new Integer(87), "Die Anzahl der Münzen des Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con4() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getWerkzeug(), new Integer(0), "Der Anzahl der Werkzeuge für ein Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con5() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getPersonen(), new Integer(28), "Die Anzahl der Personen für ein Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con6() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getDiamanten(), new Integer(0), "Die Anzahl der Diamanten für ein Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con7() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getLaenge(), new Integer(3), "Die Länge des Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con8() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getBreite(), new Integer(3), "Die Breite des Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con9() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.isStrasse_benoetigt(), true, "Die Angabe ob eine Straße benötigt ist für das Jagdlagers ist nicht korrekt" );
  }
  
  @Test
  public void con10() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_5_Minuten(), new Integer(7), "Die Produktion des Jagdlagers in 5 Minuten ist nicht korrekt" );
  }
  
  @Test
  public void con11() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_15_Minuten(), new Integer(14), "Die Produktion des Jagdlagers in 15 Minuten ist nicht korrekt" );
  }
  
  @Test
  public void con12() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_1_Stunde(), new Integer(34), "Die Produktion des Jagdlagers in 1 Stunde ist nicht korrekt" );
  }
  
  @Test
  public void con13() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_4_Stunden(), new Integer(56), "Die Produktion des Jagdlagers in 4 Stunden ist nicht korrekt" );
  }
  
  @Test
  public void con14() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_8_Stunden(), new Integer(84), "Die Produktion des Jagdlagers in 8 Stunden ist nicht korrekt" );
  }
  
  @Test
  public void con15() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getIn_1_Tag(), new Integer(169), "Die Produktion des Jagdlagers in 1 Tag ist nicht korrekt" );
  }
  
  @Test
  public void con16() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_5_min(), "Trophäe", "Der Name der Produktion des Jagdlagers in 5 Minuten ist nicht korrekt" );
  }
  
  @Test
  public void con17() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_15_min(), "Orakelknochen", "Der Name der Produktion des Jagdlagers in 15 Minuten ist nicht korrekt" );
  }
  
  @Test
  public void con18() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_1_h(), "Knochendolch", "Der Name der Produktion des Jagdlagers in 1 Stunde ist nicht korrekt" );
  }
  
  @Test
  public void con19() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_4_h(), "Kette aus Zähnen", "Der Name der Produktion des Jagdlagers in 4 Stunden ist nicht korrekt" );
  }
  
  @Test
  public void con20() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_8_h(), "Pfeilspitzen", "Der Name der Produktion des Jagdlagers in 8 Stunden ist nicht korrekt" );
  }
  
  @Test
  public void con21() {
	  Jagdlager jagd = new Jagdlager();
	  Assert.assertEquals(jagd.getName_1_t(), "Pelz", "Der Name der Produktion des Jagdlagers in 1 Tag ist nicht korrekt" );
  }
  
}
