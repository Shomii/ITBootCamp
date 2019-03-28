package prevoznaSredstva;

public class TestVozila {

	public static void main(String[] args) {

		Vozilo v = new Vozilo(5);
		System.out.println(v);

		Auto a1 = new Auto(20, 10, "ST 564 JK", 190);
		System.out.println(a1);
		a1.dodajGorivo(50);
		System.out.println(a1);

		Putnik p1 = new Putnik();
		Putnik p2 = new Putnik();
		p1.setImeIPrezime("Pera Peric");
		p2.setImeIPrezime("Mika Mikic");
		Putnik p3 = new Putnik();
		p3.setImeIPrezime("Laza Lazic");
		System.out.println(p1);
		a1.postaviPutnika(p1, 3);
		a1.postaviPutnika(p1, 20);
		a1.postaviPutnika(p1, 3);
		System.out.println(a1);

		Avion av1 = new Avion(250, "85sdfsd2dsf2", "Boing");
		System.out.println(av1);
		av1.dodajGorivo(500);
		av1.postaviPutnika(p2, 20);
		System.out.println(av1);
		av1.postaviPutnika(p3, 80);
		System.out.println(av1);
		av1.ukloniPutnika(p2, 20);
		System.out.println(av1);
	}

}
