import java.awt.Color;

public class Kolo extends Figura implements WypelnijKolorem, ObliczPoleIObwod{
	private Punkt punkt1;
	private float promien;
	
	public Kolo(Punkt punkt1, float promien, Color kolor, Punkt punktZamocowania) {
		super(1, kolor, punktZamocowania);
		this.punkt1 = punkt1;
		this.promien = promien;
		toString();
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Oto ko³o o œrodku w punkcie " + punkt1.toString() + " oraz o promieniu " + Float.toString(promien) + ". Jego kolor to " + printKolor();
	}
	
	@Override
	public void wypelnijKolorem(int red, int green, int blue) {
		setKolor(new Color(red, green, blue));
	}
	
	@Override
	public float obliczObwod() {
		//2*pi*r
		return (float)(2 * promien * Math.PI);
	}
	
	@Override
	public float obliczPole() {
		//pi*r^2
		return (float)(Math.PI * Math.pow(promien, 2));
	}

	@Override
	public boolean equals(Figura figura) {
		//2 kola sa rowne gdy maja takie same promienie
		if (getPromien() == ((Kolo)figura).getPromien() ){ return true;}
		else {return false;}
	}
	
	public float getPromien() {return promien;}
	
	public void setPromien(float promien) {this.promien = promien;}
}
