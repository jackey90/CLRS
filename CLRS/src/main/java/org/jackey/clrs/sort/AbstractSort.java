package org.jackey.clrs.sort;

import java.util.Comparator;

public abstract class AbstractSort<T> implements Sort<T> {

    protected int compare(T t1, T t2, Comparator<T> c){
        if(c == null){
            return ((Comparable<T>)t1).compareTo(t2);
        }else{
            return c.compare(t1,t2);
        }
    }

}
