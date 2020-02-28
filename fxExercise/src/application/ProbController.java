package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ProbController implements Initializable{
@FXML
private TextField inputButton;
@FXML
private TextField outputButton;
@FXML
private void DisplayCountLetters(ActionEvent event) {
	String input=inputButton.getText();
	int count=input.length();
	outputButton.setText(String.valueOf(count));
	
}
@FXML
private void DisplayReverseLetters(ActionEvent event) {
	 StringBuilder strb= new StringBuilder(inputButton.getText());
	 StringBuilder rvrs = strb.reverse();
	outputButton.setText(rvrs.toString());	
	
}
@FXML
private void RemoveDuplicateLetters(ActionEvent event) {
	 String input = inputButton.getText();
	 String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
		outputButton.setText(result);	
	}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}

}
