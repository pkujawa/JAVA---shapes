import java.awt.Color;

public class Trojkat extends Figura implements WypelnijKolorem, ObliczPoleIObwod{
	Punkt punkt1;
	Punkt punkt2;
	Punkt punkt3;
	
	public Trojkat(Punkt punkt1, Punkt punkt2, Punkt punkt3, Color kolor, Punkt punktZamocowania) {
		super(3, kolor, punktZamocowania);
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
		this.punkt3 = punkt3;
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Oto trójk¹t o wierzcho³kach: " + punkt1.toString() + ", " + punkt2.toString() + ", " + punkt3.toString() + ". Jego kolor to " + printKolor();
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
		return obliczDlugoscBoku(punkt1, punkt2) + obliczDlugoscBoku(punkt2, punkt3) + obliczDlugoscBoku(punkt3, punkt1);
	}
	
	@Override
	public float obliczPole() {
		float p = obliczObwod()/2;
		float a = obliczDlugoscBoku(punkt1, punkt2);
		float b = obliczDlugoscBoku(punkt2, punkt3);
		float c = obliczDlugoscBoku(punkt3, punkt1);
		return (float)(Math.pow((p*(p-a)*(p-b)*(p-c)), 0.5));
	}
	
	@Override
	public boolean equals(Figura figura) {
		if (obliczPole() == ((Trojkat)figura).obliczPole() && obliczObwod() == ((Trojkat)figura).obliczObwod()){ return true;}
		else {return false;}
	}
}
