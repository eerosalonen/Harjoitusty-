package application;

public class sarkyvaesine extends esine {

sarkyvaesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
}
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("Pakettisi on s�rkyv�, joten miksi ihmeess� valitsit kolmosen? Pystyt tuskin tunnistamaan oliko paketissasi " + this.getnimi() + " vai teollisuusj�tett�.");
		return "Pakettisi on s�rkyv�, joten miksi ihmeess� valitsit kolmosen? Pystyt tuskin tunnistamaan oliko paketissasi " + this.getnimi() + " vai teollisuusj�tett�.";
	}
	else if (l == "2") {
		System.out.println("Pakettisi on s�rkyv�, joten 2. luokka oli oikea valinta. Onneksi pakettisi oli kooltaan vain " + this.getkoko() +"m^2, jolloin se pysyi hyvin kiinni matkan aikana.");
		return "Pakettisi on s�rkyv�, joten 2. luokka oli oikea valinta. Onneksi pakettisi oli kooltaan vain " + this.getkoko() +"m^2, jolloin se pysyi hyvin kiinni matkan aikana.";
	}
	else {
		System.out.println("Pakettisi sis�ll�st� on j�ljell� vain murenoita, mutta ainakin sait murenasi enn�tysvauhdilla.");
		return "Pakettisi sis�ll�st� on j�ljell� vain murenoita, mutta ainakin sait murenasi enn�tysvauhdilla.";
	}
}
}

