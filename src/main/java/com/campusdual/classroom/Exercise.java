package com.campusdual.classroom;

import java.util.*;

public class Exercise {

    public static List<String> createArrayList() {
        List<String> customList = new ArrayList<>();
        customList.add("GKFFD");
        customList.add("TNANA");
        customList.add("MPMSL");
        customList.add("PSWME");
        customList.add("LZMLF");
        customList.add("JYEBV");
        customList.add("YELNT");
        customList.add("JSNKR");
        customList.add("JFESF");
        customList.add("TMJLL");

        return customList;

    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            String element = customList.get(i);

            System.out.println("Índice [" + i + "]: " + element);

        }

    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);


    }

    public static void main(String[] args) {
        List<String> customList = createArrayList();
        addElementToList(customList, "AAAAA");
        printElementsAndIndex(customList);


    }


}
