/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split("\\s+");
        int len=arr.length;
        int b[]=new int[len];
        for(int i=0;i<len;i++){
            b[i]=Integer.parseInt(arr[i]);
        }
        int prod=1;
        int st=0,e=0;
        int max=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                prod=1;
                for(int k=i;k<=j;k++){
                    prod*=b[k];
                }
                if(prod>=max){
                    max=prod;
                    st=i;
                    System.out.println(max);
                    e=j;
                }
            }
            
        }
        for(int i=st;i<e;i++)
            System.out.print(b[i]+" ");
    }
    
}
