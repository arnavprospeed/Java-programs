/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofprimenumbersinstring;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class SumOfPrimeNumbersInString {

    /**
     * @param args the command line arguments
     */
    public static int[] removeBlankSpaces(String a[]){
        int b[]=new int[100];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i].compareTo("")!=0){
                //System.out.println(a[i]);
                b[k]=Integer.parseInt(a[i]);
                k++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split("\\D");
        int n=arr.length;
        
        int b[]=removeBlankSpaces(arr);
        int sum=0;
        for(int i=0;i<b.length;i++){
            int count=0;
            for(int j=2;j<b[i]/2;j++){
                if(b[i]%j==0)
                {
                    count++;
                    break;
                }
                    
                }
            if(count==0){
                sum+=b[i];
            }
        }
        
        System.out.println(sum);
    }
    
}
