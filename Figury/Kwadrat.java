import java.awt.Color;

public class Kwadrat extends Prostokat{
	
	public Kwadrat(Punkt punkt1, Punkt punkt2, Punkt punkt3, Punkt punkt4, Color kolor, Punkt punktZamocowania) {
		super(punkt1, punkt2, punkt3, punkt4, kolor, punktZamocowania);
	}
	
	@Override
	public String toString() {
		return "Oto kwadrat o wierzcho³kach: " + punkt1.toString() + ", " + punkt2.toString() + ", " + punkt3.toString() + ", " + punkt4.toString() +". Jego kolor to " + printKolor();
	}
	
	@Override
	public boolean equals(Figura figura) {
		if (obliczObwod() == ((Kwadrat)figura).obliczObwod()){ return true;}
		else {return false;}
	}
}
