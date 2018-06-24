package testNG;

public class Sandkasten {

	public Sandkasten() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d1 = "01.04.1999";
		String[] teile = d1.split("\\.");
		System.out.println("Anzahl: " + teile.length);
		String day = teile[0];
		String month = teile[1];
		String year = teile[2];
		System.out.println(year + month + day);
		
		String string = "004-034556";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556

		System.out.println(part1 + " ## " +part2);
		
		
	}

}
