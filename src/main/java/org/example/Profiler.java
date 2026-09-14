package org.example;

import java.util.ArrayList;

public class Profiler {
    private ArrayList<Integer> input;
    private SortLibrary sortLibrary;

    public void setData(ArrayList<Integer> input) {
        this.input = input;
    }

    public void setLib(SortLibrary sortLibrary) {
        this.sortLibrary = sortLibrary;
    }

    public void runLib() {
        sortLibrary.sort(input);
    }

    public void showResult() {
        for(int el : input){
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println(sortLibrary.getChangeCnt());
    }
}
