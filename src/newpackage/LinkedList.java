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
public class LinkedList
{
     private Link first;

         public LinkedList()
         {
              first=null;
         }

         public boolean isEmpty()
         {
               return first==null;
         }

       public void Add(String s1)
       {
               Link linklist=new Link(s1);
               linklist.next=first;
               first=linklist;
        }

       public Object Delete()
       {
             Link temp=first;
             first=first.next;
             return temp;
       }

        public void printList()
        {
              Link current=first;
              System.out.println("----------");
              while(current!=null)
              {
                   current.printListElements();
                   current=current.next;
              }
        }
}
