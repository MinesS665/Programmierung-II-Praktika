public class Konto {

	double money = 500;
	
	public void einzahlen(double betrag) throws UngueltigerBetragException {
		money += betrag;
		System.out.println(money);
	}
	public void abheben(double betrag) throws UngueltigerBetragException {
		
		if (betrag > money) {
			throw new UngueltigerBetragException();
		}
		
		money -= betrag;
		System.out.println(money);
	}
	
}
