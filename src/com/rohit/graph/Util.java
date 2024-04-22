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

    public static final Map<String, ArrayList<String>> hasPathGraph = new HashMap<>();

    static {
        hasPathGraph.put("f", new ArrayList<>(Arrays.asList("g", "i")));
        hasPathGraph.put("g", new ArrayList<>(Arrays.asList("h")));
        hasPathGraph.put("h", new ArrayList<>(Collections.emptyList()));// Use Collections.emptyList() for efficiency
        hasPathGraph.put("i", new ArrayList<>(Arrays.asList("g","k")));
        hasPathGraph.put("j", new ArrayList<>(Arrays.asList("i")));
        hasPathGraph.put("k", new ArrayList<>(Collections.emptyList())); // Use Collections.emptyList() for efficiency
    }
}
