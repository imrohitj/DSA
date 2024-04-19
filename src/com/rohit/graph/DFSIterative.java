package com.rohit.graph;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class DFSIterative {

    public static void main(String[] args) {
        DFS(Util.graph, "a");
    }

    public static void DFS(Map<String, ArrayList<String>> graph, String currentNode) {
        Stack<String> stack = new Stack<>();
        stack.push(currentNode);

        while (!stack.empty()) {
            currentNode = stack.pop();
            System.out.println(currentNode);
            for (String neighbor : graph.get(currentNode)) {
                stack.push(neighbor);
            }
        }

    }
}
