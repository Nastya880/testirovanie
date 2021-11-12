package main.test.ru.miet.testing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import main.java.ru.miet.testing.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import com.sun.tools.javac.util.Context;
//import com.sun.tools.javac.util.Name.Table;

public class MyStepdefs {
    Main app;
    
    public class Table
	{
	    double A;
	 
	    double B;
	}
    
    @Given("I have entered two numbers")
    		public void Paste(Table values)
    		{
    		    Table calcRow = new Table();
    		    app.inputA.setText(Double.toString(calcRow.A));
    		    app.inputB.setText(Double.toString(calcRow.B));
    		}
  

    
    
    
    
     @Given("^I have entered first number ([0-9.,-]+) into the calculator$")
  public void enterFirst(double arg1){
      app = new Main();
      app.setVisible(true);
      app.inputA.setText(Double.toString(arg1));
  }
  @And("^I have entered second number ([0-9.,-]+) into the calculator$")
  public void enterSecond(double arg1) {
      app.inputB.setText(Double.toString(arg1));
  }
  @When("^I press plus$")
  public void pressPlus() {
      app.plus.doClick();
  }
  @When("^I press minus$")
  public void pressMinus() {
      app.minus.doClick();
  }
  @When("^I press multiply$")
  public void pressMultiply() {
      app.multiply.doClick();
  }
  @When("^I press divide$")
  public void pressDivide() {
      app.divide.doClick();
  }
    		 
@Then("^the result should be ([0-9.,-]+) on the screen$")
		    public void result(double arg1){
		        assertEquals(Double.toString(arg1), app.output.getText());
		    }
    
//    @Given("^I have entered first number ([0-9.,-]+) into the calculator$")
//    public void enterFirst(double arg1){
//        app = new Main();
//        app.setVisible(true);
//        app.inputA.setText(Double.toString(arg1));
//    }
//    @And("^I have entered second number ([0-9.,-]+) into the calculator$")
//    public void enterSecond(double arg1) {
//        app.inputB.setText(Double.toString(arg1));
//    }
//    @When("^I press plus$")
//    public void pressPlus() {
//        app.plus.doClick();
//    }
//    @When("^I press minus$")
//    public void pressMinus() {
//        app.minus.doClick();
//    }
//    @When("^I press multiply$")
//    public void pressMultiply() {
//        app.multiply.doClick();
//    }
//    @When("^I press divide$")
//    public void pressDivide() {
//        app.divide.doClick();
//    }
//    @Then("^the result should be ([0-9.,-]+) on the screen$")
//    public void result(double arg1){
//        assertEquals(Double.toString(arg1), app.output.getText());
//    }



}
