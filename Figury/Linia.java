import java.awt.Color;

public class Linia extends Figura{
	Punkt punkt1;
	Punkt punkt2;
	
	public Linia(Punkt punkt1, Punkt punkt2, Color kolor, Punkt punktZamocowania) {
		super(2, kolor, punktZamocowania);
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Oto linia rozpoczynaj¹ca siê punkcie " + punkt1.toString() + " oraz koñcz¹ca siê w punkcie " + punkt2.toString() + ". Jej kolor to " + printKolor();
	}
	
	public float dlugoscLini() {
		return (float)(Math.pow(Math.pow((punkt2.getX() - punkt1.getX()), 2) + Math.pow((punkt2.getY() - punkt1.getY()), 2),0.5));
	}
	
	@Override
	public boolean equals(Figura figura) {
		if (dlugoscLini() == ((Linia)figura).dlugoscLini()){ return true;}
		else {return false;}
	}
}
