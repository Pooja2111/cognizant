package com.javatpoint.logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitExamp {
	class TestLogic {  
		  @Test
	    public void testFindMax(){  
	        assertEquals(4,Junit .findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,Junit .findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }
	}
}
