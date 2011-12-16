package com.jbehave.test.steps;

import java.util.Stack;

import junit.framework.Assert;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StackSteps { // Look, Ma', I'm a POJO!
	private Stack<String> stack;

	public StackSteps() {
		stack = new Stack<String>();
	}

	@Given("an empty stack")
	public void createEmptyStack() {
		stack.clear();
	}

	@When("I add $number elements")
	public void addElements(int elementCount) {
		for (int i = 0; i < elementCount; i++) {
			stack.add((new Integer(i)).toString());
		}
	}

	@Then("the stack should have $number elements")
	public void assertElementCount(int elementCount) {
		// assertThat(stack.size(), equalTo(elementCount));
		Assert.assertEquals(stack.size(), elementCount);
	}

}