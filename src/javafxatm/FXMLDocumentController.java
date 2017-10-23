package javafxatm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class FXMLDocumentController  implements Initializable{
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int temp;
    
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonc;

    @FXML
    private Button button0;

    @FXML
    private Button buttonok;

    @FXML
    private PasswordField edditPin;

    @FXML
    void pin(ActionEvent event) {

    }

    @FXML
    void tekan0(ActionEvent event) {
         pin +="0";
        edditPin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin +="1";
        edditPin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin +="2";
        edditPin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin +="3";
        edditPin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin +="4";
        edditPin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin +="5";
        edditPin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin +="6";
        edditPin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin +="7";
        edditPin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin +="8";
        edditPin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin +="9";
        edditPin.setText(pin);
    }

    @FXML
    void tekanc(ActionEvent event) {
        pin ="";
        edditPin.setText(pin);

    }

    @FXML
    void tekanok(ActionEvent event) {
if (pin.equals(PIN)){
            try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene (fxmlLoader.load(),830,450);
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch (IOException e){
            System.out.println("Failed to Create new Window." + e);
            }
          }else {
                kesempatan -= 1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan + " kesempatan lagi");
                edditPin.setText("");
                pin = "";
                if (kesempatan == 0 ){
                    System.exit(0);
    }

}}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
