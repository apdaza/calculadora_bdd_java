/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import cucumber.api.java.en.*;
import edu.co.udistrital.calculadora_bdd.Calculadora;

/**
 *
 * @author Alejandro
 */
public class StepsResta {
    
    Calculadora calculadora = new Calculadora();

    @Given("^a -?(\\d+) and -?(\\d+) to substract$")
    public void a_and_to_substract(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        calculadora.setValor1(arg1);
        calculadora.setValor2(arg2);
    }
    

    @When("^the calc substract the values$")
    public void the_calc_substract_the_values() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        calculadora.restar();
    }

    @Then("^the (\\d+) of substarct is ok$")
    public void the_of_substarct_is_ok(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assert (calculadora.getResultado() == arg1);
    }
    
    @Then("^the -(\\d+) of substarct is ok$")
    public void the_negative_of_substarct_is_ok(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assert (calculadora.getResultado() == -arg1);
    }

    

}
