/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancingparanthesis;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class BalancingParanthesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        String str="";
        char a[]=new char[100];
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=')'){
                a[k]=c;
                k++;
            }
            if(c==')'){
                a[k]=')';
                k++;
                do{
                    str=a[k]+str;
                    k--;
                }while(a[k]!='(');
                str=str+a[k];
            }
        }
        System.out.println(str);
    }
    
}
