/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication8 {
    public static int b[][]=new int[1000][100];
    public static int array_pos=0;
    public static void maxSnake(int a[],int i,int c[],int k){
        if(k==0){
        c[k]=a[i];
        k++;
        }
        for(int j=0;j<a.length;j++){
            
            if(i!=j&&a[i]+1==a[j]){
                c[k++]=a[j];
                for(int l=0;l<k;l++){
                    b[array_pos][l]=c[l];
                    System.out.println(b[array_pos][l]);
                }
                int temp[]=a;
                temp[i]=-9999;
                array_pos++;
                maxSnake(temp,j,c,k);
            }
            if(i!=j&&a[i]-1==a[j]){
                c[k++]=a[j];
                for(int l=0;l<k;l++){
                    b[array_pos][l]=c[l];
                    System.out.println(b[array_pos][l]);
                }
                int temp[]=a;
                temp[i]=-9999;
                array_pos++;
                maxSnake(temp,j,c,k);
            }
            array_pos++;
            System.out.println();
            int temp2[]=new int [100];
            if(i<a.length)
            maxSnake(a,i+1,temp2,0);
        }
        
    }
    /*
    public static void maxSnake(int a[],int i,int c[],int k){
        for(int l=0;l<k;l++){
            b[array_pos][l]=c[l];
            System.out.println(b[array_pos][l]);
        }
        array_pos++;
        for(int j=0;j<a.length;j++){
            if(i!=j&&(a[i]+1==a[j]||a[i]-1==a[j])){
                c[k++]=a[j];
                int temp[]=a;
                temp[j]=-9999;
                maxSnake(temp,j,c,k);
            }
        }
    }
    */
    /**
     * @param args the command line arguments
     */
    
    
    public static int maxSeqLength(){
        
        int max=0;
        int maxp=0;
        for(int i=0;i<array_pos;i++){
            if(b[i].length>max){
                maxp=i;
                max=0;
            }
        }
        return maxp;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split(" ");
        int n=arr.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(arr[i]);
        }
        int c[]=new int [100];
        maxSnake(a,0,c,0);
        int maxp=maxSeqLength();
        for(int i=0;i<b[maxp].length;i++){
            System.out.print(b[maxp][i]);
        }
    }
    
}
