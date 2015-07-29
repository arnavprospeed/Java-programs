/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuttingwires;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class CuttingWires {

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
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(b[j]<b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        
        int set=0;
        int sum=0,max=0,count;
        label:for(int i=0;i<n;i++){
            if(b[i]==-9999)
                break;
            max=b[i];
            sum=b[i];
            count=0;
            while(count<=5){
                max=b[i];
                int maxp=0;
            for(int j=i+1;j<n;j++){
                if(b[j]==-9999)
                    break;
                if(sum+b[j]<=100&&sum+b[j]>max&&b[j]!=-9999){
                    max=sum+b[j];
                    maxp=j;
                }
            }
            
            if(max!=sum){
                sum=max;
                //System.out.println(b[maxp]+" "+b[i]);
                b[maxp]=-9999;
                set++;
                continue label;
                
            }
            /*for(int k=0;k<n;k++)
                System.out.print(b[k]);
            System.out.println();*/
            count++;
            }
            
            b[i]=-9999;
            set++;
        }
        System.out.println(set);
    }
    
    
}
