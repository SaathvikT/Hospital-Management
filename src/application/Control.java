package application;


import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Control implements Initializable{
    
	
	 @FXML
	    private JFXTimePicker time;

	    @FXML
	    private JFXRadioButton ortho;

	    @FXML
	    private JFXRadioButton pulmo;

	    @FXML
	    private JFXRadioButton pedia;

	    @FXML
	    private DatePicker date;

	
    @FXML
    private Pane pane1,patientPane,docPane;
    
    @FXML
    private AnchorPane imagePane;
    
    @FXML
    private Pane doctorPane;
    
    @FXML
    private Pane LoginPane1;


    @FXML
    private Pane pane2,pane3,pane4;
    
    
    
    
    @FXML
    private JFXTextField tf1;

    @FXML
    private JFXPasswordField pass1;

    @FXML
    private Label label1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		translateAnimation(0.5, docPane, 750);
		translateAnimation(0.5, LoginPane1, 750);
		translateAnimation(0.5, doctorPane, 750);
		translateAnimation(0.5, patientPane, 750);
		translateAnimation(0.5, imagePane, 750);
		backgroundAnime();
		
	}

	
	
	private void backgroundAnime() {
		// TODO Auto-generated method stub
		FadeTransition tr = new FadeTransition(Duration.seconds(3),pane4);
		tr.setFromValue(1);
		tr.setToValue(0);
		tr.play();
		
		tr.setOnFinished(e -> {
			FadeTransition tr1 = new FadeTransition(Duration.seconds(3),pane3);
			tr1.setFromValue(1);
			tr1.setToValue(0);
			tr1.play();
			
			tr1.setOnFinished(ev -> {
				FadeTransition tr2 = new FadeTransition(Duration.seconds(3),pane2);
				tr2.setFromValue(1);
				tr2.setToValue(0);
				tr2.play();
				
				tr2.setOnFinished(eve -> {
					FadeTransition tr3 = new FadeTransition(Duration.seconds(3),pane2);
					tr3.setToValue(1);
					tr3.setFromValue(0);
					tr3.play();
					
					tr3.setOnFinished(even -> {
						FadeTransition tr4 = new FadeTransition(Duration.seconds(3),pane3);
						tr4.setToValue(1);
						tr4.setFromValue(0);
						tr4.play();
						
						tr4.setOnFinished(event -> {
							FadeTransition tr5 = new FadeTransition(Duration.seconds(3),pane4);
							tr5.setToValue(1);
							tr5.setFromValue(0);
							tr5.play();
							
							tr5.setOnFinished(event1 -> {
								backgroundAnime();});
						});
					});
				});
			});
		});
		
	}
	@FXML
	void btnAction(ActionEvent event){
		
	    	if(tf1.getText().equals("sathvik") && pass1.getText().equals("12345")){
	    		translateAnimation(0.5, LoginPane1,-750);}
	    	
	    	else if(tf1.getText().equals("DOCsathvik") && pass1.getText().equals("12345")){
	    		translateAnimation(0.5, docPane,-750);}
			
			else if(tf1.getText()!="" || pass1.getText()!=""){
				label1.setText("Invalid Username or Password");
			}
			else
				label1.setText("Invalid Username or Password");
	   tf1.clear();
	   pass1.clear();
		
	}
	 @FXML
	    void hyperAction1(ActionEvent event) {
          TranslateTransition translate1 = new TranslateTransition(Duration.seconds(0.5),imagePane);
          translate1.setByX(-750);
          translate1.play();
	 }
	  @FXML
	    void arrowAction(MouseEvent event) {
		  TranslateTransition translate2 = new TranslateTransition(Duration.seconds(0.5),imagePane);
          translate2.setByX(750);
          translate2.play();  
	    }
	  public void translateAnimation(double duration,Node node,double byx){
	    	TranslateTransition tr = new TranslateTransition(Duration.seconds(duration),node);
	    	tr.setByX(byx);
	    	tr.play();
}
	  @FXML
	    void patientAction(ActionEvent event) {
		  translateAnimation(1.5, patientPane, -750);
	    }
	  
	  @FXML
	    void doctorAction(ActionEvent event) {
		  translateAnimation(1.5, doctorPane, -750);
	    }
	  
	  @FXML
	    void arrowAction2(MouseEvent event) {
		  TranslateTransition translate2 = new TranslateTransition(Duration.seconds(0.5),patientPane);
        translate2.setByX(750);
        translate2.play();  
	    }
	  
	  @FXML
	    void arrowAction3(MouseEvent event) {
		  TranslateTransition translate3 = new TranslateTransition(Duration.seconds(0.5),doctorPane);
	        translate3.setByX(750);
	        translate3.play();
	    }
	  
	  @FXML
	    void logout1(ActionEvent event) {
		  translateAnimation(0.5, LoginPane1, 750);
	    }
	  
	  @FXML
	    void confirmbtn(ActionEvent event) {
             date.setValue(null);
             time.setValue(null);
            
	    }
	  
	  @FXML
	    void logout2(ActionEvent event) {
		  translateAnimation(0.5, docPane, 750);
	    }
    
   
    }

