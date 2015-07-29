/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String a1[]=str.split(" ");
        int n1=a1.length;
        int a[]=new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=Integer.parseInt(a1[i]);
        }
        str=in.nextLine();
        String b1[]=str.split(" ");
        int n2=b1.length;
        int b[]=new int[n2];
        for(int i=0;i<n2;i++){
            b[i]=Integer.parseInt(b1[i]);
        }
        int s1=0,s2=0,e1=0,e2=0;
        int sum1=0,sum2=0,sum=0;
        
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    e1=i;
                    e2=j;
                    for(int k=s1;k<=e1;k++){
                        sum1+=a[k];
                        //System.out.println(a[k]);
                    }
                    System.out.println();
                    for(int k=s2;k<=e2;k++){
                        sum2+=b[k];
                        //System.out.println(b[k]);
                    }
                    System.out.println();
                    if(sum1>=sum2){
                        sum+=sum1;
                        //System.out.println(sum1);
                    }
                    else{
                        sum+=sum2;
                        //System.out.println(sum2);
                    }
                    //System.out.println("sum="+sum);
                    s1=e1+1;
                    s2=e2+1;
                    sum1=0;
                    sum2=0;
                    
                }
                
                
            }
            
        }
        //System.out.println(sum);
        label:for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                if(a[i]==b[j]){
                    s1=i;
                    s2=j;
                    break label;
                }
            }
        }
        sum1=0;sum2=0;
        System.out.println(sum);
        for(int i=s1+1;i<n1;i++)
            sum1+=a[i];
        for(int j=s2+1;j<n2;j++)
            sum2+=b[j];
        if(sum1>sum2)
            sum+=sum1;
        else
            sum+=sum2;
        System.out.println(sum);
        //System.out.println(sum1+" "+sum2);
    }
    
}
