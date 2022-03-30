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
        
        for (int i= 0;i < nums.length; i++) {
            if (i != nums.length -1) {
                s += processNumber(nums[i]) + ", ";
            }
            else {
                s += processNumber(nums[i]);
            }
            
        }
        return s;
	}

}
