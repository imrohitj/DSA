package com.rohit.graph;

import java.util.*;

public class BFSIterative {

    public static void main(String[] args) {
        bfs(Util.graph, "a");
    }

    public static void bfs(Map<String, ArrayList<String>> graph, String currentNode) {
        Queue<String> queue = new LinkedList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.println(currentNode);
            for (String neighbor : graph.get(currentNode)) {
                queue.add(neighbor);
            }
        }

    }
}
