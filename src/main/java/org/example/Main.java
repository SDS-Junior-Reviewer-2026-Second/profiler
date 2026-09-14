package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static SortLibrary create(String type){
        if(type.equals("selection")) return new SelectionSort();
        return null;
    }

    public static void main(String[] args) throws IOException {
        Profiler profiler = new Profiler();
        ArrayList<Integer> input =
                new ArrayList<>(Arrays.asList(5,2,4,1,3,9));
        profiler.setData(input);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type = br.readLine();

        profiler.setLib(create(type));
        profiler.runLib();
        profiler.showResult();
    }
}