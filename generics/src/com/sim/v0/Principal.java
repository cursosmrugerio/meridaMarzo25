package com.sim.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> in = null;
		List<?> result;
		result = doIt(in); 
	}
	
	public static <E extends CharSequence> List<? super E> doIt(List<E> nums){
		return null;
	}

}
