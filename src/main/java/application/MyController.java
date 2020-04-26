package application;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class MyController implements Initializable {
	
	@FXML
	private VBox root;
	
	@FXML
	private BorderPane root2;
    
	@FXML
	private Button doneButton;
	
	@FXML
	private Button extraShotButton;
	
	@FXML
	private Button creamButton;
	
	@FXML
	private Button sugarButton;
	
	@FXML
	private Button mochaButton;
	
	@FXML
	private Button caramelButton;
	
	@FXML
	private Button deleteOrderButton;
	
	@FXML
	private Button newOrderButton;
	
	@FXML
	private Button startButton;
	

	
	
    //static so each instance of controller can access to update 
	ArrayList<Double> totalPrice = new ArrayList<Double>();
	Double blackCoffee = 3.99;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
		startButton.setTranslateX(100);
		startButton.setTranslateY(100);
		startButton.setTextFill(Color.BLACK);
		
		 
		doneButton.setDisable(true);
		doneButton.setTranslateX(100);
		doneButton.setTranslateY(100);
		
		extraShotButton.setDisable(true);
		extraShotButton.setTranslateX(100);
		extraShotButton.setTranslateY(100);
		
		creamButton.setDisable(true);
		creamButton.setTranslateX(100);
		creamButton.setTranslateY(100);
		
		sugarButton.setDisable(true);
		sugarButton.setTranslateX(100);
		sugarButton.setTranslateY(100);
		
		caramelButton.setDisable(true);
		caramelButton.setTranslateX(100);
		caramelButton.setTranslateY(100);
		
		mochaButton.setDisable(true);
		mochaButton.setTranslateX(100);
		mochaButton.setTranslateY(100);
		
		newOrderButton.setDisable(true);
		newOrderButton.setTranslateX(100);
		newOrderButton.setTranslateY(100);
		
		deleteOrderButton.setDisable(true);
		deleteOrderButton.setTranslateX(100);
		deleteOrderButton.setTranslateY(100);

	}

	
	//method to add shots
	public void startMethod(ActionEvent e) throws IOException 
	{	
		buttonDiabler(false);
		
		newOrderButton.setDisable(true);
		doneButton.setDisable(false);
		startButton.setDisable(true);
		deleteOrderButton.setDisable(false);
		
		
		System.out.println("Welcome to starbucks \n\nBlack coffee: $" + blackCoffee);
		System.out.println("   Add your toppings:");
		totalPrice.add(3.99);
	}
	
	
	//method to add shots
	public void extraShotMethod(ActionEvent e) throws IOException 
	{	
		Double extraShot = 1.20;
		totalPrice.add(1.20);
		System.out.println("     extra shot added: $" + extraShot);	
	}
	
	//method to add cream
	public void creamMethod(ActionEvent e) throws IOException 
	{
		Double creamPriceDouble = 0.50;
		totalPrice.add(creamPriceDouble);
		System.out.println("     cream added: $" + creamPriceDouble);
	}
	
	//method to add sugar
	public void sugarMethod(ActionEvent e) throws IOException 
	{
		Double sugarPriceDouble = 0.50;
		totalPrice.add(sugarPriceDouble);
		System.out.println("     sugar added: $" + sugarPriceDouble);
	}
	
	//method to add mocha swirl
	public void mochaSwirlMethod(ActionEvent e) throws IOException 
	{
		Double mochaDouble = 1.20;
		totalPrice.add(mochaDouble);
		System.out.println("     mocha swirl added: $" + mochaDouble);
	}
	
	//method to add caramel swirl
	public void caramelSwirlMethod(ActionEvent e) throws IOException 
	{
		Double caraDouble = 1.00;
		totalPrice.add(caraDouble);
		System.out.println("     caramel swirl added: $" + caraDouble); 
	}
	
	//Done ordering
	public void doneMethod(ActionEvent e) throws IOException 
	{
		Double sumDouble = 0.0;
		
		
		for(Double totalPriceDouble : totalPrice)
		{
			sumDouble += totalPriceDouble;  
		}
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("\nCost of your coffee is: $" + df.format(sumDouble));
		
		buttonDiabler(true);
		newOrderButton.setDisable(false);
		deleteOrderButton.setDisable(true);
		
	}
	
	public void newOrderMethod(ActionEvent e) throws IOException 
	{
		buttonDiabler(false);
		System.out.println("\nStarting new order...");
		totalPrice.clear();
		System.out.println("\nNEW ORDER \nBlack coffee: $" + blackCoffee);
		System.out.println("   Add your toppings:");
		totalPrice.add(3.99);
		newOrderButton.setDisable(true);
	
		 
	} 
	
	public void deleteOrderMethod(ActionEvent e) throws IOException 
	{
		buttonDiabler(false);
		System.out.println("\nDeleting order...");
		
		
		totalPrice.clear();
		System.out.println("\nNEW ORDER \nBlack coffee: $" + blackCoffee);
		System.out.println("   Add your toppings:");
		totalPrice.add(3.99);
		 
	} 
	
	
	public void buttonDiabler(Boolean bool) 
	{
		doneButton.setDisable(bool);	
		extraShotButton.setDisable(bool);
		creamButton.setDisable(bool);
		sugarButton.setDisable(bool);
		caramelButton.setDisable(bool);
		mochaButton.setDisable(bool);
	}
	
	
}
