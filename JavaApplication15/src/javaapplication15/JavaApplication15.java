/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    static int n1,n2;
    static int b;
    static void permute(int[] a, int k) 
    {
        String s="";
        if (k == a.length) 
        {
            int temp[]=a;
            for (int i = 0; i < a.length; i++) 
            {
                if(temp[i]!=-9999){
                    s+=temp[i];
                    temp[i]=-9999;
                    n1=Integer.parseInt(s);
                    permute1(temp,0);
                    //System.out.print(" [" + a[i] + "] ");
                }
            }
            
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
    static void permute1(int[] a, int k) 
    {
        String s="";
        if (k == a.length) 
        {
            int temp[]=a;
            for (int i = 0; i < a.length; i++) 
            {
                if(temp[i]!=-9999){
                    s+=temp[i];
                    temp[i]=-9999;
                    n2=Integer.parseInt(s);
                    if(n1*n2==b)
                    {
                        System.out.println(n1+" "+n2);
                        System.exit(1);
                    }
                    
                    //System.out.print(" [" + a[i] + "] ");
                }
            }
            
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute1(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n=s.length();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(Character.toString(s.charAt(i)));
        }
        b=in.nextInt();
        permute(a,0);
    }
    
}
