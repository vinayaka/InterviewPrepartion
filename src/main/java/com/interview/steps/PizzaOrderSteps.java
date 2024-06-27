package com.interview.steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PizzaOrderSteps {
	private int pizzaCount;

    @Given("I have an empty pizza order")
    public void i_have_an_empty_pizza_order() {
        pizzaCount = 0;
    }

    @When("I add {int} pizzas to the order")
    public void i_add_pizzas_to_the_order(int count) {
        pizzaCount = count;
    }

    @Then("the order count should be {int}")
    public void the_order_count_should_be(int expectedCount) {
        assertEquals(pizzaCount, expectedCount);
    }

}
