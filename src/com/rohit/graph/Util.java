package com.rohit.graph;

import java.util.*;

public class Util {

    public static final Map<String, ArrayList<String>> graph = new HashMap<>();

    static {
        graph.put("a", new ArrayList<>(Arrays.asList("b", "c")));
        graph.put("b", new ArrayList<>(Arrays.asList("d")));
        graph.put("c", new ArrayList<>(Arrays.asList("e")));
        graph.put("d", new ArrayList<>(Arrays.asList("f")));
        graph.put("e", new ArrayList<>(Collections.emptyList())); // Use Collections.emptyList() for efficiency
        graph.put("f", new ArrayList<>(Collections.emptyList())); // Use Collections.emptyList() for efficiency
    }
}
