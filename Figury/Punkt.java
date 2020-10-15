public class Punkt {
	private float x;
	private float y;
	static int iloscPunktow;
	
	public Punkt(float x,float y) {
		this.x = x;
		this.y = y;
		wypiszPunkt();
	}
	//metoda zwi�kszaj�ca statyczn� zmienn� 'iloscPunktow' indeksujaca kazdy stworzony punkt
	void wypiszPunkt() {
		iloscPunktow++;
		System.out.println("Wsp�rz�dne punktu numer " + iloscPunktow + ": x: " + x + ", y: " + y);
	}
	
	public String toString() {
		return "(" + Float.toString(this.x) + ", " + Float.toString(this.y) + ")";
	}
	
	public float getX() {return x;}
	
	public void setX(float x) {this.x = x;}
	
	public float getY() {return y;}
	
	public void setY(float y) {this.y = y;}
}
