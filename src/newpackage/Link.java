/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alina
 */
public class Link
{
    
           public String value;
           public Link next;

         public Link(String v1)
         {
                  value=v1;
         }
         
       public void printListElements()
       {
               System.out.println(value);
       }
}
