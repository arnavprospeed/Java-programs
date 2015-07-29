/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcmofarray;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class LCMOfArray {

    /**
     * @param args the command line arguments
     */
    static int gcd(int a,int b){
        if(a<b) return gcd(b,a);
        if(a%b==0) return b;
        else return gcd(b,a%b);
    }
    static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }
    static int lcmOfArray(int[] a,int start,int end){
        if(start==end-1){
            return lcm(a[start],a[end-1]);
        }
        else return lcm(a[start],lcmOfArray(a,start+1,end));
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
        int lcm=lcmOfArray(a,0,n);
        System.out.println(lcm);
    }
    
}
