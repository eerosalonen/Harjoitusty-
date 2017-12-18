package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class controller2 implements Initializable {
	static private controller2 v = null;

	static public controller2 getinstance() {
		if (v == null) {
			v = new controller2();
			return v;}
		else {
			return v;}
	}
	private String script1;
	private String script2;
	private String city1;
	private String osoite1;
	private String tiedot1;
	private String code1;
	private float lat1;
	private float lang1;
	private String city2;
	private String osoite2;
	private String tiedot2;
	private String code2;
	private float lat2;
	private float lang2;
	
	@FXML
	private Button paatenappi;
	@FXML
	private  WebView karttawv;
	@FXML
	private  WebEngine mapengine;
	@FXML
	private Button latausnappi;
	@FXML
	private Button piirtobutton;
	@FXML
	private Button clearbutton;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) { // Lataa index.html tiedoston kartan. 
		// TODO Auto-generated method stub
		mapengine = karttawv.getEngine();
		Class<?> getc = getClass();
		URL res = getc.getResource("index.html");
		System.out.println(res);
		String urli = res.toExternalForm();
		mapengine.load(urli);
	}
	@FXML
	public void tiepiirto(ActionEvent event) {
		
		city1 = posti.getinstance().valityslista.get(0).getvalitys1(); // L‰hetyksen tiedot haetaan v‰litt‰j‰st‰.
		String luokka = posti.getinstance().valityslista.get(0).getvalitys2();		
		city2 = posti.getinstance().valityslista.get(0).getvalitys3();
		
		ArrayList<Float> sijainti = new ArrayList<>();
		
		lat1 = Float.parseFloat(xmlkasittelija.getinstance().searchlahto(city1).getlat().replaceAll("\r", "").replaceAll("\n", "")); 
		lang1 = Float.parseFloat(xmlkasittelija.getinstance().searchlahto(city1).getlang().replaceAll("\r", "").replaceAll("\n", ""));
		// Haku funktio hakee xml tiedostosta koordinaatit kaupungin nimen mukaan jonka j‰lkeen ne liitet‰‰n piirto funktioon.
		lat2 = Float.parseFloat(xmlkasittelija.getinstance().searchlahto(city2).getlat().replaceAll("\r", "").replaceAll("\n", ""));
		lang2 = Float.parseFloat(xmlkasittelija.getinstance().searchlahto(city2).getlang().replaceAll("\r", "").replaceAll("\n", ""));
		
		
		sijainti.add(lat1);
		sijainti.add(lang1);
		sijainti.add(lat2);
		sijainti.add(lang2);
		
		//script2 = "document.createpath"+ sijainti +", 'red', 1)";
		karttawv.getEngine().executeScript("document.createPath("+ sijainti +", 'red', " + luokka + ")");
		posti.getinstance().erasevalitys();
	}//"document.goToLocation('Skinnarilankatu 34,53850 Lappeenranta',"+"'"+ tiedot +"'"+ ",'blue')";
	@FXML
	public void piirto(ActionEvent Event) { //l‰htˆ ja m‰‰r‰np‰‰ kaupungin tiedot haetaan xml tiedostosta v‰litetyn kaupungin nimen mukaan, ja n‰m‰ tiedot liitet‰‰n kartta funktioon jolloin pisteet ilmestyv‰t kartalle)
		city1 = posti.getinstance().valityslista.get(0).getvalitys1().replaceAll("\r", "").replaceAll("\n", "");;
		tiedot1 = xmlkasittelija.getinstance().searchlahto(city1).getavailability().replaceAll("\r", "").replaceAll("\n", "");;
		osoite1 = xmlkasittelija.getinstance().searchlahto(city1).getaddress().replaceAll("\r", "").replaceAll("\n", "");;
		code1 = xmlkasittelija.getinstance().searchlahto(city1).getcode().replaceAll("\r", "").replaceAll("\n", "");;
		
		city2 = posti.getinstance().valityslista.get(0).getvalitys3().replaceAll("\r", "").replaceAll("\n", "");;
		tiedot2 = xmlkasittelija.getinstance().searchlahto(city2).getavailability().replaceAll("\r", "").replaceAll("\n", "");;
		osoite2 = xmlkasittelija.getinstance().searchlahto(city2).getaddress().replaceAll("\r", "").replaceAll("\n", "");;
		code2 = xmlkasittelija.getinstance().searchlahto(city2).getcode().replaceAll("\r", "").replaceAll("\n", "");;
		
		script1 = "document.goToLocation(" + "'" + osoite1 + ", "+ code1 +" "+ city1 +"',"+"'"+ tiedot1 +"'"+ ",'blue')";
		System.out.println(script1);
		script2 = "document.goToLocation(" + "'" + osoite2 + ", "+ code2 +" "+ city2 +"',"+"'"+ tiedot2 +"'"+ ",'green')";
		System.out.println(script2);
		karttawv.getEngine().executeScript(script1);
		
		
		karttawv.getEngine().executeScript(script2);

	}
	@FXML // Tien poisto funktio.
	public void clearaction(ActionEvent Event) {
		karttawv.getEngine().executeScript("document.deletePaths()");
		
	}
}