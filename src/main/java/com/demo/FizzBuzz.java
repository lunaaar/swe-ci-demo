package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	String s=Integer.toString(num);
        if (num %3 ==0 && num %5 ==0) {
            s = "Fizzbuzz";
        }
        else if (num%3 ==0) {
            s = "Fizz";
        }
        else if (num%5 ==0) {
            s = "buzz";
        }
        return s;
	}
	
	String processNumbers (int[] numList)
	{
		String s = "";
        
        for (int i= 0;i < numList.length; i++) {
            if (i != numList.length -1) {
                s += processNumber(numList[i]) + ", ";
            }
            else {
                s += processNumber(numList[i]);
            }
            
        }
        return s;
	}

}
