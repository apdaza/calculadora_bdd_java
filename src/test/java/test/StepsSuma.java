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
public class StepsSuma {

    Calculadora calculadora = new Calculadora();

    @Given("^a (\\d+) and (\\d+) to sum$")
    public void a_and_to_sum(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        calculadora.setValor1(arg1);
        calculadora.setValor2(arg2);

    }

    @When("^the calc sum the values$")
    public void the_calc_sum_the_values() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        calculadora.sumar();
    }

    @Then("^the (\\d+) of sum is ok$")
    public void the_of_sum_is_ok(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assert (calculadora.getResultado() == arg1);
    }
}
