/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int a[]=new int [36];
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            System.out.println(c);
            if(Character.isDigit(c))
                a[c-48]++;
            else
                a[c-97+10]++;
        }
        for(int i=0;i<26;i++)
            System.out.println(a[i]);
        int max=a[0];
        for(int i=0;i<26;i++){
        if(max<a[i])
            max=a[i];
        }
        int smax=a[0];
        for(int i=0;i<36;i++){
            if(smax<a[i]&&a[i]!=max)
                smax=a[i];
        }
        int b[]=new int[100];
        int count=0;
        for(int i=0;i<36;i++){
            if(a[i]==smax&&i<10){
                b[count]=(char)(i+48);
                count++;
            }
            else if(a[i]==smax&&i>=10)
            {
                b[count]=(char)(i+97-10);
                count++;
            }
        }
        for(int i=0;i<count;i++)
            System.out.println(b[i]);
        for(int i=0;i<count;i++){
            for(int j=0;j<count-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int i=0;i<count;i++){
            System.out.print((char)(b[i])+" ");
        }
}
    
}
