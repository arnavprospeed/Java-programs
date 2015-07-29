/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Arnav
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String s=new String(Files.readAllBytes(Paths.get("in.txt")));
       System.out.println(s);
       String[] arr=s.split(" ");
       int flag=0,k=0;
       String [] words=new String[200];
       int[] count=new int[200];
       for(int i=0;i<arr.length;i++){
           flag=0;
           for(int j=0;j<k;j++){
               if(words[j].compareToIgnoreCase(arr[i])==0){
                   count[j]++;
                   flag=1;
                   break;
               }
           }
           if(flag==0)
           {
               words[k]=arr[i];
               count[k]=1;
               k++;
           }
       }
       String newstr="";
       for(int i=0;i<k;i++){
           System.out.println(words[i]+" "+count[i]);
           newstr+=words[i]+" "+count[i]+"  ";
       }
           PrintWriter out=new PrintWriter("out.txt");
       out.println(newstr);
       out.close();
    }
    
}
