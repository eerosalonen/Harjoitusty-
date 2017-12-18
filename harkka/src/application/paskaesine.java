package application;

public class paskaesine extends esine{// Jokaisessa esine tyt‰r luokassa on checki miten eri postiluokat vaikuttavat kuljetuksen lopputulokseen.
paskaesine(float p, float k, boolean a, boolean b,String c){
	super(p, k, a, b, c);
	
	}
public String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("TIMO-mies laittoi "+ this.getnimi() + "-pakettisi halki poikki ja pinoon. Voit k‰yd‰ raapimassa " +this.getpaino()+ "kg "+this.getnimi()+"a varaston seinilt‰.");
		return "TIMO-mies laittoi "+ this.getnimi() + "-pakettisi halki poikki ja pinoon. Voit k‰yd‰ raapimassa " +this.getpaino()+ "kg "+this.getnimi()+"a varaston seinilt‰.";
	}
	else if (l == "2") {
		System.out.println("Pakettisi on  t‰ysin kuljetukelvoton, joten TIMO-mies p‰‰tti ottaa "+ this.getnimi() + "parempaan talteen.");
		return "Pakettisi on  t‰ysin kuljetukelvoton, joten TIMO-mies p‰‰tti ottaa "+ this.getnimi() + "parempaan talteen.";
	}
	else {
		System.out.println("Pakettisi on  t‰ysin kuljetukelvoton, joten kiireinen TIMO-mies ei ehtinyt j‰‰d‰ sit‰ katselemaan, vaan j‰tti sen l‰himm‰lle kierr‰tyspisteelle.");
		return "Pakettisi on  t‰ysin kuljetukelvoton, joten kiireinen TIMO-mies ei ehtinyt j‰‰d‰ sit‰ katselemaan, vaan j‰tti sen l‰himm‰lle kierr‰tyspisteelle.";
	}
}
}