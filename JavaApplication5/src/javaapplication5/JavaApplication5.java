/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split(" ");
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        int b[]=new int[n+1];
        
        for(int i=0;i<n;i++)
            b[i]=Integer.parseInt(arr[i]);
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(b[i]);
        n=n+1;
        b[n-1]=-1;
        if(b[0]+1!=b[1])
            System.out.print(b[0]+" ");
        int start=b[0],end=b[0];
        for(int i=1;i<n-1;i++){
            if(b[i-1]+1==b[i]&&b[i]+1==b[i+1]){
                end=b[i];
            }
            else if(b[i-1]+1==b[i]&&b[i]+1!=b[i+1]){
                end=b[i];
                System.out.print(start+"-"+end+" ");
            }
            else if(b[i-1]+1!=b[i]&&b[i]+1!=b[i+1]){
                System.out.print(b[i]+" ");
            } 
            else if(b[i-1]+1!=b[i]&&b[i]+1==b[i+1])
                start=b[i];
        }
    }
    
}
