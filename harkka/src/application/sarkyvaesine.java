package application;

public class sarkyvaesine extends esine {

sarkyvaesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
}
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("Pakettisi on särkyvä, joten miksi ihmeessä valitsit kolmosen? Pystyt tuskin tunnistamaan oliko paketissasi " + this.getnimi() + " vai teollisuusjätettä.");
		return "Pakettisi on särkyvä, joten miksi ihmeessä valitsit kolmosen? Pystyt tuskin tunnistamaan oliko paketissasi " + this.getnimi() + " vai teollisuusjätettä.";
	}
	else if (l == "2") {
		System.out.println("Pakettisi on särkyvä, joten 2. luokka oli oikea valinta. Onneksi pakettisi oli kooltaan vain " + this.getkoko() +"m^2, jolloin se pysyi hyvin kiinni matkan aikana.");
		return "Pakettisi on särkyvä, joten 2. luokka oli oikea valinta. Onneksi pakettisi oli kooltaan vain " + this.getkoko() +"m^2, jolloin se pysyi hyvin kiinni matkan aikana.";
	}
	else {
		System.out.println("Pakettisi sisällöstä on jäljellä vain murenoita, mutta ainakin sait murenasi ennätysvauhdilla.");
		return "Pakettisi sisällöstä on jäljellä vain murenoita, mutta ainakin sait murenasi ennätysvauhdilla.";
	}
}
}

