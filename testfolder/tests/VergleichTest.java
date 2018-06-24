package tests;

import bauwerke.*;

public class VergleichTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wohngebaeude geb1 = new Huette();
		Wohngebaeude geb2 = new Langhaus();
		
		System.out.println("Name1 ---> Name2");
		System.out.println(geb1.getName() + "-->" + geb2.getName());
		System.out.println(geb1.getZeitalter() + "-->" + geb2.getZeitalter());
		int dif1 = new Integer(geb2.getBewohner() - geb1.getBewohner()).intValue();
		System.out.println(geb1.getBewohner() + "-->" + geb2.getBewohner() + "===>" +dif1);
		System.out.println(geb1.berechneMuenzenInZeit(3600) + "-->" + geb2.berechneMuenzenInZeit(3600));
	}

}
