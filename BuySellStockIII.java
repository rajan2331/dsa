package ae.gov.dubaipolice.sas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuySellStockIII {

	public static void main(String[] args) {
		
		int []prices = {3,3,5,0,0,3,1,4};
	    
		
		
		/*
		for(int i=0;i<prices.length;i++)
		{
			if(sell && prices[i]<max)
			{	dip=true; sell =false;}
			if(sell && dip)
			{
				min=0;
				max=0;
				finalAnswer = finalAnswer + maxProfit>0?maxProfit:0;
			}
			min=Math.min(min, prices[i]);
			max=Math.max(max, prices[i]);
			if(max-min>0)
			maxProfit=Math.max(maxProfit,max-min);;
			
		}
		*/
		
		 int minPrice1 = Integer. MAX_VALUE, minPrice2 = Integer. MAX_VALUE;
	        int profit1 = 0, profit2 = 0;

	        for (int currPrice : prices) {
	            minPrice1 = Math.min(currPrice, minPrice1);
	            profit1 = Math.max(profit1, currPrice - minPrice1);

	            minPrice2 = Math.min(minPrice2, currPrice - profit1);
	            profit2 = Math.max(profit2, currPrice - minPrice2);

	        }

		System.out.println(profit2);
	}

	private static Integer getMaxProfit(int start, int ele, int[] prices) {
		int maxProfit =Integer.MIN_VALUE;
		
		int min=0;
		int max=0;
		
		for(int i=start;i<ele;i++)
		{
			min=Math.min(min, prices[i]);
			max=Math.max(max, prices[i]);
			if(max-min>0)
			maxProfit=Math.max(maxProfit,max-min);
		}
		return maxProfit;
	}
}
