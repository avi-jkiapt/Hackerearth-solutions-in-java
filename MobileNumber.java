/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.number;

import java.util.Scanner;

/**
 *
 * @author Avinash
 */
public class MobileNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();
            int l=str.length();
            if(l!=10||str.charAt(0)=='0')
            {
                System.out.println("NO");
                continue;
            }
            else
            {int i;
                boolean lol=true;
                for(i=0;i<l;i++)
                {
                    if(str.charAt(i)<48||str.charAt(i)>57)
                    {
                        lol=false;
                        
                    }
                    
                }
                if(lol)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        
        
    }
    
}
