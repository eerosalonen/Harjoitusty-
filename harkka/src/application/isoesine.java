package application;

public class isoesine extends esine{ // Jokaisessa esine tytär luokassa on checki miten eri postiluokat vaikuttavat kuljetuksen lopputulokseen.
	
isoesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
 }
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("Pakettisi on kooltaan "+ this.getkoko() +"m^2 ja kestävä, joten TIMO-mies ei saanut sitä nostettua. "+ this.getnimi() + "selviää matkasta.");
		return "Pakettisi on kooltaan "+ this.getkoko() +"m^2 ja kestävä, joten TIMO-mies ei saanut sitä nostettua. "+ this.getnimi() + "selviää matkasta.";
	}
	else if (l == "2") {
		System.out.println("pakettiisi on todella iso "+ this.getkoko() +"m^2 ja painava "+ this.getpaino() +"kg, joten se ei mahdu TIMO-miehen pakettiautoon. Hän jätti sen lähimmälle kierrätyspisteelle.");
		return "pakettiisi on todella iso "+ this.getkoko() +"m^2 ja painava "+ this.getpaino() +"kg, joten se ei mahdu TIMO-miehen pakettiautoon. Hän jätti sen lähimmälle kierrätyspisteelle.";
	}
	else {
		System.out.println("paketti on ykönen, joten se kulkee kovaa! "+ this.getnimi() + "on perillä alta aikayksikön.");
		return "paketti on ykönen, joten se kulkee kovaa! "+ this.getnimi() + "on perillä alta aikayksikön.";
	}
}
}