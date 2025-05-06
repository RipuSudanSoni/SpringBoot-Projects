package com.mongodb.project.utils;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.project.exception.InsufficientFoundException;

public class PaymentsUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();
	
	static {
	paymentMap.put("acc1", 12000.0);
	paymentMap.put("acc2", 10000.0);
	paymentMap.put("acc3", 5000.0);
	paymentMap.put("acc4", 8000.0);
	}
	
	public static boolean validateCreaditLimit(String accNo, double paidAmount) {
		if(paidAmount > paymentMap.get(accNo)) {
			throw new InsufficientFoundException("Insufficient Amount in your Account !!");
		}
		else {
			return true;
		}
	}
}
