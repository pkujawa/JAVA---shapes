import java.awt.Color;

public class Prostokat extends Figura implements WypelnijKolorem, ObliczPoleIObwod{
	Punkt punkt1;
	Punkt punkt2;
	Punkt punkt3;
	Punkt punkt4;
	
	public Prostokat(Punkt punkt1, Punkt punkt2, Punkt punkt3, Punkt punkt4, Color kolor, Punkt punktZamocowania) {
		super(4, kolor, punktZamocowania);
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
		this.punkt3 = punkt3;
		this.punkt4 = punkt4;
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Oto prostok¹t o wierzcho³kach: " + punkt1.toString() + ", " + punkt2.toString() + ", " + punkt3.toString() + ", " + punkt4.toString() +". Jego kolor to " + printKolor();
	}
	
	@Override
	public void wypelnijKolorem(int red, int green, int blue) {
		setKolor(new Color(red, green, blue));
	}
	
	private float obliczDlugoscBoku(Punkt p1, Punkt p2) {
		return (float)(Math.pow(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2),0.5));
	}
	
	@Override
	public float obliczObwod() {
		return obliczDlugoscBoku(punkt1, punkt2) + obliczDlugoscBoku(punkt2, punkt3) + obliczDlugoscBoku(punkt3, punkt4)  + obliczDlugoscBoku(punkt4, punkt1);
	}
	
	@Override
	public float obliczPole() {
		return obliczDlugoscBoku(punkt1, punkt2) * obliczDlugoscBoku(punkt2, punkt3);
	}
	
	@Override
	public boolean equals(Figura figura) {
		//prostokaty sa sobie rowne gdy maja taki sam obwod i pole
		if (obliczPole() == ((Prostokat)figura).obliczPole() && obliczObwod() == ((Prostokat)figura).obliczObwod()){ return true;}
		else {return false;}
	}
}
