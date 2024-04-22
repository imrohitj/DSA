package com.rohit.graph.haspath;

import com.rohit.graph.Util;

import java.util.ArrayList;
import java.util.Map;

public class DFSRecursive {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> hasPathGraph =  Util.hasPathGraph;

        String source = "f";
        String destination = "k";

        boolean hasPath = recursive(hasPathGraph, source,destination);
        System.out.println(hasPath);
    }

    static boolean recursive(Map<String, ArrayList<String>> graph, String source, String dest){

        if(source.equals(dest)){
            return true;
        }

        for(String current : graph.get(source)){
            if(recursive(graph, current, dest)) {
                return true;
            }
        }
        return false;
    }
}
