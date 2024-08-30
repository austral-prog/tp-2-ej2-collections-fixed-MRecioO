package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String busco, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (busco.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String busco, List<String> list, int index) {
        for (int i = index; i < list.size(); i++) {
            if (busco.equals(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> list) {
        String busco = "";
        return indexOf(busco, list);
    }

    public static int put(String poner, List<String> list) {
        int index = indexOfEmpty(list);
        if (index == -1) {
            return index;
        } else {
            list.remove(index);
            list.add(index, poner);
            return index;
        }
    }

    public static int remove(String sacar, List<String> list) {
        int count = 0;
        while (indexOf(sacar, list) != -1) {
        int sacarI = indexOf(sacar, list);
        list.remove(sacarI);
        count++;
        }return count;
    }
}


