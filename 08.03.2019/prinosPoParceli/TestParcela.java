package prinosPoParceli;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestParcela {

	public static void main(String[] args) {

		/*
		 * Napisati i glavni program koji kreira niz parcela koje mogu da budu ili šume
		 * ili njive i ispisuje njihov prinos u toku 3 godine.
		 */

		/* ----- Lista -------*/
//		List<Parcela> nizParcela = new ArrayList<Parcela>();
	
//		for (int i = 0; i < 5; i++) {
//			double random = Math.random();
//			if (random > 0.5) {
//				Parcela p = new Suma(getRandom(100, 800), 'S', getRandom(100, 800), getRandom(5, 10), 7, 3);
//				nizParcela.add(p);
//				p.izracunajPrinos();
//				System.out.println(p);
//			} else {
//				Njiva n = new Njiva(getRandom(100, 800), 'N', getRandom(5, 15));
//				nizParcela.add(n);
//				n.setPrinos(n.izracunajPrinosZaGodine(3));
//				System.out.println(n);
//			}
//		}
//			System.out.println(nizParcela);

		Parcela[] nizParcela2 = new Parcela[5];
		
		for (int i = 0; i < nizParcela2.length; i++) {
			double random = Math.random();
			if (random > 0.5) {
				Parcela p = new Suma(getRandom(100, 800), 'S', getRandom(100, 800), getRandom(5, 10), 7, 3);
				nizParcela2[i] = p;
				p.izracunajPrinos();
			} else {
				Njiva n = new Njiva(getRandom(100, 800), 'N', getRandom(5, 15));
				nizParcela2[i] = n;
				n.setPrinos(n.izracunajPrinosZaGodine(3));
			}
		}
		
		for (int i = 0; i < nizParcela2.length; i++) {
			System.out.println(nizParcela2[i]);
		}
	}

	public static double getRandom(double min, double max) {
		return (Math.random() * (max + 1 - min)) + min;
	}
}
