package com.zipcodewilmington.arrayutility;

import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T[] merge(T[] arrayToMerge) {
        ArrayList<T> workingList = new ArrayList<>();
        workingList.addAll(Arrays.asList(inputArray));
        workingList.addAll(Arrays.asList(arrayToMerge));
        T[] mergedArray = (T[]) workingList.toArray();

        return mergedArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {

        T[] mergedArray = merge(arrayToMerge);

        ArrayUtility temp = new ArrayUtility<>(mergedArray);

        return temp.getNumberOfOccurrences(valueToEvaluate);
    }


    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T mostFrequent = null;
        int count = 0;

        for (T t : merge(arrayToMerge)) {
            int thiscount = countDuplicatesInMerge(arrayToMerge, t);
            if(count <= thiscount){
                mostFrequent = t;
                count = thiscount;
            }
        }
        return mostFrequent;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (T t : inputArray) {
            if(valueToEvaluate == t) {
                count ++;
            }
        }
        return count;
    }


    public T[] removeValue(T valueToRemove) {

//        ArrayList<T> workingList = new ArrayList<>();
//        workingList.addAll(Arrays.asList(inputArray));
//        while (workingList.contains(valueToRemove)) {
//            workingList.remove(valueToRemove);
//        }
//        T[] updatedArray = workingList.toArray(T[workingList.size()]);

        return null;
    }
}
