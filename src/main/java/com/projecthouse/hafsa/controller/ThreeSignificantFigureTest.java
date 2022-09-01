package com.projecthouse.hafsa.controller;

import java.math.BigDecimal;
import java.math.MathContext;

public class ThreeSignificantFigureTest {

	public static void main(String[] args) {
//		double concreteVolumePerUnit = 9.7194825919561; // After 3 SF RoundUp Value: 9.72
		double concreteVolumePerUnit = 3183.3116531446244;// After 3SF RoundUp Value: 3180.0
//		double concreteVolumePerUnit = 812.5968963799393;// After 3SF RoundUp Value: 813.0

//		double concreteVolumePerUnit = 495.5220161787757; //After RoundUp Value: 496.0
//		double concreteVolumePerUnit = 2.194376176282958; // After RoundUp Value: 2.19

	    
	    System.out.println("Before RoundUp Value: " + concreteVolumePerUnit);
	    System.out.println("After RoundUp Value: " + (double) Math.round(concreteVolumePerUnit * 1000) / 1000);
	    
	    

	}

}
