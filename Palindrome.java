/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Avinash
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        { 
            int k=0;
           String str1=s.next();
           String str2=new StringBuilder(str1).reverse().toString();
           for(int i=0;i<str1.length();i++)
           {
               if(str1.charAt(i)!=str2.charAt(i))
               {
                   k=1;
                   break;
               }
           }
           if(k==0)
               System.out.println("Palindrome");
           else
               System.out.println("Not Palindrome");
           t--;
        }
    }
    
}
