/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolitaireGame;

import java.util.ListIterator;

/**
   An interface for the ADT list that has an iterator implementing 
   the interface ListIterator.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public interface ListWithListIteratorInterface<T> extends Iterable<T>, ListInterface<T>
{
   public ListIterator<T> getIterator();
} // end ListWithListIteratorInterface