import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		Punkt punkt1 = new Punkt(1,8);
		Punkt punkt2 = new Punkt(1, -1.5F);
		Punkt punkt3 = new Punkt(10.5F,-1.5F);
		Punkt punkt4 = new Punkt(10.5F,8);
		Punkt punkt5 = new Punkt(1, 2);
		Punkt punkt6 = new Punkt(10.5F, 2);
		Punkt punktZamocowania = new Punkt(1,1);
		Linia linia = new Linia(punkt1, punkt2, new Color(0, 0, 0), punktZamocowania);
		Linia linia2 = new Linia(punkt1, new Punkt(1, 17.5F), new Color(0, 0, 0), punktZamocowania);
		System.out.println("Czy linie sa sobie rowne?");
		System.out.println(linia.equals(linia2));
		Kolo kolo = new Kolo(punkt1, 3.5F, new Color(255, 255, 255), punktZamocowania);
		System.out.println("Obwod kola: " + kolo.obliczObwod());
		System.out.println("Pole kola: " + kolo.obliczPole());
		Trojkat trojkat = new Trojkat(punkt1, punkt2, punkt3, new Color(157, 32, 50), punktZamocowania);
		Trojkat trojkat2 = new Trojkat(punkt2, punkt1, punkt3, new Color(200, 100, 10), punktZamocowania);
		System.out.println("Czy trojkaty sa sobie rowne?");
		System.out.println(trojkat.equals(trojkat2));
		Prostokat prostokat1 = new Prostokat(punkt1, punkt2, punkt5, punkt6, new Color(255, 255, 255), punktZamocowania);
		System.out.println("Kolor prostokatu po zmianie");
		prostokat1.wypelnijKolorem(100, 100, 100);
		System.out.println(prostokat1.printKolor());
		Prostokat prostokat2 = new Prostokat(punkt1, punkt2, punkt3, punkt4, new Color(200, 200, 200), punktZamocowania);
		System.out.println("Czy prostokaty sa sobie rowne?");
		System.out.println(prostokat1.equals(prostokat2));
		Kwadrat kwadrat = new Kwadrat(punkt1, punkt2, punkt3, punkt4, new Color(1, 2, 3), punktZamocowania);
		Kwadrat kwadrat2 = new Kwadrat(punkt1, punkt4, punkt3, punkt2, new Color(179, 43, 211), punktZamocowania);
		System.out.println("Czy kwadraty sa sobie rowne?");
		System.out.println(kwadrat.equals(kwadrat2));
	}
}
