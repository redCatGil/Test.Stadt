package bauwerke;

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

}
