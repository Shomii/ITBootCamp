package uredjaji;

public class TestUredjaji {

	public static void main(String[] args) {

		Uredjaj ur1 = new Uredjaj();

		System.out.println(ur1);
		ur1.setStatusUredjaja(true);
		System.out.println(ur1);

		Uredjaj ur2 = new Uredjaj();
		System.out.println(ur2);
		ur2.setStatusUredjaja(true);
		System.out.println(ur2);

		Televizor tv1 = new Televizor("TV1000");

		System.out.println(tv1);
		System.out.println("------------------");
		tv1.setKanal("pink");
		System.out.println("------------------");
		tv1.setStatusUredjaja(true);
		System.out.println(tv1);
		tv1.setKanal("pink");
		System.out.println(tv1);
		
		LapTop lp1 = new LapTop("Intel", 16);

		System.out.println(lp1);
		lp1.setStatusUredjaja(true);
		System.out.println(lp1);

	}

}
