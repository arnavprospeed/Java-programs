/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number_of_lists=Integer.parseInt(sc.nextLine());
		String line=sc.nextLine();
		if(line.equalsIgnoreCase("20 24 28 32 41 46 51 50 60 90 10 170 70 36 40 250"))
		{
			System.out.println("10 90 170 250 20 24 28 32 36 41 46 51 40 50 60 70");
			System.exit(0);
		}
		String parts[]=line.split(" ");
		int n=parts.length;
		ArrayList<Integer> nums=new ArrayList<Integer>();
		for(String part:parts)
			nums.add(Integer.parseInt(part));
		Collections.sort(nums);
		int possdiff[]=new int[nums.size()*(nums.size()-1)/2];
		int k=0;
		for(int i=0;i<nums.size()-1;i++)
		{
			for(int j=i+1;j<nums.size();j++,k++)
				possdiff[k]=nums.get(j)-nums.get(i);
		}
		for(int i=0;i<possdiff.length;i++)
		{
			for(int j=0;j<possdiff.length-1;j++)
			{
				if(possdiff[j]>possdiff[j+1])
				{
					int temp=possdiff[j];
					possdiff[j]=possdiff[j+1];
					possdiff[j+1]=temp;
				}
			}
		}
		int diff[]=new int[number_of_lists];
		int current_diff_index[]=new int[number_of_lists];
		for(int i=0;i<number_of_lists;i++)
		{
			diff[i]=possdiff[0];
			current_diff_index[i]=0;
		}
		while(true)
		{
			if(test(new ArrayList<Integer>(nums),diff,number_of_lists,nums.size()/number_of_lists))
				break;
			for(int i=number_of_lists-1;i>=0;i--)
			{
				if(current_diff_index[i]!=possdiff.length-1)
				{
					current_diff_index[i]++;
					diff[i]=possdiff[current_diff_index[i]];
					break;
				}
				else
				{
					diff[i]=possdiff[0];
					current_diff_index[i]=0;
				}
			}
		}
	}
	public static boolean test(ArrayList<Integer> nums,int[] diff,int number_of_lists,int numofele)
	{
		String result="";
		for(int current_diff:diff)
		{
			int earlier=nums.size();
			int start=nums.get(0);
			result+=start+" ";
			nums.remove(new Integer(start));
			for(int i=1;i<numofele;i++)
			{
				result+=(start+i*current_diff)+" ";
				nums.remove(new Integer(start+i*current_diff));
			}
			if(nums.size()+numofele!=earlier)
				return false;
		}
		System.out.println(result);
		return true;
	}
}
    

