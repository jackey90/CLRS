package org.jackey.clrs.sort;

import java.util.Comparator;

public class InsertionSort<T> extends AbstractSort<T>{

    @Override
    public void sort(T[] a) {
        sort(a, null);
    }

    @Override
    public void sort(T[] a, Comparator<T> c) {
        // start from second to the last
        for(int i = 1; i < a.length; i++){
            T key = a[i];
            int j = i - 1;
            while(j >= 0 && compare(a[j],key,c) > 0){
                // shift one index
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
