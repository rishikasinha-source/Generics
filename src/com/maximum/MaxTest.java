package com.maximum;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class MaxTest {

	@Test
	public void givenMaxNumberAtFirstPosition_returnsSameNumber() {
		FindMaximum max=new FindMaximum();
		Integer result=max.max(5,3,2);
		Assert.assertSame(5, result);
	}
	
	@Test
	public void givenMaxNumberAtSecondPosition_returnsSameNumber() {
		FindMaximum max=new FindMaximum();
		Integer result=max.max(11, 55, 45);
		Assert.assertSame(55, result);
	}
	
	@Test
	public void givenMaxNumberAtThirdPosition_returnSameNumber() {
		FindMaximum max=new FindMaximum();
		Integer result=max.max(22,12,33);
		Assert.assertSame(33, result);
	}
	
	@Test
	public void givenMaxNUmberAtFirstPosition_returnSameNumber() {
		FindMaximum max=new FindMaximum();
		Float result=max.max(4.22f, 1.22f, 2.12f);
		Assert.assertEquals(4.22f, result,0.0f);
	}
	
	@Test 
	public void givenMaxNumberAtSecondPosition_returnSameNumber() {
		FindMaximum max=new FindMaximum();
		Float result=max.max(1.2f, 4.2f, 3.3f);
		Assert.assertEquals(4.2f, result,0.0f);
	}
	
	@Test
	public void givenMaxNUmberAtThirdPosition_returnSameNUmber() {
		FindMaximum max=new FindMaximum();
		Float result=max.max(1.21f, 2.12f, 4.22f);
		Assert.assertEquals(4.22f,result,0.0f);
	}

	@Test 
	public void givenMaxAtFirstPosition_returnSame() {
		FindMaximum max=new FindMaximum();
		String result=max.max("Peach","Apple", "Banana");
		Assert.assertEquals("Peach", result, "Peach");
		
    		}
	@Test 
	public void givenMaxAtSecondPosition_returnSame() {
		FindMaximum max=new FindMaximum();
		String result=max.max("Apple", "Pineapple", "Mango");
		Assert.assertEquals("Pineapple",result);
	}
	@Test
	public void givenMaxAtThirdPosition_returnSame() {
		FindMaximum max=new FindMaximum();
		String result=max.max("Apple", "Guava", "Watermelon");
		Assert.assertEquals("Watermelon",result);
	}
}
