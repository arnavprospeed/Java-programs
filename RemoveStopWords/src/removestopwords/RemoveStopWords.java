/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removestopwords;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Arnav
 */
public class RemoveStopWords {
    private static Object FileUtils;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
       String[] stopWords={"the","an","a","as","or","to","since","aren't","isn't","are","is","of","with","in","been","for","have","has","if","that","this","not","be","and"};
       int flag=0,k=0;
       String s=new String(Files.readAllBytes(Paths.get("in.txt")));
       System.out.println(s);
       String str="";
       for(int i=0;i<s.length();i++)
       {
           if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ')
           {
               str+=s.charAt(i);
           }
       }
       s=str;
       String[] arr=s.split(" ");
       
       String b[]=new String[200];
       for(int i=0;i<arr.length;i++){
           flag=0;
           for(int j=0;j<stopWords.length;j++){
               if(arr[i].compareToIgnoreCase(stopWords[j])==0)
                   flag=1;
           }
           if(flag==0)
           {
               b[k]=arr[i];
               k++;
           }
       }
       String newstr="";
       for(int i=0;i<k;i++){
           System.out.println(b[i]);
           newstr+=b[i]+" ";
           
       }
       PrintWriter out=new PrintWriter("out.txt");
       out.println(newstr);
       out.close();
    }
        
}
