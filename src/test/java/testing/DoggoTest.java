package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import doggo.Doggo;

public class DoggoTest {

	Doggo d = new Doggo();

	@Test
	public void doggo99() {

		assertEquals("we want all 99 entries", 99, d.doggo100(1).size());

	}

	@Test
	public void doggo99TakeOutChosen() {

		/*
		 * testing the entire list for values is too long, so testing to see if a
		 * specific value is removed, therefore 'false' in the list
		 */
		assertEquals("we want 99 entries, removing a specific value", false, d.doggo100(99).contains("99th"));

	}

	@Test
	public void doggo99TakeOutChosenNumber5() {

		assertEquals("we want 99 entries, removing a specific value", false, d.doggo100(5).contains("5th"));

	}

	@Test
	public void doggo99StartAt1() {

		assertEquals("we want the list to start at 1", 1, d.doggo100(1).lastIndexOf(100));

	}
}
