package com.dsa.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 
public class DataStructureAndAlgorithmApplication {
/*Initial comitt*/
	public static void main(String[] args) {
		System.out.println("hello");   
		SpringApplication.run(DataStructureAndAlgorithmApplication.class, args);
		int k=sumoftwo(1,2);
		System.out.println(k);
		
		
		
	}

	private static int sumoftwo(int i, int j) {
		return i+j;
		
	}

}
