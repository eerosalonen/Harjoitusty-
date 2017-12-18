package application;

public abstract class esine { // Abstracti luokka esineille, jossa on perus funktiot sun muut.

	protected String nimi;
	protected boolean sarkyva;
	protected boolean suuruus;
	protected boolean kiireellisyys;	
	protected float paino;
	protected float koko;
	
public esine(float p, float k, boolean a, boolean b,String c) {
	paino = p;
	koko = k;
	kiireellisyys = a;
	sarkyva = b;
	nimi=c;
	System.out.println("esine luotu");
}
	public float getpaino() {
		return paino;
}
	public float getkoko() {
		return koko;
	}
	public String getnimi() {
		return nimi;
}
protected void puhu() {
	System.out.println(nimi+ " lähti matkaan!!");
}
@Override
public String toString() {
	return nimi;
}
protected String luokkacheck(String l) {
	if (l == "3") {
		System.out.println("paketti on kolmonen");
		return "paketti on kolmonen";
	}
	else if (l == "2") {
		System.out.println("paketti on kakonen");
		return "paketti on kakonen";
	}
	else {
		System.out.println("paketti on ykönen");
		return "paketti on ykkönen";
}
}}