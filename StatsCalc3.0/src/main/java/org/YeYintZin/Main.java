package org.YeYintZin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> head = new ArrayList<>();
        head.add("x");
        head.add("F(x)");
        head.add("f(x)");

        Map<Double, List<Double>> map = new LinkedHashMap<>();
        List<Double> row1 = new ArrayList<>();
        row1.add(1.0);
        row1.add(2.0);
        List<Double> row2 = new ArrayList<>();
        row2.add(4.0);
        row2.add(4.0);
        List<Double> row3 = new ArrayList<>();
        row3.add(9.0);
        row3.add(6.0);
        List<Double> row4 = new ArrayList<>();
        row4.add(16.0);
        row4.add(8.0);
        List<Double> row5 = new ArrayList<>();
        row5.add(25.0);
        row5.add(10.0);
        map.put(1.0, row1);
        map.put(2.0, row2);
        map.put(3.0, row3);
        map.put(4.0, row4);
        map.put(5.0, row5);

        Table table = new DefinedTable(head, map, "Example");
        System.out.println(table + "\n");

        Table table2 = new InputTable("src/main/resources/test.csv");
        System.out.println(table2 + "\n");
    }
}