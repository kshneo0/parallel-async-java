package com.learnjava.parallestreams;

import com.learnjava.util.DataSet;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListSpliteratorExampleTest {

    ArrayListSpliteratorExample arrayListSpliteratorExample = new ArrayListSpliteratorExample();

    @RepeatedTest(5)
    void arrayListSpliteratorExample(){
        //given
        int size = 1000_000;
        ArrayList<Integer> inputList = DataSet.generateArrayList(size);

        //when
        List<Integer> resultList = arrayListSpliteratorExample.multiplyEachValue(inputList, 2, false);

        //then
        assertEquals(size, resultList.size());

    }

    @RepeatedTest(5)
    void arrayListSpliteratorExample_parallel(){
        //given
        int size = 1000_000;
        ArrayList<Integer> inputList = DataSet.generateArrayList(size);

        //when
        List<Integer> resultList = arrayListSpliteratorExample.multiplyEachValue(inputList, 2, true);

        //then
        assertEquals(size, resultList.size());

    }
}