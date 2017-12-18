package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class controller{
private String luokka;
static private controller v = null;

static public controller getinstance() {
	if (v == null) {
		v = new controller();
		return v;}
	else {
		return v;
}		
}
@FXML
private CheckBox luokka1check ;
@FXML
private Button karttabutton;
@FXML
private CheckBox luokka2check ;
@FXML
private CheckBox luokka3check ;
@FXML
private TextField lahtotextbox ;
@FXML
private TextField paatetextbox ;
@FXML
private Tab postitab ;
@FXML
private ComboBox<esine> pakettivalitsin ;
@FXML
private Button lahetanappi ;
@FXML
private Button paatepistebutton ;
@FXML
private TextArea textarea1 ;
@FXML
private TextArea textarea2 ;
@FXML
private ComboBox<String> mista ;
@FXML
private ComboBox<String> mihin ;
@FXML
private Button varastoibutton ;
@FXML
private TextField esinenimifield ;
@FXML
private CheckBox sarkyvacheckbox ;
@FXML
private CheckBox kiireellinencheckbox ;
@FXML
private ComboBox<esine> varastonesineet ;
@FXML
private TextField painofield ;
@FXML
private TextField kokofield ;

public void rekisteroipaketti(ActionEvent event) { // Action event ottaa UI:sta tiedot ja luo niista esine olion varastoon.
	varasto.getinstance().luopaketti(Float.parseFloat(painofield.getText()) , Float.parseFloat(kokofield.getText()), kiireellinencheckbox.isSelected(), sarkyvacheckbox.isSelected(), esinenimifield.getText());

	pakettivalitsin.getItems().add(varasto.getinstance().getesine(esinenimifield.getText()));
	esinenimifield.clear();
	painofield.clear();
	kokofield.clear();
	textarea1.setText("Pakettisi on rekisteröity!");
}
@FXML
public void paatepistebutton(ActionEvent event) {// Ottaa UI:sta päätepisteet ja tallentaa niitten nimet.
	if (lahtotextbox.getText() == null || lahtotextbox.getText().isEmpty() || paatetextbox.getText() == null || paatetextbox.getText().isEmpty()  ) {		
		System.out.println("Täytä kaikki vaaditut kohdat.");
		textarea1.setText("Täytä kaikki vaaditut kohdat.");

		
} else { 
	posti.getinstance().addpaatepiste(lahtotextbox.getText());
	posti.getinstance().addpaatepiste(paatetextbox.getText());
	mista.getItems().add(lahtotextbox.getText());
	mista.getItems().add(paatetextbox.getText());
	mihin.getItems().add(lahtotextbox.getText());
	mihin.getItems().add(paatetextbox.getText());
	lahtotextbox.clear();
	paatetextbox.clear();
	textarea1.setText("Päätepisteesi on rekisteröity!");
	
}
}
@FXML
private void boxvalinta1() {
	if (luokka1check.isSelected()) {
		luokka2check.setSelected(false);
		luokka3check.setSelected(false);
	}
}
@FXML
private void boxvalinta2() {
	if (luokka2check.isSelected()) {
		luokka1check.setSelected(false);
		luokka3check.setSelected(false);
	}
}
@FXML
private void boxvalinta3() {
	if (luokka3check.isSelected()) {
		luokka2check.setSelected(false);
		luokka1check.setSelected(false);
	}
}

@FXML
private void combotiedot(ActionEvent event) { // Paketin lähetys, joka tarkistaa paketin luokan ja mitä sille kuljetuksessa käy.
	if (luokka3check.isSelected()) {
		luokka = "3";
		String g =pakettivalitsin.valueProperty().getValue().luokkacheck(luokka);
		textarea2.setText(g);
	}
	else if (luokka2check.isSelected()) {
		luokka = "2";
		String g =pakettivalitsin.valueProperty().getValue().luokkacheck(luokka);
		textarea2.setText(g);
	}
	else {
		luokka = "1";
		String g =pakettivalitsin.valueProperty().getValue().luokkacheck(luokka);
		textarea2.setText(g);
	}
	pakettivalitsin.valueProperty().getValue().puhu();

	
	String teksti1 = mista.getValue();
	String teksti2 = mihin.getValue();
	System.out.println(teksti1);
	tiedonvalittaja g = new tiedonvalittaja(teksti1 , teksti2 , luokka); //Paketin tärkeät tiedot siirretään toiselle controllerille. 
	posti.getinstance().addvalitys(g); 
	
	pakettivalitsin.getSelectionModel().clearSelection();
	pakettivalitsin.getItems().clear();
	mista.getSelectionModel().clearSelection();
	mista.getItems().clear();
	mihin.getSelectionModel().clearSelection();
	mihin.getItems().clear();
}
@FXML
public void startkartta(ActionEvent event) { // perus pätkä joka avaa webview ikkunan.
	Stage webview = new Stage();
	try {
		Parent page = FXMLLoader.load(getClass().getResource("kartta.fxml"));
		Scene scene = new Scene (page);
		webview.setScene(scene);
		webview.show();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}




