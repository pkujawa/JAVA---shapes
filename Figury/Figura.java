import java.awt.Color;

public abstract class Figura {
	private int punkty;
	private Color kolor;
	private Punkt punktZamocowania;
	
	//konstruktor figury, ktory rozszerza kazda z figur
	public Figura(int punkty, Color kolor, Punkt punktZamocowania) {
		this.punkty = punkty;
		this.kolor = kolor;
	}
	//metody abstrakcyjne, ktore zostana zaimplementowane w subklasach
	abstract public String toString();
	
	abstract public boolean equals(Figura figura);
	//metody ktore sa wspolne dla wszystkich subklas i sa zaimplementowane
	public String printKolor() {
		return "RGB(" + kolor.getRed() + ", "+ kolor.getGreen() + ", "+ kolor.getBlue() + ") ";
	}
	// gettery i settery
	public int getPunkty() {return this.punkty;}
	
	public void setPunkty(int punkty) {this.punkty = punkty;}
	
	public Punkt getPunktZamocowania() {return punktZamocowania;}
	
	public void setKolor(Color kolor) {this.kolor = kolor;}
	
	public Color getKolor () {return kolor;}
}
