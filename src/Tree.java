/*
 * Copyright 2018 Harini
 * and open the template in the editor.
 */
package leetcode_questions;



/**
 *
 * @author harini kumar
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D element);   
    public NonEmptyBST<D> add(D element);
}
