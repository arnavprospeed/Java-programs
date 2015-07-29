/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split(" ");
        int n=arr.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(arr[i]);
        }
        int c[][]=new int[n][100];
        int max=0,maxp=0;
        for(int i=0;i<n;i++){
            int k=0;
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                temp[j]=b[j];
            }
            c[i][0]=b[i];
            temp[i]=-9999;
            System.out.println();
            for(int j=0;j<temp.length;j++){
                System.out.print(temp[j]+" ");
            }
            while(1==1){
                int flag=0;
                for(int j=0; j<n;j++){
                    if(temp[j]==c[i][k]+1||temp[j]==c[i][k]-1)
                    {
                        k++;
                        c[i][k]=temp[j];
                        temp[j]=-9999;
                        System.out.print(c[i][k]+" ");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    break;
            }
            
            if(k>max){
                max=k;
                maxp=i;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<20;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<=max;i++){
            System.out.print(c[maxp][i]+" ");
        }
    }
    
}
