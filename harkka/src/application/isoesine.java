package application;

public class isoesine extends esine{ // Jokaisessa esine tyt�r luokassa on checki miten eri postiluokat vaikuttavat kuljetuksen lopputulokseen.
	
isoesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
 }
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("Pakettisi on kooltaan "+ this.getkoko() +"m^2 ja kest�v�, joten TIMO-mies ei saanut sit� nostettua. "+ this.getnimi() + "selvi�� matkasta.");
		return "Pakettisi on kooltaan "+ this.getkoko() +"m^2 ja kest�v�, joten TIMO-mies ei saanut sit� nostettua. "+ this.getnimi() + "selvi�� matkasta.";
	}
	else if (l == "2") {
		System.out.println("pakettiisi on todella iso "+ this.getkoko() +"m^2 ja painava "+ this.getpaino() +"kg, joten se ei mahdu TIMO-miehen pakettiautoon. H�n j�tti sen l�himm�lle kierr�tyspisteelle.");
		return "pakettiisi on todella iso "+ this.getkoko() +"m^2 ja painava "+ this.getpaino() +"kg, joten se ei mahdu TIMO-miehen pakettiautoon. H�n j�tti sen l�himm�lle kierr�tyspisteelle.";
	}
	else {
		System.out.println("paketti on yk�nen, joten se kulkee kovaa! "+ this.getnimi() + "on perill� alta aikayksik�n.");
		return "paketti on yk�nen, joten se kulkee kovaa! "+ this.getnimi() + "on perill� alta aikayksik�n.";
	}
}
}