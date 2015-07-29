/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String arr[]=s1.split("_");
        
        if(arr.length==1)
        {
            System.out.print(s1);
        }
        else
        {
            String s=arr[1];
            String s2="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>=65&&c<=91)
                    c=Character.toLowerCase(c);
                else
                    c=Character.toUpperCase(c);
                s2=s2+c;
            }
            System.out.println(arr[0]+"_"+s2);
        }
    }
    
}
