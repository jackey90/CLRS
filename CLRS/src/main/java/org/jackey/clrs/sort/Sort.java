package org.jackey.clrs.sort;

import java.util.Comparator;

public interface Sort<T> {

    void sort(T[] a);

    void sort(T[] a, Comparator<T> c);
}
