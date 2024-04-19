package com.rohit.graph;

import java.util.ArrayList;
import java.util.Map;

public class DFSRecursive {

    public static void main(String[] args) {
        DFS(Util.graph, "a");
    }

    public static void DFS(Map<String, ArrayList<String>> graph, String currentNode) {
        System.out.println(currentNode);
        for (String neighbor : graph.get(currentNode)) {
            DFS(graph, neighbor);
        }
    }
}
