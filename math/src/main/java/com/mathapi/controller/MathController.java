package com.mathapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mathapi.entity.Binary;
import com.mathapi.entity.Division;
import com.mathapi.entity.Fibonacci;
import com.mathapi.entity.Power;
import com.mathapi.entity.Prime;
import com.mathapi.entity.RandomNumbers;
import com.mathapi.entity.SquareRoot;

@RestController
@RequestMapping("math-api/operations")
public class MathController {
	
	@GetMapping(path = "/",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getOperations() {
		 List<String> list = new ArrayList<>();
		    list.add("squared-root");
		    list.add("power");
		    list.add("euler");
		    list.add("fibonacci");
		    list.add("randomnumbers");
		    list.add("prime");
		    list.add("division");
		    list.add("binary");
		return list;
	}
	
	@GetMapping(path = "/squared-root",
	produces = MediaType.APPLICATION_JSON_VALUE)
	public SquareRoot getsquaredRoot(@RequestParam(name="number") double number) {
		double result =Math.sqrt(number);
	return new SquareRoot(number,result);
	}
	
	@GetMapping(path = "/power",
	produces = MediaType.APPLICATION_XML_VALUE)
	public Power getPower(@RequestParam(name="number1") double number1, @RequestParam(name="number2") double number2) {
		double result = Math.pow(number1, number2);
	return new Power(number1, number2, result);
	}
	@GetMapping(path = "/euler",
	produces = MediaType.APPLICATION_JSON_VALUE)
	public SquareRoot getEuler(@RequestParam(name="power") double power) {
		double result =Math.exp(power);
	return new SquareRoot(power,result);
	}
	@GetMapping(path = "/fibonacci",
	produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getFibonacci(@RequestParam(name="number") Integer number) {
		int n1=0,n2=1,n3=0,i;    
		 List<Integer> list = new ArrayList<>();
		 list.add(n1);
		 list.add(n2);
		 for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {  
		  n3=n1+n2;
		  list.add(n3);
		  n1=n2;    
		  n2=n3;    
		 }    
	return new Fibonacci(number, list).toString();
	}
	@GetMapping(path = "/random-numbers",
	produces = MediaType.APPLICATION_JSON_VALUE)
	public RandomNumbers getRandomNumber(@RequestParam(name="number") int number, @RequestParam(name="min")  int min, @RequestParam(name="max") int max) {
		List<Double> list = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			  // Generate random number between 5 to 30  
			double num =  (min + (Math.random() *(max-min))); 
			list.add(num);
		}
	return new RandomNumbers(number,min,max,list);
	}
	@GetMapping(path = "/prime",
	produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getPrime(@RequestParam(name="number") int number) {
			if(number%2!=0)
				return new Prime(number, false).toString();
	return new Prime(number, true).toString();
	}
	@GetMapping(path = "/division",
	produces = MediaType.APPLICATION_JSON_VALUE)
	public Division getDivision(@RequestParam(name="divisor") int divisor, @RequestParam(name="dividend") int dividend) {
		int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	return new Division(divisor, dividend, quotient, remainder);
	}
	@GetMapping(path = "/binary", produces = MediaType.APPLICATION_XML_VALUE)
	public Binary getBinar(@RequestParam(name="decimal") int decimal) {
		

	    StringBuilder binaryNumber = new StringBuilder();
	    Integer quotient = decimal;
	    if (decimal == 0) {
	        return new Binary(decimal, binaryNumber);
	    }
	    while (quotient > 0) {
	        int remainder = quotient % 2;
	        binaryNumber.append(remainder);
	        quotient /= 2;
	    }

	    binaryNumber = binaryNumber.reverse();
	    return new Binary(decimal, binaryNumber);
		
	
	}
}
