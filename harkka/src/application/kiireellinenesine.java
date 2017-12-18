package application;

public class kiireellinenesine extends esine{// Jokaisessa esine tyt‰r luokassa on checki miten eri postiluokat vaikuttavat kuljetuksen lopputulokseen.
kiireellinenesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
	}
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println(this.nimi + "-paketillasi on kiire, mutta TIMO-mies on viel‰ paiskomassa sit‰ ymp‰ri varaston seini‰, vaikka j‰rjest‰miisi " + this.getnimi() + " juhliin on vain muutama tunti." );
			return this.nimi + "-paketillasi on kiire, mutta TIMO-mies on viel‰ paiskomassa sit‰ ymp‰ri varaston seini‰, vaikka j‰rjest‰miisi " + this.getnimi() + " juhliin on vain muutama tunti." ;
	}
	else if (l == "2") {
		System.out.println(this.nimi + "-paketillasi on kiire, mutta TIMO-miehill‰ ei. Kuljetusmies istuu viel‰ matkan ensimm‰isell‰ teboililla kahvilla, vaikka j‰rjest‰miisi " + this.getnimi() + " juhliin on vain muutama tunti.");
			return this.nimi + "-paketillasi on kiire, mutta TIMO-miehill‰ ei. Kuljetusmies istuu viel‰ matkan ensimm‰isell‰ teboililla kahvilla, vaikka j‰rjest‰miisi " + this.getnimi() + " juhliin on vain muutama tunti.";
	}
	else {
		System.out.println("Kiireellinen pakettisi saapuu ajallaan, Ja nopeammin kun osasit odottaakkaan TIMO-mies heit‰‰ " + this.getnimi() + " pakettisi ikkunastasi sis‰‰n.");
			return "Kiireellinen pakettisi saapuu ajallaan, Ja nopeammin kun osasit odottaakkaan TIMO-mies heit‰‰ " + this.getnimi() + " pakettisi ikkunastasi sis‰‰n.";
	}
}
}
